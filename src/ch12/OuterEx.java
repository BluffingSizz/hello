package ch12;

public class OuterEx {
	class Num {
		int num = 2;
	}
	
	static class Name {
		static String name = "김길동";
	}
	
	void Email() {
		class mail{
			String email = "kim@gmail.com";
		}
		mail ml = new mail();
		System.out.println(ml.email);
		
	}

}
