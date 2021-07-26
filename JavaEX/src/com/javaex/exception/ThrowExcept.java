package com.javaex.exception;
import java.io.IOException;
//강제 예외 발생
public class ThrowExcept {
 public void excuteException() throws IOException{
	      System.out.println("강제 예외 발생");
	  //    	throw new IOException("강제 예외"); //checked  Exception-> 반드시 예외처리
	      
	      	
 }
 public void executeRuntimeException() {
	 System.out.println("런타임 에외");
	 throw new RuntimeException("RuntimeException");//unchecked Exception
 }
 public double divide(int num1,int num2) {
	 if(num2==0) {
		 //에외 전환
		 throw new CustomArithmeticException("사용자 정의 Exception.",
		 	 num1, num2);
	 }
	 return num1/num2;
	 
	 
 }
}
