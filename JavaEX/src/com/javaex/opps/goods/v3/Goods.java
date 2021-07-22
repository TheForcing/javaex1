package com.javaex.opps.goods.v3;
// v1. 필드 : 클래스 내부에서 사용할 변수

// v2 . 접근 제한자
// v3. 생성자
// : new 키워드와 함꼐 클래스를 객체화 시킬 때 초기화를 담당

// getter/setter 를 통한 내부필드의 우회 접근

public class Goods {
	//필드 선언
	private String name;
	private int price;
	//생성자 규칙
	//1. 생정자는 클래스 이름과 동일, 반환타입은 없다
	//2. 생성자를 하나도 만들지 않으면 ->javac가 기본 생성자를 추가한다.
	//3. 생정자를 임의로 만들었을 떄 -> javac는 기본 생성자를 추가 하지 않음
	public Goods(String name, int price) {
     this.name = name;
     this.price = price;
     
	}	// getters/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}	
	public int getPrice() {
		return price;
	}
	
	//setter을 
	//public void setPrice(int price) {
	//this.price= price;
	}
	
   // 매서드
	public void showInfo() {
		System.out.println("상품이름:"+name);
		System.out.println("가격:"+price);
		}
	}

