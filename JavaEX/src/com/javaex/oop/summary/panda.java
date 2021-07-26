package com.javaex.oop.summary;

public class panda extends animal {
	//생성자
	public panda(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void say() {
		System.out.printf("%s: zzzzzzzzz%n", name);
		

	}

}
