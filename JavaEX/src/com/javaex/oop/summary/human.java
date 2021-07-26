package com.javaex.oop.summary;

public class human extends animal {
    // 생성자
	public human(String name, int age){
		// 명시적으로 부모 생성자 호출
		super(name, age);
		
		
	}
	@Override
	public void say() {
		// Animal 클래스의 추상 매서드
		System.out.printf("안녕 나는 %s입니디%n",
				name);
	}

}
