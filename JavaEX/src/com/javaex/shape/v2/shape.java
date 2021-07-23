package com.javaex.shape.v2;

public abstract class shape {
//추상 클래스
	// 자식 클래스에게 피드로 매시드를 물려주는 역활
	// 그 자체로 객체화 할수 는 없다.
public Shape(int x, int y) {
	this.x= x;
	this.y= y;
	
}
 // 최소 1개의 추상 메서드가 있어야 한다.
// 상속받은 실체 클래스틑 추상 메시드를
// 반드시 구현 해야만 한다.
//public abstract void draw();
//public abstract double area();

}
