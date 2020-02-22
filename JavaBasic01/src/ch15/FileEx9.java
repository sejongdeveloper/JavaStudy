package ch15;

import java.io.File;

public class FileEx9 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage: java FileEx9 DIRECTORY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] list = dir.listFiles();
		
		for(int i=0; i<list.length; i++) {
			String fileName = list[i].getName();
			System.out.println("1:"+fileName);
			// 파일명
			
			String newFileName = "0000" + fileName;
			System.out.println("2:"+newFileName);
			System.out.println("newFileName.length():"+newFileName.length());
			
			newFileName = newFileName.substring(newFileName.length() - 7);
			System.out.println("3:"+newFileName);
			//list[i].renameTo(new File(dir, newFileName));
		}
	} // end of main
}
