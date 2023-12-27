package day13;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		
		String fruits = "사과, 배, 오렌지";
		
		//String 클래스에서 제공하는 split를 이용함
		String [] fruit = fruits.split(",");
		
		for(String tmp : fruit) {
			System.out.println(tmp);
		}
		
		//StringTokenizer를 이용함
		StringTokenizer st = new StringTokenizer(fruits,",");
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			System.out.println(tmp);
		}
	}

}
