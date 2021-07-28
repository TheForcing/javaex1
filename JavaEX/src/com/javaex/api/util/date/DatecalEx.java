package com.javaex.api.util.date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatecalEx{
	
private static final int DateFormat = 0;
public static void DatecalE(String[] args) {
	
 //     dateEx();
        calendarEx();
        
}
private static void calendarEx() {
	//캘린더 불러오구
	Calendar now= Calendar.getInstance();
	Calendar custom= Calendar.getInstance();
	//주의: 월정보는0부터
	custom.set(1999,11,31); // 1999년 12월 31일
	 System.out.println("현재"+now);
	 System.out.println("사용자정의:"+custom);
	 //캘린더에서 현재 년도, 월, 일
	 //캘린더 상수를 사용
	 int year= now.get(Calendar.YEAR);
	 int month=now.get(Calendar.MONTH)+1;
	 int date =now.get(Calendar.DATE);
	 System.out.printf("오늘은 %d년 %d월 %d 입니다.%n%",
			 year,month,date);
	 
	 //100일 후로 이동
	 Calendar future= Calendar.getInstance();
	 future.add(Calendar.DATE, 100);
	 System.out.printf("100일후: %d년 %d월 %d일 %n", 
			 future.get(Calendar.YEAR).
			 future.get(Calendar.MONTH)+1, //주의
			 future.get(Calendar.DATE));
	 // 이날은 무슨 요일 ?
	 int dow= future.get(Calendar.DAY_OF_WEEK); // 요일(일요일1~토요일7
	 System.out.println(dow);
	 String dowStr;
	 
	 switch(dow) {
	 case Calendar.SUNDAY;
	     dowStr="일요일";
	     break;
	 case Calnedar.MONDAY;
	     dowStr="월요일";
	     break;
	 case Calendar.TUESDAY;
	    dowStr="화요일";
	    break;
	 case Calendar.WEDNESDAY;
	    dowStr="수요일";
	    break;
	 case Calendar.THURSDAY;
	      dowStr="목요일";
	      break;
	 case Calendar.FEBRUARY;
	    dowStr="금요일";
	     break;
	 case Calendar.SATURDAY;
	    dwostr="토요일";
	    break;
	  default;
	    dowStr ="?";
	 }
	 
	 System.out.println("100일 후는"+ dowStr);
	 
}
private static void dateEx() {
	//날짜를 얻어옴
	Date now= new Date(); // 현재 날짜와 시간
	System.out.println("현재:"+now);
	
	//포매터: 형식화 출력
	// 종류 :FULL, LONG, MEDIUM, SHORT
	DateFormat df= DateFormat.getDateInstance(DateFormat,Full);
	System.out.println("FULL:"+df.format(now));
	df= DateFormat.getDateInstance(DateFormat,Long);
	System.out.println("LONG:"+df.format(now));
	// TODO: DAteFOrmat을 MEDIUM, Short로 바꿔서 출력 확인
	
	//simpleDateFormat
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println("SDF"+sdf.format(now));
    
    // TODO: Tiem format을 바꿔가면 출력을 확인해 봅시다.
    
	
	
	
	
}	
}


