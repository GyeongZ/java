package day11.product;

	/* 특징
	 * 중복된 제품명 X
	 */

public class Product {
	private String name;
	private int amount, buyPrice, price, salePrice;
	
	//getter, setter, 제품 정보 출력, 제품 할인 금액 수정
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBuyprice() {
		return buyPrice;
	}

	public void setBuyprice(int buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	
	//제품정보 출력, 제품 할인금액 수정
	/**제품 정보를 출력하는 메서드
	 * 이름, 가격, 수량 순으로 출력
	 */
	public void print() {
	System.out.println("제품명 : " + name + ", 수량 : " + amount + ", 가격 : " + salePrice );
	}
	
	public void updateSalePrice(int price) {
		salePrice = price;
	}
	
	
	//생성자 : 제품명, 수량, 금액이 주어진 생성자
	public Product(String name, int amount, int buyPrice, int price) {
		this.name = name;
		this.amount = amount;
		this.buyPrice = buyPrice;
		this.price = price;
		this.salePrice = price*amount; //판매 금액 곱하기 갯수 했음 그러면 메뉴 4번에서 판매 총 금액 나올것임
		
	}

	public void updateAmount(int amount) {
		//기존 수량에 새 수량을 누적 해야하기때문에 +=으로 표시
				this.amount += amount; //this.amount = this.amount + amount; 
	}
	public boolean equals(String name) {
		return this.name.equals(name);
	}



}
