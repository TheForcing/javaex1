package com.javaex.oop.summary;

public abstract class animal{
   //필드
	protected String name;
	protected int age;
	public animal(String name) {
		super();
		this.name=name;
		
	}
	public animal(String name, int age) {
		//자신의 다른 생성자를 호출
		this(name);
		this.age=age;
		
	}
	//매서드
	public void eat() {
		System.out.printf("%s is eating....%n", name);
		
	}
	// 추상 매서드: 선언만 한다.
	//자식 클래스에서 Override 해야한다.
	public abstract void say();
	
	}

