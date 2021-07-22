package com.javaex.opps.goods.v2;
// v1. 필드 : 클래스 내부에서 사용할 변수

// v2 . 접근 제한자
// getter/setter 를 통한 내부필드의 우회 접근
public class Goods {
	//필드 선언
	private String name;
	private int price;
 // getters/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price= price;
	}
	
   // 매서드
	public void showInfo() {
		System.out.println("상품이름:"+name);
		System.out.println("가격:"+price);
		}
	}

