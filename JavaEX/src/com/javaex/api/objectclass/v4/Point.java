package com.javaex.api.objectclass.v4;

//v1. 모든 클래스의 최상의 부모는 Object이다.
//  toString: 객체를 문자열로 출력할때 호출되는 매서드
// Cloneable 인터페이스르 구현 해야한다.
public class Point implements Clonable {
     // 객체 복사 시스템
	public Point(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	Point p= new Point(10,20);
	Point p2= p;
	System.out.println("p="+p);
	System.out.println("p2="+p2);
	
	//p2를 변경
	p2.x=100;
	System.out.println("p2="+p2);
	//참조 복제는 같은 객체 참조
	//복제 객체를 생성하는 매서드
	public Point getClone( ) {
		Point clone= null;
	// try{
    //  clone=(Point)clone(); clone() 매서드는 checked
 //} catch (CloneNo1SuppertedException e) {
		// e.printStackTrace()
		
		clone=(Point)clone();
	}
	
	
}