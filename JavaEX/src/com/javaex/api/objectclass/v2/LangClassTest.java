package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		Point p= new Point(10,20);
		// Point는 object 클래스의 모든 매서드를 사용 가능
		System.out.println(p.getClass().
				getSimpleName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p); // p.toString()

		//p의 부모 객체를 확인
		System.out.println("p의부모:"+ 
		p.getClass().getSuperclass().getName());

	}

}
