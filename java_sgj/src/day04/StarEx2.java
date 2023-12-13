package day04;


public class StarEx2 {

	public static void main(String[] args) {
		/* *		i = 1 , 별 갯수=1
		 * **		i = 2 , 별 갯수=2
		 * ***		i = 3 , 별 갯수=3
		 * ****		i = 4 , 별 갯수=4
		 * *****	i = 5 , 별 갯수=5
		 * 
		 * 반복횟수	: i는 1부터 5까지 1씩 증가
		 * 규칙성		: *을 i개 출력 후 엔터
	 * 				반복회수	: j는 1부터 i까지
	 * 				규칙상	: *을 출력
	 */
	 
		for(int i = 1; i <= 5; i++) {
			//*을 1개 출력 후 엔터
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
			
	}

}
