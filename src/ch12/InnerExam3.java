package ch12;

public class InnerExam3 {
	public void exec() {
		class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
		}//inner class(지역중첩클래스)
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}//end exec() 메소드

	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();
	}
}
