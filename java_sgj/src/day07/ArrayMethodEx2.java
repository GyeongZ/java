package day07;

public class ArrayMethodEx2 {

	public static void main(String[] args) {
		int [] arr1 = new int[5];
		intiArray1(arr1);
		printArray(arr1);
		
		int [] arr2 = new int[5];
		intiArray2(arr2);
		printArray(arr2);
		
		int [] arr3 = intiArray3(5);
		printArray(arr3);
		
	}
	public static void printArray(int []arr) {
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
	}
	//잘못된 메서드
	/* 기능 : 정수 배열에 1부터 순차적으로 저장하는 메서드
	 * 매개변수 : 정수 배열 => int []arr
	 * 리턴타입 : 없음 => void
	 * 메서드명 : intiArray1
	 */
	public static void intiArray1(int []arr) {
		arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
	}
	
	//바른 메서드
	/* 기능 : 정수 배열에 1부터 순차적으로 저장하는 메서드
	 * 매개변수 : 정수 배열 => int []arr
	 * 리턴타입 : 없음 => void
	 * 메서드명 : intiArray2
	 */
	public static void intiArray2(int []arr) {
		for(int i=0;i < arr.length; i++) {
			arr[i] = i + 1;
		}
	}
	//결과는 같으나 형태가 다른 메서드
	/* 기능 : 정수가 주어지면 정스 크기에 배열을 생성하고, 배열에 1부터 순차적으로 저장하는 메서드
	 * 매개변수 : 정수 배열 => int []arr
	 * 리턴타입 : 없음 => void
	 * 메서드명 : intiArray1
	 */
	public static int[] intiArray3(int length) {
		int arr[] = new int[length];
		for(int i=0; i<length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}
}