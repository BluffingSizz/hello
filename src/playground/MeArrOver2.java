package playground;

public class MeArrOver2 {
	static String[] name;
	static int[] num;
	static String[] name_bg = new String[3];
	static String[] boygirl = {"남", "여"};
	static int[] Java = {90,99,86};
	static int[] DB = {85,95,75};
	static int[] HTML = {99,96,89};
	static int[] JSP = {85,87,95};
	static int[] tot = new int[3];
	static double[] avg;
	static double tot_avg;
	static void calc() {
		for(int i =0 ; i<3; i++) {
			tot[i] = Java[i]+DB[i]+HTML[i]+JSP[i];
		}
	}
	
	static  void load (String ... n) {
		String[] name = new String[n.length];
		for (int i =0; i<n.length;i++) {
			name[i]= n[i];
		}
	}
	static void load (int ... n) {
		int[] num = new int[n.length];
		for( int i =0; i<n.length; i++) {
			num[i] =n[i];
			if (num[i]%2 ==0) {
				name_bg[i]=boygirl[1];
			}else {
				name_bg[i]=boygirl[0];
			}
		}
	}
	static void load (double ... n ) {
		double[] avg = new double[n.length];
		for(int i =0 ;i<n.length; i++) {
			avg[i] =n[i];
		}
	}
	
	public static void main(String[] args) {
		load("홍길동","사임당","이순신");
		load(12345,23456,34567);
		
		System.out.println(num[1]);	
		
	}
}

