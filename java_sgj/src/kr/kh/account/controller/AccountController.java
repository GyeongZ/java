package kr.kh.account.controller;

import java.util.Scanner;

public class AccountController {
	
	private Scanner scan;
	
	public AccountController(Scanner scan) {
		if(scan == null) {
			scan = new Scanner(System.in);
		}
		this.scan = scan;
		accountService = new AccountServiceImp();
	}
	
	public void run() {
		int menu;
		do {
			printMenu();
			menu = scan.nextInt();
			runMenu(menu);
		}while(menu != 5);
	}
	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			insert();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			System.out.println("이전으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	private void insert() {
		// TODO Auto-generated method stub
		
	}

	private void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 내역 입력");
		System.out.println("2. 내역 수정");
		System.out.println("3. 내역 삭제");
		System.out.println("4. 내역 조회");
		System.out.println("5. 이전");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");

	}
}
