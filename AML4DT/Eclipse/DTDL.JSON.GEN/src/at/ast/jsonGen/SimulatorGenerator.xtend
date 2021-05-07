package at.ast.jsonGen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import DTML.*
import java.util.List
import DTML.impl.RelationshipInstanceImpl

class SimulatorGenerator implements IGenerator {
	// Helper functions
	def dispatch serialize(DTMI dtmi){
		'''«dtmi.scheme»:«dtmi.path»;«dtmi.version»'''
	}
	
	def dispatch serialize(DTElement ic){
		'''
		«IF ic.displayName !== null»
		"displayName": "«ic.displayName»",
		«ENDIF»
		«IF ic.comment !== null»
		"comment": "«ic.comment»",
		«ENDIF»
		«IF ic.description !== null»
		"description": "«ic.description»",
		«ENDIF»
		«IF ic.id !== null»
		"@id": "«ic.id.serialize»",
		«ENDIF»
		'''
	}
	// Generator functions

	
	def dispatch generateJson(Interface interf){
		'''
		   "@type": "Interface",
		   «(interf as DTElement).serialize»
		   «IF interf.contents.size > 0»
		   "contents":[
		   «FOR i : 0..<interf.contents.size»
		   «var cont = interf.contents.get(i)»
		   		{
		   		«cont.generateJson»
		   		}«if(i < interf.contents.size - 1) ''','''»
		   «ENDFOR»
		   ],
		   «ENDIF»
		   "@context": "dtmi:dtdl:context;2"
		'''
	}
	
	def dispatch generateJson(Relationship rel){
		'''
		"@type": "Relationship",
		«(rel as DTElement).serialize»
		«IF rel.target !== null»
		"target": "«rel.target.id.serialize»",
		«ENDIF»
		«IF rel.maxMultiplicity >= 0»
		"maxMultiplicity": «rel.maxMultiplicity»,
		«ENDIF»
		"minMultiplicity": «rel.minMultiplicity»,
		"writable": «rel.writable»,
		«IF rel.properties !== null»
		"properties": [
			«FOR i : 0..<rel.properties.size»
				«var prop = rel.properties.get(i)»
				{
				«prop.generateJson»
				}«if(i < rel.properties.size - 1) ''','''»
			«ENDFOR»
		],
		«ENDIF»
		"name": "«rel.name»"
		'''
	}
	
	
	
	def dispatch generateJson(Component comp){
		'''
		"@type": "Component",
		"name": "«comp.name»",
		«(comp as DTElement).serialize»
		"schema": "«comp.schema.id.serialize»"
		'''
	}
	
	def dispatch generateJson(Telemetry tel){
		'''
		"@type": [
			"Telemetry"«IF tel.type !== Type.NONE»,
			"«tel.type»"«ENDIF»
		],
		"schema": "«tel.schema»",
		«(tel as DTElement).serialize»
		«IF tel.unit !== null»
		"unit": "«tel.unit»",
		«ENDIF»
		"name": "«tel.name»"
		'''
	}
	
	def dispatch generateJson(Property prop){
		'''
		"@type": [
			"Property"«IF prop.type !== Type.NONE»,
			"«prop.type»"«ENDIF»
		],
		"schema": "«prop.schema»",
		«(prop as DTElement).serialize»
		«IF prop.unit !== null»
		"unit": "«prop.unit»",
		«ENDIF»
		"name": "«prop.name»"
		'''
	}
	
	def dispatch generateJson(Command com){
		'''
		"@type": [
			"Command"
		],
		«(com as DTElement).serialize»
		«IF com.request !== null»
		"request": «com.request.get(0).generateJson»,
		«ENDIF»
		«IF com.response !== null»
		"response": «com.request.get(0).generateJson»,
		«ENDIF»
		"name": "«com.name»"
		'''
	}
	
	def dispatch generateJson(CommandPayload cp){
		'''
		{
			«IF cp.displayName !== null»
			"displayName": "«cp.displayName»",
			«ENDIF»
			«IF cp.comment !== null»
			"comment": "«cp.comment»",
			«ENDIF»
			«IF cp.description !== null»
			"description": "«cp.description»"
			«ENDIF»
			"name": "«cp.name»",
			"schema": "«cp.schema»"
		}'''
	}
	
	def dispatch generateJson(DigitalTwin dt){
		'''
		   "dtid": "«dt.name»",
		   "content": {
		   	«FOR cont : dt.contents»
		   	«IF cont.class != RelationshipInstanceImpl»
		   		«cont.serialize»,
		   	«ENDIF»
		   	«ENDFOR»
		   	"$metadata": {
		   		"$model": "«dt.type.id»"
		   	 }
		   }, 
		   "relationships": [
		   	«FOR cont : dt.contents»
		   	«IF cont.class == RelationshipInstanceImpl»
		   	 {
		   	 	«cont.serialize»
		   	 }
		   	«ENDIF»
		   	«ENDFOR»
		   ]
		'''
	}
	
	def dispatch serialize(RelationshipInstance relInst){
		'''
		   "id": "«relInst.name»",
		   "content": {
		   	"$targetId": "«relInst.target.name»",
		   	"relationshipName": "«relInst.type.name»"
		   }
		'''
	}
	
	def dispatch serialize(PropertyInstance propInst){
		'''"«propInst.name»": "«propInst.value»"'''
	}
	
	def dispatch serialize(ComponentInstance compInst){
		'''
		   "«compInst.type.name»": {
		   	"$metadata": {},
		   	«FOR i : 0..<compInst.contents.size»
				«var cont = compInst.contents.get(i)»
				«cont.serialize»
				«if(i < compInst.contents.size - 1) ''','''»
			«ENDFOR»
		   }
		'''
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val root = input.contents.findFirst[o|o instanceof DigitalTwinEnvironment] as DigitalTwinEnvironment
		// generate model json files
		root.types.filter[o|o instanceof Interface].forEach[o|
			val temp = o as Interface
			val content = '''
				{
					«temp.generateJson»
				}
				'''
			//fsa.generateFile('''«input.URI.trimFileExtension.lastSegment».json''', content)
			fsa.generateFile('''«temp.displayName».json''', content)
			
		]
		// generate twin json files
		root.instances.filter[o|o instanceof DigitalTwin].forEach[o|
			val temp = o as DigitalTwin
			val content = '''
				{
					«temp.generateJson»
				}
				'''
			//fsa.generateFile('''«input.URI.trimFileExtension.lastSegment».json''', content)
			fsa.generateFile('''«temp.name».json''', content)
			
		]
	}
	
	/*override doGenerate(Resource input, IFileSystemAccess fsa) {
		val interface = input.contents.findFirst[o|o instanceof Interface] as Interface
		val content = '''
			{
				«interface.generateJson»
			}
			'''
		fsa.generateFile('''«input.URI.trimFileExtension.lastSegment».json''', content)
	}*/
}