package com.javaex.oop.staticmember;

public class staticapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StaticEx s1= new StaticEx(); // 인스턴스 생성
         System.out.println("참조: 카운트:"
         		+ ""+ StaticEx.refCount);
	// static 멤버는 new로 인ㅅ흐턴스를 생성하지 않아도 접근가능
         StaticEx s2= new StaticEx();
         System.out.println("참조 카운트:"+ s2.refCount);
        
       // rorcprk wprj
         s1= null; // 참조를 삭제
         System.out.println("s1해제");
         System.out.println("참조: 카운트:"+StaticEx.refCount);
         
         System.gc(); // 가비지 클리어 수행
         
         try {
        	 //잠시 대기
        	 Thread.sleep(1000);
         } catch (Exception e) {
        	 
         }
	}
	// 소멸자
    // @override
	protected void finalize() throws Throwable {
    	 refCount; 
    	 super.finalize();
    	 System.out.println("소멸자 호출");
    	 
    	 
     }

}
