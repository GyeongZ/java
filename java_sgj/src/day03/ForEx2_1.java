package day03;

public class ForEx2_1 {

	public static void main(String[] args) {

		/* 1에서 10사이의 짝수들의 합을 구하는 코드를 작성하세요.
		 * 반복회수    : i는 1부터 10까지 1씩 증가
		 * 규칙성     : i를 2로 나누었을 때 나머지가 0과 같다면
		 * 			sum = sum + i를 실행
		 * 반복문종료후 : sum을 출력
		 */
		
		int i = 1;
		int sum = 0;
		for( ; i <= 10; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1부터 10까지 짝수의 합 : " + sum);
	}

}
