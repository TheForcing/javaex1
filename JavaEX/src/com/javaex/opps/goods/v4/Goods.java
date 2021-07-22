package com.javaex.opps.goods.v4;
// v4. this
// 객체 자신을 의미, this() 내부의 다른 생성자를 의미
// : new 키워드와 함꼐 클래스를 객체화 시킬 때 초기화를 담당

// getter/setter 를 통한 내부필드의 우회 접근

public class Goods {
	//필드 선언
	private String name;
	private int price;
	//생성자
	public Goods(String name) {//name 필드만 초기화하는 생성자
		this.name= name;
		
	}
	public Goods(String name, int price) {
     this(name); // 내부의 다른 생성자를 호출
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
	
	
   // 매서드
	public void showInfo() {
		System.out.println("상품이름:"+name);
		System.out.println("가격:"+price);
		}
	}

