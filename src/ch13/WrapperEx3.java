package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String a ="Hello 1234";
		for(int i = 0 ; i<a.length() ; i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				System.out.println(a.charAt(i)+"는 문자입니다.");
			}else if(Character.isDigit(a.charAt(i))) {
				System.out.println(a.charAt(i)+"은 숫자입니다.");
				break;
			}
		}
		System.out.println("문자 "+a.substring(6)+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(a.substring(6))+"입니다.");
		System.out.println("숫자 1234+2 = "+(Integer.parseInt(a.substring(6))+2)+"입니다.");
		
			}

}
