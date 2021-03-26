package playground;

public class ArrayPoint2 {
	public static void main(String[] args) {
		String[] name = {"홍길동","이순신","김유신"};
		int[] JAVA = {100,95,90};
		int[] DB = {90,80,75};
		int[] HTML = {70,90,95};
		int[] JSP = {60,100,98};
		int[] sum = new int[3];
		double[] avg = new double[3];
	    double tot_avg =0;
		for(int i =0;i<3;i++) {
			sum[i]= JAVA[i]+DB[i]+HTML[i]+JSP[i];
			avg[i]= sum[i]/4.0;
		}
		System.out.println("====================================================");
		System.out.println("이름\tJAVA\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("====================================================");
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"\t"+JAVA[i]+"\t"+DB[i]+"\t"+HTML[i]+"\t"+JSP[i]+"\t"+sum[i]+"\t"+String.format("%4.1f", avg[i]));
			tot_avg += avg[i];
		}
		System.out.println("------------------------------------");
		System.out.println("학급평균:"+String.format("%4.1f", tot_avg/3.0));
		System.out.println("------------------------------------");
		
 		
	}

}
