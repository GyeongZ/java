package day05;

import java.util.Arrays;

public class LottoEx1_1 {

	public static void main(String[] args, int r, int i) {
		/* 1 ~ 45 사이의 랜덤한 수 6개를 생성하여 출력하는 예제(중복되지않는)
		 * 단, 정렬이 되도록 작성한다.
		 */
		int min = 1, max = 45;
		int lotto[] = new int[6];
		
		int count = 0;
		
		//랜덤으로 중복되지않는 6개의 수를 생성 (count)
		while(count < lotto.length) {
			// 랜덤한 수 생성
			int r1 = (int)(Math.random()*(max - min + 1) + min);
			
			//중복 확인
			int i1;
			for(i1 = 0; i1<count; i1++) {
				if(lotto[i1] == r1)
					break;
			}
		}
			//중복되지 않으면 저장 후 count 증가
			if(i == count) {
				lotto[count++] = r;
				
			
		}
		//정렬
			Arrays.sort(lotto);
					
		//출력
			for(int i1 = 0; i1<lotto.length; i1++) {
				System.out.print(lotto[i1] + " ");
			}
	}

}
