package day12;


public class InheritanceEx1 {

	public static void main(String[] args) {
		//상속 예제
		Car c1 = new Car("K3", "기아", 4);
		c1.print();
		
		KiaCar k1 = new KiaCar();
		k1.brand = "기아";
		k1.name = "레이";
		k1.print();
		
		HyundaiCar h1 = new HyundaiCar();
		h1.brand = "현대";
		h1.name = "아반떼";
		h1.print();
	}

}
//자동차 클래스
class Car{
	/* 접근제어자 디폴트 */
	String name, brand;
	int wheelCount; //바퀴 수
	boolean power;
	int speed;
	
	void turn() {
		power = !power;
	}
	void speed(int speed) {
		this.speed += speed; 
	}
	
	//생성자
	public Car(String name, String brand, int wheelCount) {
		this.name = name;
		this.brand = brand;
		this.wheelCount = wheelCount;
	}

	public Car() {} //51번째줄 빨갛게 안뜨게 하기 위해서 코드 단순하게 입력만 해놓음
	
	public void print() {
		System.out.println("회사 : " + brand);
		System.out.println("차명 : " + name);
	}
}
//기아차 클래스 : 기아자동차는 자동차이다.
class KiaCar extends Car{

	public String name;
	/*
	 * public KiaCar() {
		super(" ", "기아", 4);
	}
	*/
	
}

//현대차 클래스 : 현대자동차는 자동차이다.
class HyundaiCar extends Car{
	
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
