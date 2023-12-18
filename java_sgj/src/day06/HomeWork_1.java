package day06;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_1 {

	public static void main(String[] args) {
		
		/* 숫자 야구게임을 구현하세요.
		 * - 1~9 사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * - (로또와 비슷)
		 * - S(스트라이크)	 : 숫자가 있고, 위치가 같은 경우
		 * - B(볼)		 : 숫자가 있지만, 위치가 다른 경우
 		 * - O(아웃)		 : 일치하는 숫자가 하나도 없는 경우
		 * - 3S가 되면 게임이 종료
		 * 
		 * 예시
		 * 랜덤으로 생성된 숫자 : 3 9 1
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 
		 * 입력 : 4 5 6
		 * 결과 : O
		 * 
		 * 입력 : 3 1 9
		 * 결과 : 1S2B
		 * 
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다.
		 */
		
		//컴퓨터가 랜덤으로 중복되지 않은 숫자 3개를 생성 (1~9) : ***반복문 밖에 있어야함 안그러면 계속 만들어짐
		
		int min = 1, max = 9;
		int com[] = new int[3];
		int count = 0; 
		
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
		Scanner scan = new Scanner(System.in);
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
		}while(strike < 3);
		//정답입니다. 를 출력 : 반복문 빠져 나와야하니까
		System.out.println("정답입니다!");
		
		scan.close();
		
		
	}
}
