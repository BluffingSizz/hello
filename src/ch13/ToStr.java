package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object();
		//오토박싱(auto boxing)
		obj = new Integer(20);//참조변수에는 원래 주소값이 들어가지만 java1.5버전부터는
		//value가 들어갈 수 있도록 내부처리(intValue()등을 호출)하도록 했다.(Auto Boxing)
		System.out.println(obj);//오토언박싱(auto unboxing)
		//obj=new Double(20.5);
		obj = 20.5;
		System.out.println(obj);
//		obj = "hello";
		obj = new String("hello");
		
		
		System.out.println(obj);
	}

}
