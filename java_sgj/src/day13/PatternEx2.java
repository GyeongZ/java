package day13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx2 {
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		/* 아이디를 입력 받아 아이디 형식에 맞는지 틀린지를 출력하는 프로그램을 작성하세요.
		 * 아이디 정규 표현식 : 영문,숫자로 구성되어있고, 8~13자리
		 * 				 : ^[a-zA-Z0-9]{8,13}$
 * 						   ^\W{8,13}$
		 * 
		 * 
		 * 아이디 : abc
		 * 아이디 형식에 맞지 않습니다.
		 * 
		 *  아이디 : abcd1234
		 *  아이디로 사용 가능합니다.
		 */
		int menu = 0;
		do {
			//메뉴 출력
			printMenu(); 
			
			//메뉴 선택
			menu = scan.nextInt();
			
			//기능 실행
			runMenu(menu);
			
		}while(menu != 2);
	}


	private static void runMenu(int menu) {
		System.out.println("아이디를 입력합니다. : ");
		scan.nextLine();
		String str = scan.nextLine();
		String regex = "^[a-zA-Z0-9]{8,13}$"; 
		if(Pattern.matches(regex, str)) {
			System.out.println("사용 가능합니다.");
		}else {
			System.out.println("아이디 형식에 맞지 않습니다.");
		}
	}



	private static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 아이디 입력하기");
		System.out.println("2. 종료");
		System.out.println("--------------");
		System.out.print("메뉴 선택 : ");
	}

}
