package com.javaex.opp.point.v1;

public class Point {
	// 필드
	private int x;
	private int y;
	
	//getters/Setters
	public int getX() {
		return x;
	}
    public void setX() {
    	this.x= x;
    	}
    public int getY() {
    	return y;
    }
	public void setY() {
		this.y=y;
		
	}
	// 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n"
				,x ,y);
				
	}
}

