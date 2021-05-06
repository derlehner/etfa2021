package at.ast.jsonGen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.management.RuntimeErrorException;

import org.eclipse.emf.common.util.URI;

public class PushModels {
	public static final String INPUT_FOLDER = ".\\..\\..\\..\\showcase-implementation\\typeInstances\\TestCases";
	public static final String OUTPUT_FOLDER = "./../models/testcases";
	
	public static void main(String[] args) {
		System.out.println("Pulling models from " + INPUT_FOLDER);
		String fileName = "/test.xmi";
		try {
		copyFileUsingStream(INPUT_FOLDER + fileName, OUTPUT_FOLDER + fileName);
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	private static void copyFileUsingStream(String inputFile, String outputFile) throws IOException {
		File source = new File(URI.createURI(inputFile).toString());
		File dest = new File(URI.createURI(outputFile).toString());
		InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    }catch(Exception ex) {
	    	if(is != null) {
	    		is.close();
	    	}
	    	if(os != null) {
	    		os.close();
	    	}
	    	throw new RuntimeException(ex);
	    }
	}

}
