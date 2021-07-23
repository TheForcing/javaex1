package com.javaex.shape.v2;

public class Point implements Drawable {
  //필드
	protected int x;
	protected int y;
	
	//생산자
	public Point(int x, int y) {
		this.x= x;
		this.y= y;
		
	} // 인터페이스 메서드 구현
	@Override
	public void draw() {
		System.out.printf("점[x=%d, y%d]을 ")
	}
}
