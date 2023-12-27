package day13;

public interface program {
	//int num1 = 10; //변수 앞에 final static이 자동으로 추가된 것임
	//final static int num2 = 20;
	
	//메서드 앞에 public abstract가 자동으로 추가된 것
	void printMenu();
	public void runMenu(int menu);
	public abstract void printExit(); //셋 다 같은 것
	
	void run();
}

abstract class TestA{ //클래스 앞에 abstract 붙어야함 왜냐 맨 밑에 추상 메서드가 있기 때문에 추상클래스가 되었기 때문
	//클래스 안에서는 final static을 생략하면 멤버변수, 붙여주면 상수
	int num1 = 10; //멤버변수
	final static int num2 =20; //상수
	//클래스 안에서는 추상 메서드에 abstract가 자동으로 추가되지 않음
	public abstract void printMenu();
}