package ch02;

public class HelloExam {
   public static int sum(int n,int m) {//n=20, m=10
	   return n+m;//n+m=30
   }
   
   public static void main(String args[]) {
	   int i = 20;
	   int s;
	   char a;
	   
	   s = sum(i,10);//s=30
	   a = '?';
	   System.out.println(a);
	   System.out.println("Hello");
	   System.out.println(s);
			   
   }
}
