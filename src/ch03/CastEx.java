package ch03;

public class CastEx {
	public static void main(String[] args) {
		float f = 1.6f;//4바이트로 저장
		System.out.println(f);
		
		f = 100;//자동형변환
		System.out.println(f);
		
		f = 100.5F;
		
		int i = (int)f;//강제형변화
		
		System.out.println(i);//소수점 이하는 손실됨
		
		i = 300;
		byte b =(byte)i;//강제형변환
		System.out.println(b);
	}

}
