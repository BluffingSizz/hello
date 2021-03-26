package ch14;

public class ProdEx {
	private String product;
	private String num;
	private String company;
	private int price;
	private int amount;
	private int money;
	public ProdEx(String product, String num, String company, int price, int amount) {
		this.product = product;
		this.num = num;
		this.company = company;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}
	public String getProduct() {
		return product;
	}
	public String getNum() {
		return num;
	}
	public String getCompany() {
		return company;
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
	public void setProduct(String product) {
		this.product = product;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setCompany(String company) {
		this.company = company;
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
