package day17;

import day17.Customer.BankBook;
import lombok.AllArgsConstructor;
import lombok.Data;

public class SynchronizedEx1 {

	public static void main(String[] args) {
		BankBook bb = new BankBook();
		Customer c1 = new Customer()
		
		
		
		Thread t1 = new Thread(()->{
			c1.deposit(10000);
		});
		Thread t1 = new Thread(()->{
			c1.deposit(10000);
		});

}
@Data
@AllArgsConstructor
class Customer{
	private BankBook bankBook;
	private String name;
	
	public synchronized void deposit(int money) {
		
		int balance = bankBook.getBalance();
		bankBook.setBalance(balance + money);
		
		//2초 동안 현재 쓰레드를 일시중지
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + bankBook.getBalance());
	}


class BankBook{
	private int balance;
	}