package com.javaex.thread2;


//Runnable 인터페이스 구현
public class AlpabetThread implements Runnable {

	@Override
	public void run() {
		// A~Z까지 출력
				for(char ch='A'; ch<='Z'; ch++) {
					System.out.println("Alphabet Thread:"+ch);
					
					//0.3초 대기
					try {
						Thread.sleep(300); //300mc =0.3s
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
		
	}

}
