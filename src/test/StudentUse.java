package test;

public class StudentUse {
	public static void main(String[] args) {
		SInfo si1 = new SInfo("홍길동","서울 강동구","hong@gmail.com");
		si1.address();
		SInfo si2 = new SInfo("홍길동",90,85,79);
		si2.point();
	}

}
