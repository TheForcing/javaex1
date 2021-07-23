package com.javaex.oop.staticmember;

public class Singleton {
	//static  
	private static Singleton instance = new Singleton();
	
	
	//생성자
	public Singleton () {
		// 외부에서 new 인스턴스 생성 불가
		
	}
	public static Singleton getInstance() {
		return instance;
	}
   
}
