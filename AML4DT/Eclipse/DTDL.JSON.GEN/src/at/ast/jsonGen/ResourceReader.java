package at.ast.jsonGen;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.mwe.Reader;

import DTML.DTMLPackage;

public class ResourceReader extends Reader {

	@Override
	public void preInvoke() {
		super.preInvoke();
		EPackage.Registry.INSTANCE.put(DTMLPackage.eNS_URI, DTMLPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("dtml", new XMIResourceFactoryImpl());
	}
}
