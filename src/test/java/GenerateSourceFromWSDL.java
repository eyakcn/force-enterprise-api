import java.io.File;
import java.io.IOException;

import com.sforce.ws.template.TemplateException;
import com.sforce.ws.tools.wsdlc;
import com.sforce.ws.wsdl.WsdlParseException;

public class GenerateSourceFromWSDL {
	public static void main(String[] args) throws WsdlParseException, IOException, TemplateException {
		System.setProperty("del-temp-dir", "false");
		String[] arguments = new String[3];
		
		String wsdlPath = ClassLoader.getSystemResource("force_enterprise.wsdl").getPath();
		arguments[0] = wsdlPath;
		arguments[1] = System.getProperty("java.io.tmpdir") + "force_enterprise.jar";
		int index = wsdlPath.indexOf("/target/test-classes/");
		arguments[2] = wsdlPath.substring(0, index + 1) + "src/main/java";
		
		File originJar = new File(arguments[1]);
		originJar.delete();
		File originSource = new File(arguments[2] + "/com");
		deleteDirectory(originSource);
		wsdlc.main(arguments);
		
		System.err.println("The code format is terrible, please format the whole package by Eclipse before deployment!");
	}
	
	public static boolean deleteDirectory(File path) {
		if (path.exists()) {
			File[] files = path.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					deleteDirectory(files[i]);
				} else {
					files[i].delete();
				}
			}
		}
		return (path.delete());
	}
}
