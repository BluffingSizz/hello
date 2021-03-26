package playground;

public class Switch_Point2 {
	public static void main(String[] args) {
		int java = 85;
		int db = 70;
		int html = 90;
		int jsp = 85;
		int spring = 75;
		String grade;
		int tot = java+db+html+jsp+spring;
		double avg = tot/5.0;
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			grade = "수";
			break;
		case 8:
			grade ="우";
			break;
		case 7:
			grade = "미";
			break;
		case 6 :
			grade = "양";
			break;
		default:
			grade = "가";
			
		}
		System.out.println("==========================================================");
		System.out.println("JAVA\tDB\tHTML\tJSP\tSPRING\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%4.1f\t%s\n",java,db,html,jsp,spring,tot,avg,grade);
		System.out.println("==========================================================");
		}
	}


