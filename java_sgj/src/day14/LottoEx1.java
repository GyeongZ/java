package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LottoEx1 {

	public static void main(String[] args) {

		/* 랜덤으로 당첨 번호를 생성하고, 사용자가 로또 번호를 입력하면 등수를 알려주는 코드를 작성하세요.
		 * 단, 컬렉션을 이용
		 * 당첨번호 : 6개, 보너스 : 1개
		 * 사용자 : 6개
		 * 번호 범위 : 1~ 45
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<7; i++) {
			list.add(i);
		}
		
		for(int i = 0; i<list.size(); i++) {
			//get(index) : index 번지에 있는 인스턴스를 가져옴
			System.out.print(list.get(i));
		}
		
		
		
		int num = 7;
		System.out.print("7개의 로또 번호를 입력하세요 : ");
		
		for(int i = 0; i<num; i++) {
			
			int tmp = scan.nextInt();
			list.add(tmp);
		}
		
		for(int tmp : list) {
			
			System.out.print(tmp);
		}
		
		
		// 7개짜리 배열을 만들어 로또 당첨 번호를 랜덤으로 생성 => 1번 배열
		int [] tmp = new int [7];
		int count = 0; 
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
	
	
	
	
	}

}



