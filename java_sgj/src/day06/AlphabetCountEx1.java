package day06;

import java.util.Scanner;

public class AlphabetCountEx1 {

	public static void main(String[] args) {
		/* 단어를 입력받아 단어 각 알파벳이 몇번 나왔는지 출력하는 코드를 작성
		 * 입력 : apple
		 * a : 1 
		 * e : 1
		 * l : 1
		 * p : 2
		 */
		
		
		/* 내가 한것
		Scanner scan = new Scanner(System.in);
		System.out.println("단어를 입력하세요 : ");
		String words = scan.next ();

		System.out.println();
		*/
		// 단어를 입력하게 함 => 문자열을 입력
		// 입력받은 단어를 한개씩 나눔
		// 알파벳 기호숫자가 중복되면 중복 갯수를 구함
		// or 알파벳 기호 숫자가 같은 것은 같은 배열로 입력
		// 순서 정렬
		
		//강사님
		// 단어를 입력하게 함 => 문자열을 입력
		System.out.println("단어를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int [] arr = new int[26];
		
		// 반복문으로 문자열의 길이만큼 반복
		for(int i = 0; i < str.length(); i++) {
				// 문자열의 각 문자를 가져옴
				char ch = str.charAt(i);
				
				// 가져온 문자의 배열 번지에 숫자를 증가
				// 가져온 문자가 a이면 0번지에 있는 숫자를 1증가, b이면 1번지에 있는 숫자 1증가~~z면 25번지
			
				// 아스키코드 특성을 이용
				arr[ch-'a']++;
		}
	
		// 반복문으로 배열의 크기만큼 (26개) 반복
				//개수가 0이 아닌 알파벳들을 출력
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] != 0) {
				char ch= (char)('a' + i);
				System.out.println(ch + " : " + arr[i]);
			}
			
		}
		System.out.println("============");
		//다른 방법 향산된 for문 사용
		char ch = 'a';
		for(int count : arr) {
			if(count != 0) {
				System.out.println(ch + " : " + count);
			}
			ch++;
		}
		scan.close();
	}

}
