package com.javaex.api.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String> lst= new LinkedList<>();
        List<String> lst=new Arraylist<>();	
		//객체 추가: add  -> 맨 뒤ㅏ에 새요소추가
		
		lst.add("Java");  // Append
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		System.out.println("lst:"+lst);
		lst.add("Java");
		System.out.println("lst:"+lst);
		// List는 순서가 있고, 중복 요소 허용
		lst.add(3,"c#"); // Insert.3번 인덱스에 C#을 추가 
		System.out.println("lst:"+lst);
		
		//요소의 갯수
		System.out.println("Szie:"+lst.size()); //capacity는 없다.
		lst.remove(3); // 인덱스로 삭제
        System.out.println("remove:"+lst);
        lst.remove("Python");
        System.out.println("객체 삭제 remove:"+lst);
		
        // 반복자: List 에서는 Iteratopr 이용
        Iterator<String> Iter=lst.iterator();
        While(iter.hasNext()) {//뒤에 남은 요소가 있는가?
        String item= Iter.next(); // 요소를 받아오고 다음으로 아ㅣ동
        System.out.print(item+"");
        
        
       }System.out.println();
       // 리스트 비우기
       lst.clear();
       System.out.println(lst);
         }

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

	}


