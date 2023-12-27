package day13;

import java.util.Scanner;

public class StringEx2 {
	
	static Scanner scan = new Scanner(System.in);
	static String [] list = new String[30]; // (배열 추가)
	static int count = 0;
	
	public static void main(String[] args) {
		/* 문장들을 입력 받아 배열에 저장하고, 특정 단어가 들어가 있는 문장들을
		 * 출력하는 프로그램을 작성하세요.
		 * 
		 * 메뉴
		 * 1. 문장 추가
		 * 2. 검색
		 * 3. 종료
		 * */
		
		/* (총 4개의 문장 있음)
		 * 안녕하세요.
		 * 테스트
		 * 만나서 반갑습니다.
		 * 나는 홍길동입니다.
		 * 
		 * '나' 검색
		 * 
		 * 만나서 반갑습니다.
		 * 나는 홍길동입니다.
		 * (이렇게 2개 문장 검색되도록)
		 * */
		
		
		// 이전에 해왔던 방식
		
		int menu;
		do {
			//메뉴 출력
			printMenu(); // 메서드 만들어서 선언
			
			//메뉴 선택
			menu = scan.nextInt();
			
			//기능 실행
			runMenu(menu);
			
			
		}while(menu != 3);
	}

	
	public static void runMenu(int menu) {
		switch(menu) {
		case 1: //문장 추가 메뉴 
			insertString();
			break;
		case 2: //제품 확인 메뉴 ()
			searchString();
			break;
		case 3: System.out.println("프로그램 종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			}
	}


	public static void searchString() {
		//저장한 문장 중에서 입력한 글자의 한단어를 검색하고 그 단어가 포함된 문장을 출력한다.
		//단어 입력
		System.out.println("검색할 단어 입력 : ");
		String str = scan.next();

		//검색
		for(String tmp : list) {
			if(tmp != null && tmp.contains(str)) { //*** 이것을 활용했음
				System.out.println(tmp);
			}
			if(tmp != null && tmp.indexOf(str) >= 0) { //***이것을 활용했음
				System.out.println(tmp);
			}
		}
	}

	public static void insertString() {
		//문장을 입력받아서 새롭게 추가 저장한다.
		System.out.println("문장을 추가합니다 : ");
		scan.nextLine(); // 위에서 입력한 엔터 처리
		String str = scan.nextLine();
		
		System.out.println("등록이 완료되었습니다.");
		
		//등록한 문장을 저장한다. 배열?
		list[count] = str;
		count++;
	}

	public static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 문장 추가");
		System.out.println("2. 검색");
		System.out.println("3. 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
	}

}
