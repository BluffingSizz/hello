package ch13;

public class StrEX {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//소문자로 변경
		System.out.println(str.toLowerCase());
		//원본은 바뀌지 않음(불변성)
		System.out.println(str);
		str=str.toLowerCase();//기존 str 주소값은 끊어지고 toLowerCase처리한 문자열 새로연결
		System.out.println(str);
		
		str = "";//빈 (널)문자열('\0')을 가리킴
		System.out.println("내용:"+str);
		str = null;//참조하는 내용이 없어짐(주소값이 초기화됨)
		System.out.println("내용:"+str);
		
		char ch = '\0';//널문자
		System.out.println("내용:"+ch+",code:"+(int)ch);
		ch=' ';
		System.out.println("내용:"+ch+",code"+(int)ch);
	}

}
