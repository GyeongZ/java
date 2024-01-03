package day16.board;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardProgram implements Program {

	private Scanner scan = new Scanner(System.in);
	private final int EXIT = 3;
	
	@Override
	public void run() {
		//반복
		int menu = 0;
		do {
			//메뉴 출력
			printMenu();
			try {
				//메뉴 선택
				menu = scan.nextInt();
				
				//메뉴 실행
				runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				scan.nextLine();
			}
		}while(menu != EXIT);
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			printStudent();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			throw new InputMismatchException();
		}
	}

	private void insertStudent() {
		
	}

	private void printStudent() {
		
	}

	@Override
	public void printMenu() {
		System.out.println("--학생 관리 프로그램--");
		System.out.println("1. 학생 추가");
		System.out.println("2. 전체 학생 조회");
		System.out.println("3. 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
	}

}
