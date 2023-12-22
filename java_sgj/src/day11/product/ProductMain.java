package day11.product;

import java.util.Scanner;

public class ProductMain {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 제품을 관리하는 프로그램을 구현하세요.
		 * 메뉴
		 * 1. 제품 입고
		 * - 제품을 판매하기 위해 다른 곳에서 제품을 구매
		 * (*기존 제품에서 수량 추가 수정되어야함)
		 * 2. 제품 판매
		 * - 입고된 제품을 판매
		 * 3. 제품 수정 [가격]
		 * 4. 매출 내역 조회
		 * 5. 종료
		 */
		
		//제품을 관리하는 프로그램 
		//반복문으로 메뉴 다시 돌아오도록 
		int menu;
		do {
			//메뉴출력
			printMenu(); // 메서드 만들어서 선언
		
			//메뉴 선택
			menu = scan.nextInt();
			
			//선택한 기능 실행
			runMenu(menu);
			
			}while(menu != 5);//프로그램 종료는 5번
	}
	
	
		/**menu가 주어지면 menu에 맞는 기능을 실행하는 메서드
		 * @param menu (실행할 메뉴의 번호)
		 */	
		private static void runMenu(int menu) {
			switch(menu) {
			case 1: //제품 입고 메뉴 (수량을 추가하고 수정된 수량으로 표시)
				stockProduct();
				break;
			case 2: //제품 판매 메뉴 ()
				saleProduct();
				break;
			case 3: //제품 수정 메뉴 ([가격]을 수정한다.)
				updateProduct();
				break;
			case 4: //매출 내역 조회 메뉴 (제품 판매했던 기록을 적는다?)
				
				break;
			case 5:
				System.out.println("프로그램 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
				}
			}
		/**제품 [가격]을 수정하는 메서드
		 */
		private static void updateProduct() {
			//수정할 제품 의 가격을 입력
			System.out.print("수정할 제품 번호 :");
			int num = scan.nextInt();
			
			
			//반복문 : 게시글 목록 전체
			for(int i = 0; i<count; i++) {
				//입력한 게시글 번호와 일치하는 게시글이 있으면
				if(num == boardList[i].getNum()) {
					scan.nextLine(); //엔터 처리 안그러면 계속 일자로 붙어서 나옴
					System.out.print("수정할 제품 번호 :");
					String title = scan.nextLine();
					System.out.print("수정할 제품 가격 :");
					String contents = scan.nextLine();
					//해당 게시글의 제목과 내용을 수정하고 메서드 종료
					boardList[i].update(title, contents);
					return;
				}
			}
			
			//일치하는 게시글이 없습니다 라고 출력
			System.out.println("일치하는 게시글이 없습니다.");
		}


		/**제품 판매를 기록하는 메서드
		 */
		private static void saleProduct() {
			// 제품 판매 품목을 기록한다.
		}


		/**제품 입고를 진행하는 메서드
		 */	
		private static void stockProduct() {
			// 제품 입고를 신청한다
		}


		/**menu 목록을 출력하는 메서드
		 * @param menu (실행할 메뉴의 번호)
		 */	
		private static void printMenu() {
			System.out.println("-----메뉴------");
			System.out.println("1. 제품 입고");
			System.out.println("2. 제품 판매");
			System.out.println("3. 제품 수정 [가격]");
			System.out.println("4. 매출 내역 조회");
			System.out.println("5. 종료");
			System.out.println("--------------");
			System.out.print("메뉴 선택 : ");
	}
}
