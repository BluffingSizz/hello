package ch16;

public class ThreadJoin extends Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작되었습니다.");
		ThreadJoin e = new ThreadJoin();
		e.setName("thread1");//스레드의 이름 지정
		e.start();
		try {
			e.join();//새로운 작업을 요청하면 기다렸다가 다시실행-싱글스레드처럼 동작
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"스레드가 종료되었습니다.");
		
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작되었습니다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
