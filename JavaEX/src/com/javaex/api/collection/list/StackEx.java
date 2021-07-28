package com.javaex.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// 스택 생성
		// LIFO
		Stack<Integer> stack= new Stack<>();
		
		for (int i=0; i<5; i++) {
			stack.push(i); // 데이터 입력
			System.out.println("Stack:"+stack);
		}
         // 가장 위쪽 데이터 확인
		System.out.println("Stack:"+stack.peek()); //데이터를 확인만하고 지우지 안흔다.
	     
	    //while(true) {
	    	while(!stack.empty()) {
	    	System.out.println("Pop:"+stack.pop());
	    	// 가장 마지막 입력 데이터 추출
         	    
	    System.out.println("Stack:"+stack);
	    }
	
	
	}

}
