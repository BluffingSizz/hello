package test;

public class Book {
	String book, name, publi;
	int year,price,num,tot_price;

	public void setBook(String book) {
		this.book = book;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPubli(String publi) {
		this.publi = publi;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public void print() {
		tot_price = price * num;
		System.out.println("======================================================");
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println("------------------------------------------------------");
		System.out.println(book+"\t"+name+"\t"+publi+"\t"+year+"\t"+price+"\t"+num+"\t"+tot_price);
		System.out.println("======================================================");
		
	}

}
