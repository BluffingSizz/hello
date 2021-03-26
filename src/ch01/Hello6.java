package ch01;

public class Hello6{
	public static void main(String args[]) {
		int num1 = 8,num2 = 4;
		
		System.out.println("+ 연산자에 의한 결과 :"+(num1 + num2));
		System.out.println("- 연산자에 의한 결과 :"+(num1 - num2));
		System.out.println("/ 연산자에 의한 결과 :"+(num1 / num2));
		System.out.println("* 연산자에 의한 결과 :"+(num1 * num2));
		System.out.println("% 연산자에 의한 결과 :"+(num1 % num2));
		
		char ch1 = 'b', ch2 = 'B';
		boolean result1, result2;
		
		result1 = (ch1>'a')&&(ch1 <'z');
		result2 = (ch2 < 'A')||(ch2 < 'Z');
		
		System.out.println("&& 연산자에 의한 결과 :"+ result1);
		System.out.println("|| 연산자에 의한 결과 :"+ result2);
		System.out.println("! 연산자에 의한 결과 :"+ result2);
		
}
}