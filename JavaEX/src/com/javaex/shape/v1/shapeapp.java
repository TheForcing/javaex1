package com.javaex.shape.v1;

public class shapeapp {

	public static void main(String[] args) {
		
		//Shape s= new Shape(;)// 추상 클래스틑 객체화 할수 없다.
		Rectangle r1= new Rectangle(10,10,100,50);
		r1.draw();
		
		Circle c1= new Circle(10,20,30);
		c1.draw(); 
		

	}

}
