package ch07;

public class TelevisionTest3 {
	
	public static void main(String[] args) {
		Television myTv = new Television(); //객체생성
		myTv.channel =7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print();
		System.out.println(myTv);
		
		Television yourTv = new Television(); //객체 생성
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff =true;
		yourTv.print();
		System.out.println(yourTv);
	}

}
