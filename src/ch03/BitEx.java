package ch03;

public class BitEx {
	
	public static void main(String[] args) {
		//비트연산자( or(|), and(&), xor(^))
		System.out.println( 3 | 5);// 00000011 | 00000101 (두 비트가 모두 0 일때만 0이며, 나머지는 모두 1이다.) -> 111=7
		System.out.println( 3 & 5);// 00000011 & 00000101 (두 비트가 모두 1 일때만 1이며, 나머지는 모두 0이다.) -> 001=1
		System.out.println( 3 ^ 5);// 00000011 ^ 00000101 (두 비트가 서로 다를때는 1,동일할때는 0이다.) -> 110=6
	}

}
