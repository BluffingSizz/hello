package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1="java";
		str1 += " programming";//str1=str1+" programming",문자열 연결
		//실제로 새로운 문자열을 만들고 str1은 새로운 문자열의 주소값을 가리키게됨
		System.out.println(str1);
		System.out.println(str1.length());//문자열의 길이
		String str2=str1.concat(" programming");//concat()으로 문자열 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//n번째 문자
		System.out.println(str2.indexOf("program"));//해당되는 문자열에서 "program"의 시작문자열인 p 문자의 위치값을 리턴
		System.out.println(str2.indexOf("z"));//내용이 없으면 -1을 리턴
		System.out.println(str2.substring(0,4));//substring(strat,end-1)
		System.out.println(str2.substring(5));//5~ 끝까지
		System.out.println(str2.replace("java", "jsp"));//java -> jsp
	}

}
