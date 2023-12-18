package day06;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_2 {

	public static void main(String[] args) {
		
		//반목문 : 프로그램 종료를 선택하기 전까지 반복 : 최소 한번은 실행해야함 왜냐 메뉴는 떠야하니까 => 두와일문
		int menu;
		Scanner scan = new Scanner(System.in);
		int records[] = new int[5];
		String names[] = new String[5];
		int rankCount = 0;
		
		//records를 가장 큰값으로 초기화를 함
		for(int i = 0; i < records.length; i++) {
			records[i] = Integer.MAX_VALUE;
		}
		do {
			//메뉴를 출력
			System.out.println("메뉴");
			System.out.println("1. 새 게임");
			System.out.println("2. 기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴 선택 : ");

			//메뉴를 선택
			menu = scan.nextInt();
			
			//메뉴 선택에 따른 기능 실행
			switch(menu) {
			//1번 새 게임
			case 1:
				int min = 1, max = 9;
				int com[] = new int[3];
				int count = 0; 
				int recordCount = 0;
				//랜덤으로 중복되지 않은 3개의 수를 생성
				while( count < 3) {
					//랜덤한 수 생성
					int r = (int)(Math.random()*(max - min + 1) + min);
					
					//중복 확인
					int i;
					for(i = 0; i < count; i++) {
						if(com[i] ==r) {
							break;
						}
					}
					//중복되지 않으면 저장 후 count 증가
					if(i == count) {
						com [count++] = r;
					}
				}
				//출력
				for(int i = 0; i<com.length; i++) {
					System.out.print(com[i] + " ");
				}
				
				// 반복문 : 맞출때까지 => 스트라이크의 개수가 3개 미만인 경우 반복해야함
				int strike, ball;
				int user [] = new int[com.length];
				do {
					// 중복되지 않은 숫자 3개를 입력하도록 함
					count = 0;
					System.out.println("입력 : ");
					while(count < user.length) {
						int input = scan.nextInt();
						int i;
						for(i = 0; i < count; i++) {
							if(user[i] == input) {
								break;
							}
						}
						//중복되지 않으면 저장 후 count 증가
						if(i == count) {
							user[count++] = input;
						}
					}
					// 스트라이크와 볼의 개수를 계산 : ***초기화 하기 안그러면 결과 누적됨
					strike = 0;
					ball = 0;
					//이중반복문
					int i;
					for(i = 0; i<com.length; i++) {
						for(int j = 0; j<user.length; j++) {
							//두 수가 같으면
							if(com[i] == user[j]) {
								//위치가 같으면 스트라이크
								if(i == j) {
									strike++;
								}else { //위치가 다르면 볼
									ball++;
								}
							}
						}
					}
					// 스트라이크와 볼의 개수에 따른 결과를 출력
					if(strike != 0) {
						System.out.print(strike + "S");
					}
					if(ball != 0) {
						System.out.println(ball + "B");
					}
					if(strike == 0 && ball == 0) {
						System.out.println("O");
					}
					System.out.println();
					recordCount++;
				}while(strike < 3);
				//정답입니다. 를 출력 : 반복문 빠져 나와야하니까
				System.out.println("정답입니다!");
				//기록을 비교하여 등수에 들면 추가
				//기록이 4개 등록이 안된 경우나 마지막 기록이 내 기록보다 큰 경우를 입력
				if(rankCount < 5 || records[rankCount-1] > recordCount) {
					System.out.println("이름 : ");
					String name = scan.next();

					rankCount = rankCount < 5 ? rankCount + 1 : rankCount;

					int index = 0; //만약에 새로운 등수가 등장하면 그 기록이 들어갈 위치를 찾음
					for(int i = 0; i<rankCount; i++) {
						if(recordCount < records[i]) {
							index = i;
							break;
						}
					}
					//이전 기록들을 뒤에서 부터 한칸씩 밈니다. 왜냐 새로운 등수가 거기에 들어갈거라서
					for(int i = rankCount - 1 ; i > index; i--) {
						records[i] = records[i-1];
						names[i] = names[i-1];
					}
					records[index] = recordCount;
					names[index] = name;
				}
				break;
			//2번 기록 확인
			case 2:
				if(rankCount == 0) {
					System.err.println("기록이 없습니다.");
				}else {
					for(int i = 0; i<rankCount; i++) {
						System.out.println(i+1 + "등 :" + records[i]+ "회 - " + names[i]);
					}
				}
				break;
			//3번 프로그램 종료
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			//잘못된 메뉴
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu != 3);
		scan.close();
		

	}
}
