package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
	stringBasicEx();	
    stringMethodEx();
    stringBufferEx();
    
    
	}
	
	private static void stringMethodEx() {
		// 유용한 매섣들
		String str= "Java Programing, JavaScript Progaming";
		// 변환 매서드
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		// Strings 불변객체(내용이 변경하지 않음)
		System.out.println("불면:"+str);
		//인덱스 관련
		System.out.println("LENGTH:"+str.length()); //길이
		System.out.println("char@s"+ str.charAt(5));
		
		// 검색 관련
		System.out.println("str comtatins Java"+str.contains("Java"));
		
		int idx=str.indexOf("Java"); // 처음부터 JAVA검색
		System.out.println("1st index of Java:"+idx);
		idx=str.indexOf("java,",4); // 인덱스 4부터 Java검색
		System.out.println("2nd index of Java:"+idx);
		idx=str.indexOf("Java", idx+4);// 시작인덱스 뒤로 밀기
		System.out.println("3nd index of Java:"+idx);
		idx=str.lastIndexOf("Java"); // 역방향 검색
		System.out.println("역방향 검색:"+idx);
		
		//문자열 추출
		System.out.println("substring 5=:"+str.substring(5)); //끝까지
		System.out.println("substirng 5=16"+
		str.substring(5,16));  //5~16 앞까지 (!5)
		
		//치환
		System.out.println(str.replace("Java","c"));
		
		// 하이퍼 스페이스 제거
		String s2= "                       Hello          ";
		String s3= ", java";
		
		System.out.println(s2.trim()+s3); // trim() : 앞뒤 공백 문자 제거
		
		// 구분자로 분열
		String[] split=str.split(" "); // 공백문자를 기준, 문자를 분열
		for (String word: split) {
			System.out.println("WORD:"+word);
			
			
		}
		// 문자를비교
		System.out.println("Abc:".compareTo("Abc"));
		
		}
	private static void stringBufferEx() {
		// string 크기는 불변자료형 ( imutalbe)
		// StringBuffer 객체는 버퍼 기반의 가변 자료들
		StringBuffer sh= new StringBuffer("This");// 기본 버퍼 (10);가정
		sh.append("is pencil"); // append 맨위에 추가
	    sh.insert(0, "my");  // insert  중간에 삽입
	    sh.replace(0,10,"your"); // replace 치환
	    
	    System.out.println(sh);
	    
	    sh.setLength(10); /// 버퍼크기를 강제 변경
	    System.out.println(sh);
	    
	    String s= new StringBuffer("This")
	    		.append("is pencil")
	    		.insert(0, "my")
	    		.replace(0,10,"your")
	    		.tostring();
	    System.out.println("매서드 제이닝:"+s);
	    
	    
	}
	private static void stringBasicEx() {
		String s1= "Java"; // 리터럴
		String s2= new String("Java"); // 새 객체 생성
		String s3= "Java"; // 리터럴
	   //리터럴 문자열은 값이 같으면 같은 객체
	   System.out.println("s1==s3?"+(s1==s3));
	   System.out.println("s1==s2?"+(s1==s2));
	   
	   // 문자열은 내부에 chars의 연속된 데이터
	   //String s4= new String(new char[] ('j','a','v','a'));
//	   System.out.println("s4->"+s4);
	
         // 기본 데이터 타입을 문자열로 변화할 경우
	//   String s5= String.valueOf(Math.pi);
	  // System.out.println("s5->"+s5);
	
	}

}
