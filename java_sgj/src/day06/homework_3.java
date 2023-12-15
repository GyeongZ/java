package day06;

import java.util.Arrays;
import java.util.Scanner;

public class homework_3 {

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
		
		int r = 0;
		//전체 랜덤 수 범위 1~9
		int min = 1, max = 9;
		r = (int)(Math.random()*(max - min + 1) + min);
				
		// 처음 문구 입력할거
		System.out.print("(1~9)사이에 3가지의 숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		//중복되지 않아야하는 3개의 랜덤 수 생성
		int arr[] = new int[3];
		int count = 0;
		
		while(count < 3) {

			boolean duplicated = false;
			for(int i = 0; i < count; i++) {
				if(arr[i] ==r) {
					duplicated = true;
					break;
				}
			}
			
			//중복되지 않으면 저장 후 count 증가
			if(!duplicated) {
				arr[count] = r;
				count++;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// - S(스트라이크)	 : 숫자가 있고, 위치가 같은 경우 (단일 반복문)
		while() {
			if() {
				System.out.println( +"s");
			}else {
				System.out.println( +"s");
			}
		}
		
		// - B(볼)		 : 숫자가 있지만, 위치가 다른 경우 (이중 반복문)
 		// - O(아웃)		 : 일치하는 숫자가 하나도 없는 경우
		// 이 조건을 만들어야 한다.
		
		
		scan.close();
	}
}	

