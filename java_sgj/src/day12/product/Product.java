package day12.product;

public abstract class Product {

	//공통 되는 제품 정보 (브랜드, 제품코드, 제품명)
		String brand, code, name;

	public Product(String brand, String code, String name) {
		super();
		this.brand = brand;
		this.code = code;
		this.name = name;
	}
		
	public abstract void print();
}
