package com.javaex.oop.summary;

public class TheOne extends human 
implements Flyable, KungfuSkill {
   public TheOne(String name, int age) {
	   super(name,age);
	   
   }
	@Override
	public void kungfu() {
		System.out.printf("%s:I know Kungfu%n"
				,name);
		
		
		
		

	}

	@Override
	public void fly() {
		System.out.printf("%s: I can fly%n",
				name);
		

	}

}
