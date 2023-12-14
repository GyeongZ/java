package day05;

public class RandomArrayEx1 {

	public static void main(String[] args) {
		/* 1~9사이의 랜덤한 수를 3개 생성해서 배열에 저장하는 코드를 작성하세요.
		 * 3개짜리 배열을 생성하여 랜덤한 수를 저장
		 */
		/*int [] random = new int[3];
		int arr1[] = {1,3,4,5,7,9,2,4,6,8};
		
		for(int i = 0; i < 9; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		int arr2 [] = new int[arr1.length];
		int arr3 [] = new int[arr1.length];
		*/
		
		//강사님
		int [] arr = new int[3];
		int min = 1, max = 9;
		
		/*
		arr[0] = (int)(Math.random()*(max - min + 1) + min);
		arr[1] = (int)(Math.random()*(max - min + 1) + min);
		arr[2] = (int)(Math.random()*(max - min + 1) + min);
		*/
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max - min + 1) + min);
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		
	}
}
