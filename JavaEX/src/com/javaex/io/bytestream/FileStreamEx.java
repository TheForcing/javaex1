package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStreamEx {
	 static final String rootPath= System.getProperty("usere.dir")+"\\files\\";
	 static String filename= rootPath + "char.txt";
	 
	
	
	static String source= rootPath + "img.jpg";
	static String target= rootPath + "img_copy.jpg";
	
	try {
		is= new FileInputStream(sourece);
		os= new FileOutputStream(target);
		
		int data= 0;
		whild ((data= is.reat())) != -1) {
			os.write(data);
			
		}
		System.out.println("파일을 복사했습니다!");
		
	}catch (FileNotFoundException e) {
		System.err.println("파일을 찿ㅈ을 수 없습니다.");
		
	}catch (IOException e) {
		e.printStackTrace();
	} catch(Exception e) {
		
	} finally {
		try {
			os.close();
			is.close();
			
		}catch (Exception e) {
			
		}
	}
	
	

}
