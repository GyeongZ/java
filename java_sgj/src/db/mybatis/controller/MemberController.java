package db.mybatis.controller;

import java.util.Scanner;

import db.mybatis.service.MemberService;
import db.mybatis.service.MemberServiceImp;

public class MemberController {

	private MemberService memberService = new MemberServiceImp();
	private Scanner scan = new Scanner(System.in);
	public void run() {
		int menu;
		do {
			printMemberMenu();
			menu = scan.nextInt();
			runMemberMenu(menu);
		}while(menu != 5);
	}
	private void printMemberMenu() {
		System.out.println("회원 메뉴");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 수정");
		System.out.println("3. 회원 삭제");
		System.out.println("4. 회원 조회");
		System.out.println("메뉴 선택 : ");
	}
	private void runMemberMenu(int menu) {
		switch(menu) {
		case 1:
			insertMember();
			break;
		}
	}
	private void insertMember() {
		System.out.println("아이디 : ");
		String id = scan.next();
		System.out.println("비밀번호 : ");
		String pw = scan.next();
		System.out.println("이메일 : ");
		String email = scan.next();
	}

}
