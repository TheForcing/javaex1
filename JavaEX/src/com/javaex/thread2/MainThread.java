package com.javaex.thread2;

public class MainThread {

	public static void main(String[] args) {
		 // Working Thread 호출
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		//쓰레드 시작
		//thread.run();
		//Main Thread 로직
		Thread thread2= new Thread(new AlpabetThread());
		// 쓰레드의 우선순의 변경
		// 1(MIN) ~ 5(NORMAL) ~ 10(MAX)
		thread.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		//쓰레드 시작: run 메서드 직접 호출하지 말자!
		thread.start();
		thread2.start();
        // MAin Thread 의 흐름에 Working Thread 들의 흐름을 합류
		try {
			thread.join();
			thread.join();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END of MainThread!");    
	   
	}
	
}
