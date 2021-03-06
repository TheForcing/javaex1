package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// 기본타입 1:1 매칭되는 포장 클래스
		Integer i= new Integer(2021);  
		Character c= new Character('c');
		//new 방식의 포장은 JDK9이후로 Deprecated
		// .valueOf() 매서드를 이용판 포장
		Float f= Float.valueOf(3.14159f);
		Boolean b= Boolean.valueOf(true);
		
		// 문자열을 해당 데이터 타입으로 변환하기
        Integer i1= Integer.valueOf("10");
        Double d1= Double.valueOf("3.14159");
        Boolean b2= Boolean.valueOf("false");
       // Float f2= Float.valueOf("a123.456f"); //Error 
        //.주의 문자열의 형태가 해당 기본형의 형태를 갖추고 있어야 변환
        
        // 자동 박싱
        Integer i2= 10; 
        //-> Integer i2= Integer.valueOf(10);
        
        //  parse 계열 매서드: 변환 매서드
        System.out.println(Integer.parseInt("123")); // 문자열->정수로
        System.out.println(Integer.parseInt("FF",16));//16진수->정수
        System.out.println(Integer.toBinaryString(2021));//정수->이진수 문자열
        System.out.println(Integer.toHexString(2021));// 정수>16진수 묹자열
        
        //형변환
        System.out.println(i2.doubleValue()); // 내부데이터를 double로 변환
        
        Integer i3= Integer.valueOf(2021);
        Integer i4= Integer.valueOf(2021);
        System.out.println("i3==i4?" + (i3==i4));// 다른 객체임을 유의
        System.out.println("값의 비교:" + i3.equals(14)); // 내부값의 비교
        System.out.println("언박싱비교:" +(i3.intValue()==i4.intValue());
        
        
        
       
        
        
	}

}
