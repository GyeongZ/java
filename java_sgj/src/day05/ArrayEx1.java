package day05;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*배열 사용 안했을때
		* int kor1, kor2, kor3, kor4, kor5;
		kor1 = scan.nextInt();
		kor2 = scan.nextInt();
		kor3 = scan.nextInt();
		kor4 = scan.nextInt();
		kor5 = scan.nextInt();
		이렇게 5개나 적어야함
		*/
		
		//학생 5명의 국어 성적을 저장하기 위한 배열
		int [] korScores = new int[5];
		/*korScores[0] = scan.nextInt();
		korScores[1] = scan.nextInt();
		korScores[2] = scan.nextInt();
		korScores[3] = scan.nextInt();
		korScores[4] = scan.nextInt();*/
		//이렇게 여러개이지만 반복문으로 바꿀수 있다.
		for(int i = 0; i <= 4; i++) {
			System.out.println("학생" + (i+1) + "성적 : ");
			korScores[i] = scan.nextInt();
		}
		for(int i = 0; i <= 4; i++) {
			System.out.println("학생" + (i+1) + "성적 : " + korScores[i]);
		}
		scan.close();
	}

}
