package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//stringBuffer //초기버전용
		StringBuilder str1 = new StringBuilder();
		
		str1.append("java");//append()는 문자열 내용 추가,메모리 절약
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1.toString());
		
		str1.replace(0, 4, "jsp");//0~3 인덱스 내용을 변경(java ->jsp)
		System.out.println(str1);
		String str2=str1.substring(3);//인덱스 3번부터~ 끝까지("programming)
		System.out.println(str2);
		
		//String str3 = str1//error
		String str3 = str1.toString();
		System.out.println("stringBulider(str1) -> String(str3)에 저장 : "+str3);
		
	}

}
