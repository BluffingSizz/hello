package ch12;

public class InnerEx2 {
	public static void main(String[] args) {
		System.out.println("--------------------------------------------");
		
		OuterEx oe = new OuterEx();
		OuterEx.Num  nu = oe.new Num();
		System.out.println("고객번호 : "+nu.num);
		
		System.out.println("이름 : "+OuterEx.Name.name);
		
		oe.Email();
		
		System.out.println("--------------------------------------------");
	}

}
