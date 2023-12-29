package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {

	static Map<String, String> map = new HashMap<String, String>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 회원을 관리하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 회원가입
		 *    - 아이디와 비번만 입력
		 *    - 이미 가입된 회원인지 체크 (containsKey 사용)
		 * 2. 회원검색
		 * 	  - 아이디를 입력해서 회원 정보를 조회
		 * 3. 종료
		 */
	
		int menu = 0;
		
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("아이디 입력하세요 : ");
				scan.nextLine(); //줄바꿈 엔터 처리
				String id = scan.nextLine();
				
				System.out.print("비밀번호를 입력하세요 : ");
				String pd = scan.nextLine();
				
				map.put(id,pd);
				
				System.out.println("입력한 아이디와 비밀번호를 확인합니다." + map);
				break;
				
			case 2:
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.nextLine();
				
				Set<String> keySet = map.keySet();
				for(String tmp : keySet) {
					String value = map.get(tmp);
					System.out.println(value);
					System.out.println("["+ tmp + " , " + value + "]");
				}
				break;
				
			case 3:
				System.out.println("프로그램 종료합니다.");
				break;
				
			default:
				System.out.println("잘못된 메뉴입니다.");
				
			}
		}while(menu != 3);
	}


	private static void printMenu() {
		System.out.println("-----메뉴------");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 종료");
		System.out.println("-------------");
		System.out.print("번호 입력 : ");
	}

}
