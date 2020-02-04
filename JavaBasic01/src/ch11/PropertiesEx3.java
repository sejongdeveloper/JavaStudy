package ch11;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesEx3 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		String path = PropertiesEx3.class.getResource("").getPath();
		String path2 = "C:\\ide\\eGovFrameDev-3.8.0-64bit\\GitHub\\JavaStudy\\JavaBasic01\\src\\ch11\\";
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream(path2+"output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream(path2+"output.xml"), "Properties Example");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main의 끝
}
