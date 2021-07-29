package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		basicHashSet();
		customHashSet();
		
	}
	private static void customHashSet() {
	//사용자 정의 클래스에서의 Hash
		HashSet<Student> hs= new HashSet<>();
		
		Student s1= new Student("홍길동", 10);
		Student s2= new Student("홍길동", 20);
		Student s3= new Student("홍길동", 10);
		hs.add(s1); hs.add(s2); hs.add(s3);
		System.out.println(hs);
		
	    System.out.println(s1.hashCode()==s3.hashCode());
	    System.out.println(s1.equals(s3));
	    
	    // 포함 여부의 확인
	  //  System.out.println(hs.contaains(new Student("홍길동".10)));
	    System.out.println(hs.contains(s1));
	    
	}
	private static void basicHashSet() {
		//생성
		HashSet<String> hs= new HashSet<>();
		
		//객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Phthon");
		hs.add("Java");  //중복 삽입 허용하지 않음
		System.out.println(hs);
		System.out.println("Hs size"+hs.size()); //내부요소갯수
		
		// 지정 객체 포함 여부 : countatins();
		System.out.println("Java 포함?" +hs.contains("Java"));
		System.out.println("Linux 포함?" +hs.contains("Linux"));

		// 객체 삭제: remove
		hs.remove("C++");
		System.out.println(hs);
		
	   hs.clear(); // 셋 비우기
	   System.out.println(hs);
	   
	}

}
