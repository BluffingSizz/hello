package ch13;

public class WrapperEx2 {
	public static void main(String[] args) {
		//Charcater  사용
		System.out.println(Character.toLowerCase('A'));//'A'를 소문자로 변환
		char c1 ='4', c2 = 'F';
		if(Character.isDigit(c1))
			System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2))
			System.out.println(c2+"는 영문자");
		
		//Integer 사용
		System.out.println(Integer.parseInt("200"));//문자열 "200"을 10진수로 변환
		System.out.println(Integer.toString(200));//정수 200을 문자열 200으로 변환
		System.out.println(Integer.toBinaryString(200));//정수 200을 2진수문자열로 변환
		
		Integer i = new Integer(200);
		System.out.println(i.doubleValue());//정수를 double 값으로 변환(unboxing)
		
		//Double 사용
		Double d = new Double(3.14);
		System.out.println(d.toString());//Double을 문자열"3.14"로 변환
		System.out.println(Double.parseDouble("3.14"));//문자열을 실수 3.14로 변환
		
		boolean b = (4>3);//b는 true
		System.out.println(Boolean.toString(b));//boolean형 true를 문자열"true"로 변환
		System.out.println(Boolean.parseBoolean("false"));//"false"문자열을 boolean형 false로 변환
		

	}

}
