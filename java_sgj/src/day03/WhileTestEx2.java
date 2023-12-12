package day03;

public class WhileTestEx2 {

	public static void main(String[] args) {

		/* 5부터 1까지 거꾸로 출력되는 코드를 작성하세요.
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 * 반복회수    : i는 5부터 1씩 감소한다. 
		 * 규칙성     : i를 출력한다.
		 * 반복문종료후 : 없음 
		 */
				
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			--i;
		}
		 
		
	}

}
