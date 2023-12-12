package day03;

public class AlphabetEx1 {

	public static void main(String[] args) {

		/* a부터 z까지 반복문을 이용하여 출력하는 코드를 작성하세요.
		 * 반복회수 	: a의 아스키 코드값을 1씩 더한다.(ch는 a부터 z까지 1씩 증가시킨다.)
		 * 규칙성		: 1씩 더한 값을 한개씩 출력한다.
		 */
		
		for(char ch = 'a'; ch <= 'z'; ++ch)
			System.out.println(ch);

	}

}
