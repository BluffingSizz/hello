package ch16;

public class ThreadExam1 {
	public static void main(String[] args) {
		//MyThread1인스턴스를 2개 만듦
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		//쓰레드를 생성하고, Thread 클래스가 가지고 있는 start()메소드를 호출하면서
		//동시에 run()메소드를 호출한다. main 쓰레드를 포함해서 모두 3개의
		//스레드 실행됨
		t1.start();
		t2.start();
	}

}
