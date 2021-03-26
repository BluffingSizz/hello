package playground;

public class CastEx02 {
	public static void main(String[] args) {
		int a = 500;
		
		double d = (double)a; //int 를 double형으로 강제변환
		
		float b = 200.2f;
		
		int e = (int)b; // float 을 int형으로 강제변환
		
		int c = 128;
		
		byte f = (byte)c;// int 를 byte형으로 강제변환
		
		System.out.println("int a => double : "+d);
		System.out.println("float b => int : "+e);
		System.out.println("int c => byte : "+f);
		
		
	
	}

}
