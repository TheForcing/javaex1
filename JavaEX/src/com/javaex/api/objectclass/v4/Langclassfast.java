package com.javaex.api.objectclass.v4;

public class Langclassfast {
	public static void main(String[] args) {
		scoreboard s1
		new scoreboard(new int[] {10,20,30,40});
		System.out.println("s1="+s1);
		
		scoreboard s2= s1.getclone();
		System.out.println("S2="+s2);
		
		s2.getscore()[0]= 50;
		
		System.out.println("S1="+s1);
		system.out.println("S2="+s2);
		
		// s1과 s2가 별개의 객체
		System.out.println("s1==s2?"+(s1==s2));
		//내부 참조 데이터 확인
		System.out.println("s1.score==s2.scores"+(s1.getsocres()==s2.getscores()));
		
		
		
	}

}
