package playground;

public class NameUnicode {
	public static void main(String[] args) {
		char a = '\uD55C';
		char b = '\uB300';
		char c = '\uC131';
		
		System.out.print(a);
		System.out.print(b);
		System.out.println(c);
		System.out.println("char형(\'\\uD55C\'):"+a);
		System.out.println("char형(\'\\uB300\'):"+b);
		System.out.println("char형(\'\\uC131\'):"+c);
	}

}
