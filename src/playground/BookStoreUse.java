package playground;

public class BookStoreUse {
	
	public static void main(String[] args) {
		BookStore b1 = new BookStore();
		b1.setBook("Java");
		b1.setName("김선생");
		b1.setPub("미래");
		b1.setYear(2021);
		b1.setPrice(30000);
		b1.setNum(10);
		b1.getTot_price();
		b1.print();
	}

}
