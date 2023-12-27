package day13;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		//캘린더 예제
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.print(year+"년");
		int month = cal.get(Calendar.MONTH)+1; //월만 더하기 1 해주기!!!!
		System.out.print(month+"월");
		int day = cal.get(Calendar.DAY_OF_MONTH); //Day 종료가 많음
		System.out.print(day+"일");

	}

}
