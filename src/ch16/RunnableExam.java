package ch16;

public class RunnableExam implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
		
	}//end run
	
	public static void main(String[] args) {
		RunnableExam e1 = new RunnableExam();
		//Runnable을 쓸 때는 Thread를 별도로 생성해서 써야 한다. 참고로 Java는
		//단일 상속만을 하기 때문에 다른 객체와 함께 상속받아 쓰레드를 구현하려면
		//implements Runnable로 처리해야 한다
		
		//new Thread(스레드구현객체, "스레드이름");
		Thread t1 = new Thread(e1,"thread1");
		Thread t2 = new Thread(e1,"thread2");
//		t1.run();//에러는 아니지만 main인 싱글쓰레드가 돌아간다.
		
		t1.start();//run()이 호출됨
		t2.start();
	}

}
