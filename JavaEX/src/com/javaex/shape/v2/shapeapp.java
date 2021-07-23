package com.javaex.shape.v2;

public class shapeapp {

	public static void main(String[] args) {
		
		//Shape s= new Shape(;)// 추상 클래스틑 객체화 할수 없다.
		Rectangle r1= new Rectangle(10,10,100,50);
		r1.draw();
		
		Circle c1= new Circle(10,20,30);
		c1.draw(); 
		
		Point p1 = new Point(10,40);
		p1.draw();
		
		
		// 그림판에서는 그리기 객체를 관리할 수 이썽야한다.
		Drawable[] objs= {
				r1, c1, p1,
				new Rectangle(10, 40, 20, 10),
				new Circle(100,50,10);
				new Point(40,50);
		}
         for (Drawable obj: objs) {
        	 obj.draw();
        	 
         }
	}

}
