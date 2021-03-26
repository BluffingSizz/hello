package ch14;

import java.util.Scanner;

public class Book {
	private String bookName;
	private String press;
	private int price;//단가
	private int amount;
	private int money;//판매금액(단가x판매수량)
	
	public void input() {
		Scanner scan =new Scanner(System.in);
		System.out.println("도서명을 입력하세요");
		bookName = scan.next();
		System.out.println("출판사를 입력하세요");
		press = scan.next();
		System.out.println("단가를 입력하세요");
		price = scan.nextInt();
		System.out.println("수량을 입력하세요");
		amount = scan.nextInt();
		money = price * amount;
	}

	public String getBookName() {
		return bookName;
	}

	public String getPress() {
		return press;
	}

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	public int getMoney() {
		return money;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
