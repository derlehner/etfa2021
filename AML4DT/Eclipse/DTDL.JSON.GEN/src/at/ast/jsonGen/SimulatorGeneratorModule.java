package at.ast.jsonGen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import at.ast.jsonGen.SimulatorGenerator;

public class SimulatorGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "DTML";
	}

	@Override
	protected String getFileExtensions() {
		return "dtml";
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return SimulatorGenerator.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

	public Class<? extends IEncodingProvider> bindIEncodingProvider() {
		return Utf8EncodingProvider.class;
	}

}
