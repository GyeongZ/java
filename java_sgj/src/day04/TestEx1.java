package day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* Scanner를 이용하여 국어, 영어, 수학 성적을 입력받고,
		 * 총점과 평균을 구하는 코드를 작성하세요. */
		
		Scanner scan = new Scanner(System.in);
		
			// 성적을 입력 받기 위한 안내 문구 출력 (순서1)
		System.out.print("성적 입력(국어, 영어, 수학 순) : "); //(순서1의 안내 문구)
		
		// 성적을 Scanner를 통해 입력 (순서2)
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		// 성적의 총점과 평균을 계산 (순서 2~3 그 사이에)
		int sum = kor + eng + math;
		double avg = (double)sum / 3; //평균은 실수가 나올수있으니 더블로 형변환 
		
		// 성적의 총점과 평균이 출력 (순서3)
		System.out.println("총점 : " + sum + ", 평균 : " + avg);
		scan.close();
	}

}
