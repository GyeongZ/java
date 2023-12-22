package day11.product;

import java.util.Scanner;

public class ProductMain_1 {

	private static Scanner scan = new Scanner(System.in);
	private static Product[] list = new Product[10]; //10개짜리 제품 리스트 만들었음
	private static Product[] saleList = new Product[10];//(메서드 saleProduct에 있는 count를 사용하기 위해 정의해놓음)
	private static int count = 0; //(메서드 storeProduct에 있는 count를 사용하기 위해 정의해놓음)
	private static int saleCount = 0;
	
	
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
		//반복문 : 프로그램 종료선택전까지
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = scan.nextInt();
			
			//선택 메뉴에 맞는 기능 실행
			runMenu(menu);
			
		}while(menu != 5);
		//프로그램 종료 안내 문구
		System.out.print("프로그램 종료합니다!");
		
	}

	
	
	public static void runMenu(int menu) {
		switch(menu) {
		case 1: //제품 입고 메뉴 (수량을 추가하고 수정된 수량으로 표시)
			storeProduct();
			break;
		case 2: //제품 판매 메뉴 ()
			saleProduct();
			break;
		case 3: //제품 수정 메뉴 ([가격]을 수정한다.)
			updateProduct();
			break;
		case 4: //매출 내역 조회 메뉴 (제품 판매했던 기록을 적는다?)
			printSaleList();
			break;
		case 5:
			System.out.println("프로그램 종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			}
		}
	
	private static void printSaleList() {
		//매출 내역 조회
		//반복문 : 전체 매출 내역 조회한것을 반복
		for(int i = 0; i<saleCount; i++) {
			//판매 제품 정보 출력
			saleList[i].print();
		}
			
	}

	private static void updateProduct() {
		//제품명 수정할거임
		System.out.print("제품명 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		//제품 할인 금액 입력
		System.out.println("금액 :");
		int salePrice = scan.nextInt();
		
		//일치하는 제품의 할인 금액을 수정합니다.
		//반복문 : 등록된 제품 전체
		for(int i = 0; i<count; i++) {
				//제품의 이름과 제품명이 같으면
				if(list[i].equals(name)) {
					//제품의 할인 금액을 수정 후 종료
					list[i].updateSalePrice(salePrice);
					return;
				}
		}
				
				
		
					
		//일치하는 제품이 없다고 출력하고 종료
	
	}

	private static void saleProduct() {
		//등록된 제품 목록을 출력합니다.
		//반복문 : 등록된 제품 전체를 반복
		for(int i = 0; i<count; i++) {
			list[i].print();
		}
		//판매할 제품명을 입력합니다.
		System.out.print("제품명 : ");
		scan.nextLine(); //밑에 넥스트라인을 위해서 엔터 처리한 것임
		String name = scan.nextLine();
		
		//판매한 갯수를 입력합니다.
		System.out.print("수량 : ");
		int amount = scan.nextInt();
		
		//기존 제품에서 바뀐 수량을 변경합니다.
		//반복문 : 등록된 제품 전체
			int index = -1; //5번째 줄 밑에 인덱스가 없기때문에 선언해줌
			for(int i = 0; i<count; i++) {
				//제품의 제품명과 판매한 제품명이 같으면, (복잡해지니까 더 간단해지게 index 사용할거임)
				if(list[i].equals(name)) {
				//번지를 index에 저장
				index = i;
				}
			}
		
			//제품명 일치하는 제품이 없으면
			if(index == -1) {
				//메서드 종료
				System.out.println("일치하는 제품이 없습니다."); //종료 안내문 표시한것임
				return;
			}
			
			//제품 수량이 입력한 제품 수량보다 작으면
			if(list[index].getAmount() < amount) {
				//제품 수량이 잘못되었다고 출력
				System.out.println("수량이 잘못되었습니다. 수량을 확인하세요.");
				//메서드 종료
				return;
			}
			list[index].updateAmount(-amount); //(마이너스 amount)를 했음 마이너스 기억, 왜 그랬는지 생각!
			//아니면 제품 수량을 변경하고
			
			
				//매출 내역을 위해 판매 제품 리스트에 추가합니다.
				//제품명과 입력된 제품 수량을 이용하여 인스턴스를 생성
				Product tmp = new Product(name, amount, list[index].getBuyprice(),list[index].getSalePrice());
			//생성된 인스턴스를 판매 제품 리스트에 추가
			saleList[saleCount] = tmp; //tmp로 인스턴스 같게 한 이유는 이 메서드 안에서만 그렇게 복사되도록 하기위해서, 안그러면 다른 곳 index도 다 같게 복사됨
			//판매 횟수를 1증가
			saleCount++;
			System.out.println("판매가 등록되었습니다.");
	}

	public static void storeProduct() { //제품 입고 메뉴 메서드
		//제품 정보를 입력
		System.out.print("제품명 : ");
		scan.nextLine(); //줄바꿈 엔터 처리
		String name = scan.nextLine();		
		
		System.out.print("수량 : ");
		int amount = scan.nextInt();
		
		System.out.print("구매 가격 : ");
		int buyPrice = scan.nextInt();
		
		System.out.print("판매 가격 : ");
		int price = scan.nextInt();
		
		for(int i = 0; i<count; i++) {
			if(list[i].equals(name)) {
				list[i].updateAmount(amount);
				return;
			}
		}
		
		//일치하는 제품 정보가 있으면 수량을 변경하고
		//없으면 제품 정보를 추가한다.
	
		list[count] = new Product(name, amount, buyPrice, price);
		count++;
		
		//배열이 다 차면 확장시킴
		if(count == list.length) {
			expandList(list);
		}
	}
	/** 주어진 List를 확장하는 메서드
	 * @param List 확장할 메서드
	 * @return 
	 * @return 주어진 list에 크기 10만큼 늘어난 배열을 반환한다.
	 */
	public static Product[] expandList(Product[] list) { //이 부분 잘 모르겠음
			Product[] tmpList = new Product[list.length + 10];
			//새 단어장에 기존 단어들을 복붙
			System.arraycopy(list, 0, tmpList, 0, list.length);
			//새 단어장을 내 단어장이라고 선언
			return tmpList;
	}

	public static void printMenu() { //메뉴 목록 글씨 적어놓은 것
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
