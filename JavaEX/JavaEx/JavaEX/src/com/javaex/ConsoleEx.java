package com.javaex;

import java.util.Scanner; // jajv util 패키지의 scanner 로드
public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //consoleOutputEx(); 
		consoleInputEx();
		
	}
    private static void consoleOutputEx() {
    	 // 표준 출력 stdout -> system.out
    	// 표준 에러 stderr -> System.err
    	// 표준 입력 stdin -> System.in 
    	Scanner scanner = new  Scanner(System.in);
    	
    	System.out.println("이름을 입력하세요.");
    	System.out.println("이름:");
    	
    	String name = scanner.next();
    	System.out.println("당신의 이름은"+ name +"입니다.");
        
    	// 중요: 시스템 자원을 사용하는 클래스틑 사용 이후 반드시 닫아주기
    	scanner.close();
    }
    	
    private static void consoleInputEx( ) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("이름을 입력하세요.");
    	System.out.println("이름:");
    	System.out.println("나이:");
    	
    	String name= scanner.next();
    	int age= scanner.nextInt();
    	
    	
  
    	System.out.println("당신의 이름은"+ name +", 당신의 나이는" + age +"입니다.");
    	
    	scanner.close();
    }
    	
    private static void consoleOuputEx( ) {
    	// 출력매서드
    	// print : 개행 안함
    	// println : 개행 한다 -> print in
    	// printf ' 형식화된 출력 -> string
    	
    	System.out.print("Hello"); // 개행 안한다
    	System.out.println("Java"); // 개행 한다.
    	
    	// 이스케이프 문자 (\) 특수한 의미를 지닌 문자
    	System.out.println("Hello\tjava");  // \t ->탭
    	System.out.println("Hello\nJava");  // \n ->개행
    	
    	String message = "Hello, \"Java\"";   // \" -> 문자열 내의"
        // \\ -> \ 
    	String path = "C\\Users\\bit/Document";
    	
    	System.err.println("표준 에러 출력!");

    	
    }

}
