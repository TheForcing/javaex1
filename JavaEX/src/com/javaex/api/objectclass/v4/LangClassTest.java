package com.javaex.api.objectclass.v4;

public class LangClassTest {

	public static void main(String[] args) {
		Point p= new Point(10,20);
	    Point p2= new Point(10,20);
	    
	    System.out.println("p와 p2는 같은 객체인가?"+ (p==p2));
	    // == 은 참조 주소 비교
	    // .equals() 내부 값의 비교
	    System.out.println("p와p2는 같은 값을 가졌는가?"+p.equals(p2));
	     
	}

}
