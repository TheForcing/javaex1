package com.javaex.quiz02;

public class Quiz02_1 {
	private static void main(String[] args) {
		int a= 3;
		int b= 6;
		char c= 'A';
	    
		boolean s1= a%2==0;
		boolean s2= b%3==0;
		boolean r1= s1&&s2;
		
		System.out.println("a는 짝수입니까?" + (a%2==0));
		System.out.println("b는 3의 배수입니까"+ (b%3==0));
		System.out.println("s1&&s2:" + r1);
		char r2= (char)(c+4);
		System.out.println(r2);
		
	
		
	}	
}