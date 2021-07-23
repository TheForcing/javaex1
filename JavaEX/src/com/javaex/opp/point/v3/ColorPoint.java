package com.javaex.opp.point.v3;

// 상속: extends
public class ColorPoint extends Point {
 // 추가 필드
	private String color;
  // 생성자
public ColorPoint(int x, int y, String color) {
       // 명시적으로 부모 생성자 선택
		super(x,y);
       this.color = color;
        
}
   //getter/setter
 public String getColor() {
	 return color;
 }
 
 public void setColor(String color) {
	 this.color= color;
	 
 }
	// 매서드 오버라이드
 @Override
	public void draw() { // 물려 받았으나 자신만의 새로운 기능 덮어쓰기
		// 방법 1. 부모의 getter, setter 를 이용
	//	System.out.pringf("색깔을 [x=%d, y=%d, color=%s])을 그렸습니다.%d',"
		 
		//super.getx(),
		//super.gety(),
		//color);
	//방법2
	System.out.printf("색깔점[x=%d, y=%d, color]을 그렸습니다.,%n",
			x,y,color);
	}
// TODO: Point 클래스의 draw(boolean) 매서드를 오버라이드 해보기
}

