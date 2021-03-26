package ch02;

public class PrintDemo {
	public static void main(String[] args) {
		int i =97;
		String s = "Java";
		double f = 3.14;
		System.out.printf("%d\n", i);
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%05d\n", i);
		System.out.println(s+" " + f );
		System.out.printf("%s\n",s);
		System.out.printf("%5s\n",s);
		System.out.printf("%-5s\n",s);
		System.out.printf("%f\n",f);
		System.out.printf("%-4.1f\n",f);
		System.out.printf("%e\n",f);
	}

}
