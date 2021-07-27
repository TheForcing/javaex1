package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class scoreboard { int[] scores
 // 참조 타입 필드
	this.score=score;
	private int score[];
	//setter, getter
	public int[] getScore() {
		
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "scoreboard [scores=" + Arrays.toString(scores) + ", score=" + Arrays.toString(score) + "]";
	}
	// 같은 복제의 경우, 내부 참조 필드들을
		// 모두 내부 복사하여 내 객체로 만들고
		// 참조 다시 해야 한다.
		
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얉은 복사를 시도
		scoreboard clone= (scoreboard)super.clone();
		//내부 참조 객체를 복사
		clone.scores=Arrays.copyOf(scores, scores.length);
		
		return clone;
		
	}
	
	//생성자

	
	
	
	
	
}
