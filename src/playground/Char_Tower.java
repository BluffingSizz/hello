package playground;

//tip char a = 65;//65 ASCII코드값으로 'A', 66='B',67='C'...
public class Char_Tower {
	public static void main(String[] args) {
		char a = 'A';
		for (int i=1; i<=4;i++) {
			for (int j=1; j<=i;j++) {
				System.out.printf("%s",a);
				a++;
				
			}
			System.out.println();
		}
	}

}
