package playground;

public class ArrayScore2 {
	public static void main(String[] args) {
		int score[][] = {{100,87,80,0,0},{100,90,80,0,0},{100,80,50,0,0},{90,80,80,0,0},{70,80,19,0,0}};
		for(int i =0; i<5; i++) {
			for(int j=0; j<3; j++) {
				score[i][3] += score[i][j];
			}
			score[i][4] =score[i][3]/3;
		}
		System.out.println("번호"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
		System.out.println("-----------------------------------------------------------------");
		for(int i= 0; i<score.length;i++) {
			System.out.print(i+1+"\t");
			for(int j=0; j<score.length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("-----------------------------------------------------------------");
		int kor_sum =0;
		int eng_sum =0;
		int mat_sum =0;
		for(int i =0; i<score.length; i++) {
			kor_sum += score[i][0];
			eng_sum += score[i][1];
			mat_sum += score[i][2];
		}
		System.out.println("총학생의 과목별 총점 : 국어 "+kor_sum+"  영어 "+eng_sum+"   수학 "+mat_sum);
	}

}
