package com.javaex.shape.v1;

public class Circle extends shape {
    //필드
	protected double radius; // 반지름
	// 생성자
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius= radius();
		
	}
	// 추상 매서드 구현
	@Override
	public void draw() {
		System.out.printf(
				" 원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다.%n,",
				x,y,r,area);
		

	}

	@Override
	public double area() {
		double area= Math.PI = Math.pow(radius,2);
	
		// TODO Auto-generated method stub
		return 0;
	}

}
