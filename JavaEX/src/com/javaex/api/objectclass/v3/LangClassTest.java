package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		// 객체 복제 테스트
		
		Point p= new Point(10,20);
		
	    Point p2= p;  // 참조 복제
	    
	    //참조 복제는 깊은 객체 참조
	    // Point p2=p; // 참조 복제
	    Point p2= p.getClone();
	    
	    System.out.println("p2="+p2);
	    System.out.println("p2="+p);
	    // 참조 복제는 같은 객체 참조
	    
	    // Rectangle 클론 테스트
	    Rectangle r1= new Rectangle(100,200);
	    System.out.println("r1="+r1);
	    Rectangle r2=r1.getClone();
	    system.out.println("r2="+r2);
	    
	    r2.width=300;
	    System.out.println("r1="+r1);
	    System.out.println("r2="+r2);
	    System.out.println("r1==r2 ?"+(r1==r2));
	    
	    //System.out.println("p와 p2는 같은 객체인가?"+ (p==p2));
	    // == 은 참조 주소 비교
	    // .equals() 내부 값의 비교
	   // System.out.println("p와p2는 같은 값을 가졌는가?"+p.equals(p2));
	     
	}

}
