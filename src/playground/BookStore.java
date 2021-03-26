package playground;

public class BookStore {
	
	private String book;
	private String name;
	private String pub;
	private int year;
	private int price;
	private int num;
	private int tot_price;
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
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
	public int getTot_price() {
		tot_price = price * num;
		
		return tot_price;
	}
	public void setTot_price(int tot_price) {
		this.tot_price = tot_price;
	}
	
	public void print() {
		System.out.println("======================================================");
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println("------------------------------------------------------");
		System.out.println(book+"\t"+name+"\t"+pub+"\t"+year+"\t"+price+"\t"+num+"\t"+tot_price);
		System.out.println("======================================================");
	}

}
