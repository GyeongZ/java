package hyo;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {

		// ArrayList 예제
	ArrayList ball = new ArrayList();
	ball.add("전반 10분 홈팀 : 1골");
	ball.add("전반 24분 어웨이팀 : 1골");
	ball.add("후반 30분 홈팀 : 1골");
	System.out.println(ball.remove(0));
	System.out.println(ball.size());
	}


}
