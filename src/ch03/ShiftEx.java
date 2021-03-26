package ch03;

public class ShiftEx {
	
	public static void main(String[] args) {
		int a = 2;
		int b = a << 2 ;//a의 값을 좌측으로 2비트씩 쉬프트(밀어내기)
		System.out.println(b);//0010(2) =>  1000(2)=8
		b = b >> 2;
		System.out.println(b);
		
	}

}
