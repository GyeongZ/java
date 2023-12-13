package day04;

public class GcdEx3 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 공약수 중 가장 큰 공약수
		 * 약수 : 나누어서 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 12의 약수 : 1,2,3,4,6,12
		 * 8의 약수 : 1,2,4,8
		 * 8과 12의 최대 공약수 : 4
		 * 
		 * 반복회수	: i는 1부터 num1까지 1씩 증가
		 * 규칙성(=실행문): i는 num1의 약수이고, i가 num2의 약수이면 gcd에 i를 출력
		 * 			=> num1을 i로 나누었을 때 나머지가 0과 같고,
		 * 			=> num2를 i로 나누었을 때 나머지가 0과 같다면 i를 출력
		 * 			=> i값 중 가장 큰것을 출력 하는 법?
		 * 반복문종료후 : gcd를 출력
		 */
		//1부터 공약수들을 하나씩 구해서 덮어쓰기 방식
		int num1 = 8, num2 = 12;
		int gcd = 1;
		
		for(int i = 1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			System.out.println(num1 +"과 " + num2 + "의 최대 공약수 : " + gcd );	
		}
		// num1부터 공약수를 구해서 처음 구한 공약수가 최대 공약수가 되는 방식
		for(int i = num1; i>=1; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(num1 +"과 " + num2 + "의 최대 공약수 : " + i );	
				break;
			}
		}
	}

}
