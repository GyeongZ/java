package hyo;

import java.util.Scanner;

public class For_3 {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
        
        // 2 - 100 사이 소수 출력
        
	    // 2부터 100까지의 수 중 소수를 찾음
	    for (int i = 2; i <= 100; i++) {
	        boolean isPrime = true;
	    
	        // i를 2부터 i-1까지의 수로 나누어 소수 여부를 확인
	        for (int j = 2; j < i; j++) {
	            if (i % j == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	
	        // 소수인 경우 출력
	        if (isPrime) {
	            System.out.println(i);
	        }
	    }
	    
	    int s = 0;
	    while (true) {
	    	
	    	// 입력한 숫자의 구구단 출력
	    	System.out.println("구구단 숫자를 입력하세요 : ");
	    	int q = scan.nextInt();
	    	
	    	for(int k = 1; k<10; k++) {
	    		System.out.println(q + "x" + k + "=" + q*k);
	    	}
	    	
    		// 0입력하면 종료
	    	System.out.println("0을 입력하면 종료됩니다.");
	    	System.out.println("입력창 : ");
	    	s = scan.nextInt();
	    	
	    	if(s == 0) {
	    		System.out.println("종료됩니다.");
	    		for(int i = 2; i <= 100; i++) {
	    	        int count = 0;
	    	        for(int j = 2; j < i; j++) {
	    	           if(i%j == 0) {
	    	              count++;
	    	           }
	    	        }
	    	        if(count == 0) {
	    	           for(int k = 2; k <=9; k++) {
	    	              System.out.println(i + "x" + k + "=" + i*k);
	    	           }
	    	           System.out.println();
	    	           count = 0;
	    	        }
	    	     }
	    		break;
	    	}
	    	
	    }
    }
}
    