package playground;

public class BreakEx4 {
	public static void main(String[] args) {
		int n =1;
		while(true) {
			System.out.println(n+" Hello World");
			n++;
			if(n==8) {
				break;
			}
		}
	}

}
