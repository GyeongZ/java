package day12;

public class OverrideEx1 {

	public static void main(String[] args) {
		D d = new D();
		d.print1();//오버라이팅을 이용하여 재정의된 매서드가 호출
		System.out.println("--------");
		d.print2();
		System.out.println("--------");
		d.print1(20);

	}
class C{
	protected int num1 = 1, num2 = 2;
	
	protected void print1() {
		System.out.println(num1);
		System.out.println(num2);
	}

	public void print2() {
		System.out.println(num1);
		System.out.println(num2);
	}
}
class D extends C{
	

	@Override
	
	/*안되는 이유 1. 매개변수가 부모 클래스에는 없음
	 * 2. 부모 클래스에서 접근제어자가 protected 였는데 여기서는 default.
	 
	void print1(int num1){
	
}
	 */
	
}
{
	
}
}

