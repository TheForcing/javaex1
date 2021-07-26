package com.javaex.oop.summary;

public class SummaryApp {

	public static void main(String[] args) {
		human h1= new human("홍길동", 30);
		human h2= new TheOne("네오",48);
		panda p1= new panda("핑",30);
		panda p2= new KungfuPanda("포",15);
		h1.eat();
		h1.say();
		fight(h1); fly(h1);
		p1.eat();
		p1.say();
		fight(p1); fly(p1);
		h2.eat();
		h2.say();
		fight(h2); fly(h2);
		p2.eat(); p2.say(); 
		fight(p2); fly(p2);

	}
	private static void fly(animal actor) {
		//actor Flyable 인터페이스를 구현?"
		if (actor instanceof Flyable) {
			//Flyable로 캐스팅 가능
			((Flyable)actor).fly();
			
		} else {
			//캐스팅 불가
			System.out.printf("%S:하늘을 날수 업성요%n"
					actor.name);
		}
		
	}
     private static void fight(animal actor) {
    	 // actor가 KungfuSkill 인터페이스를 구현?
    	 if(actor instanceof KungfuSkill) {
    		 // KungfuSkill 다운 캐스팅 가능
    		 ((KungfuSkill)actor).kungfu();
    	 } else {
    		 //캐스팅 불가
    		 System.out.printf("%s: 쿵푸 못해여~%n", 
    				 actor.name);
    		 
    	 }
     }
}
