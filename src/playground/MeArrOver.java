package playground;


public class MeArrOver {
	static int[] num = {12345,23456,34567};
	static String[] name = {"홍길동" , "사임당" , "이순신"};
	static String[] name_bg = new String[3];
	static String[] boygirl = {"남", "여"};
	static int[] Java = {90,99,86};
	static int[] DB = {85,95,75};
	static int[] HTML = {99,96,89};
	static int[] JSP = {85,87,95};
	static int[] tot = new int[3];
	static double[] avg = new double[3];
	static double tot_avg;
	
	static void calc() {
		for(int i =0 ; i<name.length; i++) {
			tot[i] = Java[i]+DB[i]+HTML[i]+JSP[i];
			avg[i] = tot[i]/4.0;
			tot_avg = tot_avg+avg[i];
			if (num[i]%2 ==0) {
				name_bg[i]=boygirl[1];
			}else {
				name_bg[i]=boygirl[0];
			}
		}
		
	}
	
	static void print() {
		for(int i=0 ; i<name.length; i++) {
			System.out.println("------------------");
			System.out.println("학번 : "+num[i]);
			System.out.println("이름 : "+name[i]);
			System.out.println("성별 : "+name_bg[i]);
			System.out.println("Java점수 : "+Java[i]);
			System.out.println("DB점수 : "+DB[i]);
			System.out.println("HTML점수 : "+HTML[i]);
			System.out.println("JSP점수 : "+JSP[i]);
			System.out.println("총점 : "+tot[i]);
			System.out.println("평균 : "+avg[i]);
		}
		System.out.println("------------------");
		System.out.println("학생 수 : "+name.length);
		System.out.println("전체 평균 : "+String.format("%4.1f", tot_avg/name.length));
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		calc();
		print();
	}
	
	}
