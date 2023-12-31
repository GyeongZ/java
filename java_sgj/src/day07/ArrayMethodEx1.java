package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodEx1 {

	public static void main(String[] args) {
			
			
		
			/*
			int min = 1, max = 45;
			int result = randomSix(min,max);
			System.out.println(result);
			}

			/* 기능 : 정수 num1과 정수 num2가 주어졌을때 랜덤한 수 6개를 만드는 메서드
			 * 매개변수 : (주어진 ~~~ 인 경우 라고 말할때 고것임) 정수 num1과 정수 num2 => int num1, int num2 
			 * 리턴타입 : int
			 * 메서드명 : randomSix
			 */
			/*
		public static int randomSix(int min, int max) {
				return result;
				}
	
			/* 1 ~ 45 사이의 랜덤한 수 6개를 생성하여 출력하는 예제(중복되지않는)
			 * 단, 정렬이 되도록 작성한다.
			 */
			/*		
			int min = 1, max = 45;
			int arr[] = new int[6];
			int count = 0;
			while( count < 6) {
				int r = (int)(Math.random()*(max - min + 1) + min);
				
		
				boolean duplicated = false;
				for(int i = 0; i < count; i++) {
					if(arr[i] ==r) {
						duplicated = true;
						break;
					}
				}
				
				if(!duplicated) {
					arr[count] = r;
					count++;
				}
			}
			//정렬
			Arrays.sort(arr);
			//출력
			for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			*/
	
	
	 //(강사님)
	   
	   //1~ 45사이의 중복되지 않은 랜덤한 수 6개를 만드는 코드를 작성하세요.(contains 메서드를 이용)
		int arr[] = new int[6];
		int min = 1, max = 45;
		if(createRandomArray(min, max, arr)) {
			System.out.println("배열 생성 성공");
			for(int tmp : arr) {
				System.out.println(tmp + " ");
			}
			System.out.println();
			
		}else {
			System.out.println("배열 생성 실패!");
		}
		
		
		
		int [] user = new int[6];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 6개 입력(중복x, 1~45) : ");
		while(count < user.length) {
			int num = scan.nextInt();
			if(!contains(user, count, num) && (num >= min && num <= max)) {
				user[count] = num;
				count++;
			}
		}
		for(int tmp : user) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		scan.close();
	}
	  /* 기능 : min ~ max 사이의 중복되지 않은 랜덤한 수를 배열에 만들어 주고 생성 여부를 알려주는 메서드 
	  * 매개변수 : 최소값, 최대값, 배열 => int min, int max, int []arr
	  * 리턴타입 : (생성여부 에서 힌트 얻기) => boolean
	  * 메서드명 : creatRandomArray 
	  */
	public static boolean createRandomArray(int min, int max, int []arr) {
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		//max가 min보다 작으면
		if(max < min) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		//배열의 크기가 min~max 사이의 정수 개수보다 클 때
		if(arr.length > max - min + 1) {
			return false;
		}
		//반복문 생성 : 저장된 숫자의 개수가 배열의 크기보다 작을때까지 반복
		int count = 0; //저장된 숫자의 개수
		while(count < arr.length) {
			//랜덤수 생성
			int i = random(min, max);
			
			//중복 확인
			if(!contains(arr, count, i)) {
				//중복되지 않으면 배열에 저장
				arr[count] = i;
				//저장된 숫자의 개수를 1 증가
				count++;
			}
		}
		return true;
	}
	
	// [1, 2, 0, 0, 0] => 배열에서 0번지부터 2개 중에서 0과 일치하는 값이 있나? false
	/* 기능 : 배열이 주어지고 배열의 0번지부터 n개 중에서 num와 같은 값이 있는지 없는지를 알려주는 메서드
	 * 매개변수 : 주어진 배열, 검사할 배열의 갯수, 비교할 정수 => int [] arr, int n, int num 
	 * 리턴타입 : 같은 값이 있는지 없는지 => boolean
	 * 메서드명 : contains
	 */
	public static boolean contains(int [] arr, int n, int num) {
		//배열 생성이 안됐거나 크기가 0이면 false 처리
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		//배열의 크기보다 비교할 개수가 많으면 바꿔줌
		if(arr.length < n) {
			n = arr.length; //비교할 개수를 배열의 크기로 수정
		}
		for(int i = 0; i < n; i++) {
			//배열에 num과 같은 값이 있으면
			if(arr[i] == num) {
				return true;
			}
		}
		//반복문이 끝날때까지 같은게 없으면
		return false;
	}
	
	/* 기능 : min ~ max 사이의 랜덤한 수를 생성해서 알려주는 메서드
	 * 매개변수 : 최소값과 최대값 => int min, int max
	 * 리턴타입 : 생성된 랜덤한 수 => 정수 => int
	 * 메서드명 : random
	 */
	public static int random(int min, int max) {
		if(max < min) {
			int tmp = max;  //*** 순서 바꾸는거 자주 나옴 기억! C = A;
			max = min;								// A = B;
			min = tmp;								// B = C;
		}
		return (int)(Math.random()*(max - min + 1) + min);
	}
}

