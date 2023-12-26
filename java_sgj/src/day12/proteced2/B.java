package day12.proteced2;

import day12.proteced1.A;

public class B extends A {

	public void print() {
		
		//num1은 private라서 자식 클래스에서도 접근 안됨
		//System.out.println("num1" + num1);
		
		//num2은 default라서 다른 패키지에 있는 클래스에서도 접근 안됨
		//System.out.println("num2" + num2);
		
		//num3는 protected라서 다른 패키지와 상관 없이 자식 클래스에서 접근 가능
		System.out.println("num3" + num3);
		
		//num4은 public 이라서 자식 클래스에서도 접근 안됨
		System.out.println("num4" + num4);
	}
}
