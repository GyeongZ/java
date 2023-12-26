package day12.product;

import java.util.Scanner;

public class ProductMain {

	static Scanner scan = new Scanner(System.in);
	static Product [] list = new Product[30]; //배열 추가!! 30개 설정 했음
	static int count = 0;
	
	public static void main(String[] args) {
		/* 제품을 추가하는 프로그램을 작성하세요.
		 * 제품은 TV, 에어컨, 노트북만 추가 가능
		 * 
		 * 공통 : 브랜드, 제품코드, 제품명
		 * 차이점 :
		 * TV는 화면크기
		 * 에어컨은 냉방면적
		 * 노트북은 CPU, 램
		 * 
		 * 상속을 활용 먼저 만들기
		 * TV클래스, 에어컨 클래스, 컴퓨터 클래스
		 * product 클래스
		 * 
		 * 메뉴
		 * 1. 제품 추가
		 * 2. 제품 확인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * ------------
		 *  추가할 제품
		 *  1. TV
		 *  2. 에어컨
		 *  3. 노트북
		 *  제품 선택 : 1
		 * ------------
		 * 브랜드 : 삼성
		 * 제품코드 : WE1ewe22-1
		 * 제품명 : 2023 QLED 슬림 벽걸이형
		 * 화면크기(cm) : 189
		 * 등록이 완료되었습니다.
		 * ------------
		 * 메뉴
		 * 1. 제품 추가
		 * 2. 제품 확인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * ------------
		 *  추가할 제품
		 *  1. TV
		 *  2. 에어컨
		 *  3. 노트북
		 *  제품 선택 : 2
		 * ------------
		 * 브랜드 : 삼성
		 * 제품코드 : WE1ew123123
		 * 제품명 : 2022 슬림 벽걸이형
		 * 냉방면적(m2) : 56.9
		 * 등록이 완료되었습니다.
		 * ------------
		 * 메뉴
		 * 1. 제품 추가
		 * 2. 제품 확인
		 * 3. 종료
		 * 메뉴 선택 : 
		 * ------------
		 */
		
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
	
	private static void runMenu(int menu) {
		switch(menu) {
			case 1: //제품 추가 메뉴 (수량을 추가하고 정보 표시)
				insertProduct();
				break;
			case 2: //제품 확인 메뉴 ()
				printProduct();
				break;
			case 3: System.out.println("프로그램 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
				}
			}
	
	
	
	
	
	public static void insertProduct() {
			//추가할 제품의 정보를 입력
		printProductTitle();
			int select = scan.nextInt();
			System.out.print("브랜드 : ");
			scan.nextLine(); // 위에서 입력한 엔터 처리
			String brand = scan.nextLine();
			System.out.println("제품명 : ");
			String title = scan.nextLine();
			System.out.println("제품코드 : ");
			String code = scan.nextLine();
			//제품마다 추가 정보 입력
		switch(select) {
			case 1://tv
				System.out.println("화면크기 : ");
				int size = scan.nextInt();
				list[count++] = new Tv(brand, code, title, size);
				break;

			case 2://에어컨
				System.out.println("냉방면적 : ");
				double area = scan.nextDouble();
				list[count++] = new Aircon(brand, code, title, area);
				break;
			
			case 3://노트북
				System.out.println("cpu : ");
				double cpu = scan.nextDouble();
				System.out.println("램 : ");
				int ram = scan.nextInt();
				list[count++] = new Notebook(brand, code, title, cpu, ram);
				break;
				
			default:
				System.out.println("잘못된 제품입니다.");
			}
			System.out.println("등록이 완료되었습니다.");
		}
	
	public static void printProductTitle() {
			System.out.println("제품 목록");
			System.out.println("1. TV");
			System.out.println("2. 에어컨");
			System.out.println("3. 노트북");
			System.out.println("제품 선택 : ");
	}
	
	public static void printProduct() {
		if(count ==0) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		for(int i = 0; i<count;i++) {
			list[i].print();
		}
	}

	public static void printMenu() {
			System.out.println("-----메뉴-----");
			System.out.println("1. 제품 추가");
			System.out.println("2. 제품 확인");
			System.out.println("3. 종료");
			System.out.println("--------------");
			System.out.print("메뉴 선택 : ");
	}
}
