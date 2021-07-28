package com.javaex.api.generic;
// Generic 이용
// T->Type
public class GenericBox<T> {
	T content; // 타입 미정상태
// 파라미터 갯수는 제한이 없다,.
	//많이 사용되는 파라미터 관해:
	//T:Type
	//R:Return Type
	// K: key:
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	

}
