package ch13;

public class StrMethod2 {
	public static void main(String[] args) {
		String str1;
		str1="Java, DB, HTML, Jsp Programming";
		
		System.out.println("1)index번호 4의 문자 : "+str1.charAt(4));
		System.out.println("2)\"HTML\"의 H의 문자위치 : "+str1.indexOf("HTML"));
		System.out.println(str1.substring(16,19));
		System.out.println(str1.substring(20));
		System.out.println(str1.replace("DB", "Oracle"));
	}

}
