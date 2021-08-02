package com.javaex.io.charstream;

import java.io.File;
import java.util.Scanner;

public class ScannerEx {
	 static final String rootPath= 
			 System.getProperty("usere.dir")+"\\files\\";
     static final String filename= rootPath + "thieves.txt";
	public static void main(String[] args) {
		File file= new File(filename);
		 try {
			 Scanner scanner = new Scanner(file);
			 String name;
			 float height;
			 float weightl;
			 while(scanner.hasNextLine()) { // 남은 라인이 있는가?
				 name = scanner.next(); // 문자열 읽기
				 height = scanner.nextFloat(); // Float 읽기
				weightl= scanner.nextFloat(); //float 읽기
				System.out.printf("%s, 키:%.2ㄹ, 체중:^,2f%n",
						name ,height, weightl);
				scanner.nextLine();
				
			 }
			 scanner.close();
		 }catch (Exception e) {
			 e.printStackTrace();
		 }
		

	}

}
