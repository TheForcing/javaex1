package com.javaex.api.arrays;


// 상호 비교를 위해 Comparable 인터페이스 구현
public class Member implements Comparable {
	String name;
	 
	Member(String name) {
		this.name = name;
		
	}

	@Override
	public int compareTo(Object o) {
		if( o instanceof Member) {
			Member other=(Member)o;
			return name.comparable(other.name);
			
		}
		// 리턴값이 0: 두 객체의 순서는 같다.
		  // 음수: 순서가 앞이다.
		// 양수: 순서가 뒤다.
		return 0;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

}
