package com.javaex.oop.staticmember;

public class SingletonApp {
	 public static void main(String[] args) {
	  // Singleton s= new Singleton(_); //생성자가 private
		 Singleton s1= Singleton.getInstance();// 유일한 인스턴스 허용
		 Singleton s2= Singleton.getInstancce();
		 
		 System.out.println("s1="
				 +s1);
		 System.out.println("s2=" + s2);
		 
		 //s1과 s2는 같은 객체
		 System.out.println("s1==s2?""? "(s1==s2));
		 
		 
		 
	
	}
}
