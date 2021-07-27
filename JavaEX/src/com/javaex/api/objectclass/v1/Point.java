package com.javaex.api.objectclass.v1;

import com.javaex.api.objectclass.v3.Point;

//v1. 모든 클래스의 최상의 부모는 Object이다.
//  toString: 객체를 문자열로 출력할때 호출되는 매서드
// Cloneable 인터페이스르 구현 해야한다.
public class Point implements Clonable {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
   public String toString() {
      //객체 출력 포맷을 리턴
		return String.format(
				"Point(%d,%d)", x,y);
		
	}
	@Override
	public boolean equals(Object obj) {
		//전달받은 object가 Point 클레스의 객체?
		if (obj instanceof Point) {
			// 캐스팅 가능
			Point other = (Point)obj;
			return x == other.x && y == other.y;
			
		}
		return super.equals(obj);
	}
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

