package com.javaex.opps.goods.v1;

import com.javaex.opps.goods.v2.Goods;

public class GoodsApp {
	public static void main(String[] args) {
		Goods notebook= new Goods();
		//필드에 접근
		notebook.name="LG Gram";
		notebook.price = 1700000;
		
		
		Goods smartphone= new Goods();
		smartphone.name= "iPhone 12";
		smartphone.price = 800000;
	
		//출력
		System.out.println("%s,%d원%n ");
		
	}

}
