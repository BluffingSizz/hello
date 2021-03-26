package playground;

public class Sale extends Product{
	private int price;
	private int amount;
	private int money;
	
	public Sale(int code, String name, String company, String date, int price, int amount) {
		super.Product(code, name, company, date);
		this.price = price;
		this.amount = amount;
		this.company = company;
		money = amount * price;
	}
	
	public void print() {
		System.out.println("==========================================");
		System.out.println("코드"+"\t"+"제품명"+"\t"+"제조사"+"\t"+"제조일자"+"\t"+"단가"+"\t"+"수량"+"\t"+"판매금액(단위:천원)");
		System.out.println(code+"\t"+name+"\t"+company+"\t"+date+"\t"+price+"\t"+amount+"\t"+money);
		System.out.println("==========================================");
	}

}
