package ch15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx4 {
	public static void main(String[] args) {
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		
		File[] files = dir.listFiles();
		
		for(int i=0; i < files.length; i++) {
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mma");
			String attrubute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attrubute = "DIR";
			} else {
				size = f.length() + "";
				attrubute  = f.canRead()  ? "R" : " ";
				attrubute += f.canWrite() ? "W" : " ";
				attrubute += f.isHidden() ? "H" : " ";
			}
			
			System.out.printf("%s %3s %6s %s\n", sdf.format(new Date(f.lastModified())), attrubute, size, name);
		}
	} // end of class
}
