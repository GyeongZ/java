package day13;

import java.util.regex.Pattern;

public class PatternEx1 {
	/*
	 *  ^[abc]$ 
		 - 한글자이고, a나 b나 c인 경우만 참
		^[abc]+$
		 - 문자열이 abc로만 되어 있고, 1글자 이상인 경우
		^[a-z]$
		 - 한글자이고, a~z인 경우
		^\d$
		 - 숫자 1자
		^\d{3,5}$
		 - 숫자 3~5자
		^\d{3,}$
		 - 숫자 3자이상
		^\d{3}$
		 - 숫자 3자
		^(010|011|012)$
		 - 010, 011, 012인 경우
	 */
	public static void main(String[] args) {
		//pattern 클래스를 이용하여 문자열이 정규표현식에 맞는지 확인하는 예제 작성
		String str = " ab";
		String regex = "^[a-z][A-Z]{3}$"; //메타문자 : 영문자이고 3글자
		if(Pattern.matches(regex, str)) {
			System.out.println("영문자이고 3자입니다.");
		}else {
			System.out.println("영문자가 아니거나 3자가 아닙니다.");
		}
	}

}
