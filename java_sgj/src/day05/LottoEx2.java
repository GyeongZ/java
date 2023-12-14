package day05;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		/* 로또 번호를 랜덤으로생성한 후(당첨번호 6자리 + 보너스 번호),
		 * 사용자가 로또번호를 입력하면 (로또번호 6자리) 당첨 등수를 출력하는 코드를 작성하세요.
		 */
		
		//변수 초기화 및 설정하기
		// 로또 공 6개+ 보너스 + 1, 45개의 번호 
		
		
		//랜덤으로 중복되지않는 7개의 수를 생성 (count)
		// 랜덤한 수 생성
		// 중복 확인
		// 중복하지않으면 다시 count 증가
		// 정렬
		// 출력
		
		//강사님 풀이
		// 7개짜리 배열을 만들어 로또 당첨 번호를 랜덤으로 생성 => 1번 배열
		int [] tmp = new int [7];
		int count = 0; //중복되지 않게 사용하려고
		int min = 1, max = 9;
		
		while(count < tmp.length) {
			int r = (int)(Math.random()*(max - min + 1) + min);
			
			int i;
			for(i = 0; i < count; i++) {
				if(r == tmp[i]) {
					break;
				}
			}
			if(i == count) {
				tmp[count++] = r;
			}
		}
		
		//위에서 생성한 배열 중 0번지부터 6개를 새로운 배일에 복사 => 2번 배열
		int [] lotto = new int [6];
		System.arraycopy(tmp, 0, lotto, 0, 6);
		
		//1번 배열 6번지에 있는 값을 보너스로 지정 = 보너스 번호
		int bonus = tmp[6];
		
		//2번 배열 정렬 후 출력
		Arrays.sort(lotto);
		System.out.println("당첨번호 : ");
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("당첨번호");
		
		// 사용자 번호를 입력(6개)해서 배열에 저장 = 3번 배열 (여기까지는 할수있어야함)
		int [] user = new int[6];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력번호 : ");
		for(int i = 0; i<6; i++) {
			
		}
		// 당첨 개수 확인 (이중 반복문)
		int sameCount = 0;
		for(int i = 0; i<lotto.length; i++) {
			for(int j = 0; j<user.length; j++) {
				if(lotto[1] == user[j])
					sameCount++;
					break;
				}
			}
		}
		
		//당첨 개수에 따른 등수로 츨력
			switch(sameCount) {
			case 6:
				System.out.println("1등!");
				break;
			case 5;
			int = i;
			//사용자가 입력한 번호에 보너스와 일치하는 번호가 있는지 확인
			for(i = 0; i < user[1]) {
				
			}
				System.out.println("2등!");
				
			}
			
		}
	
	}
