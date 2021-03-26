package ch16;

//데몬 쓰레드는 보통 유닉스나 리눅스 운영체제에서 백그라운드로 동작하는 프로그램을 말함
//데몬쓰레드는 쓰레드에 데몬설정을 해서 쓴다. 윈도우에서는 서비스라고도 함.
//데몬쓰레느느 일반쓰레드가 모두 종료되면 강제적으로 종료되는 특징을 가짐.

public class DaemonThread implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
