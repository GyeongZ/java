package day05;

public class ArryInitEx1 {

	public static void main(String[] args) {
		// 초기화 하는 법
		// arr1 배열에는 0번지부터 4번지 까지 모두 0으로 초기화가 됨
		// (초기화 하는 법) char \0, 정수는 0, 실수는 0.0, boolean은 false.
		int arr1[] = new int[5];
		
		// arr2는 0번지에1, 1번지에 2, 2번지에 3, ... 4번지에 5가 저장됩니다
		// arr2는 총 5개의 크기를 가진 배열이 됩니다
		int arr2[] = new int [] {1,2,3,4,5}; //이렇게 중괄호로 초기화됨 
		arr2 = new int[] {3,4,5,6,7}; // 다시 초기화 하는것 적은거임
		
		// arr2와 같은 결과
		// arr3와 같이 초기화 하는 경우에는 배열을 선언과 동시에 초기화 하는 경우에만 가능하다.
		int arr3[] = {1,2,3,4,5};
		//arr3 = {1,2,3,4,5}; //에러가 발생된다.
		
	}

}
