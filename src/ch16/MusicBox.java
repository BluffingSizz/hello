package ch16;

public class MusicBox {
	
	//메소드 앞에 synchronized를 붙이면 해당메소드는객체의 사용권(Monitoring Lock)을
	//얻는다. 해당 메소드가 모두 수행한 후에 다른 메소드가 수행된다.
	//해당 모니터링락은 메소드 실행이 종료되거나, wait()와 같은 메소드를 만나기전까지는 유지된다.
	//다른 쓰레드들은 모니터링 락을 놓을때까지 대기한다.
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("신나는 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//for
	}//end playmusica()
	
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("슬픈 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//for
	}//end B()
	
	//synchronized를 처리하지 않은 메소드는 다른 쓰레드들이 synchronized메소드를
	//실행하면서 모니터링 락을 획득했다 하더라도, 그것과 상관없이 실행된다.
	
	public synchronized void playMusicC() {
		for(int i=0; i<10; i++) {
			//synchronized를 메소드에 쓸 경우, 메소드의 코드가 길어지면, 마지막에
			//대기하는 쓰레드가 너무 오래 기다리는것을 막기 위해서 메소드에 synchronized를
			//처리하지 않고, 처리하고자 하는 특정코드에만 synchronized블록을 사용한다.
			System.out.println("카페 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//for
	}//end C()

}
