package day11.product;

public class Product {
	private int price, num;
	private String name;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**제품 정보를 출력하는 메서드
	 * 이름, 가격, 수량 순으로 출력
	 */
	public void printInfo() {
		System.out.print(name + ". ");
		System.out.print(price + " ");
		System.out.print(num + " ");
	}	
}
