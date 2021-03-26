package ch12;

public class StaticInner {
	static int x = 10;
	static class Inner{
		int getX() {
			return x;
		}//ends gerX()
	}//end inner class
	
	public static void main(String[] args) {
		StaticInner.Inner in = new StaticInner.Inner();
		System.out.println(in.getX());
	}

}
