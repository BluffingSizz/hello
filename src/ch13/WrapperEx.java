package ch13;

//Wrapper class(래퍼 클래스) : 기본자료형을 포장하는 클래스
//기본 자료형에 대한 다양한 method를 지원
//byte		Byte
//short		Short
//int		Integer
//long		Long
//folat		Float
//double	Double
//char		Character
//boolean	Bollean


public class WrapperEx {
	public static void main(String[] args) {
		Integer i1=10;//auto boxing(기본형 자료데이터를 객체로 포장하는 작업)
		Integer i2=new Integer(20);
		int num1=i1.intValue();
		int num2=i2;//auto unboxing(객체로 포장된 value를 꺼내는 작업)
		int sum=num1+num2;
		System.out.println(sum);
		//2진수 문자열로
		System.out.println(Integer.toBinaryString(sum));
		//8진수 문자열로
		System.out.println(Integer.toOctalString(sum));
		//16진수 문자열로
		System.out.println(Integer.toHexString(sum));
		System.out.println(Integer.MAX_VALUE);//정수의 최대값
		System.out.println(Integer.MIN_VALUE);//정수의 최소값
		System.out.println(Integer.parseInt("100"));//parseInt()는 문자열을
		//정수로 바꿈, 웹프로그램에 많이쓰는메소드임(웹이력이 모두 문자열이기 때문)
		System.out.println(Integer.toString(100));
		System.out.println(100+"");//해당데이터 근처에 ""문자열을 연결하면 문자열이됨
		
		
		
	}

}
