package ch07;

public class TelevisionTest {
	
	public static void main(String[] args) {
		Television tv = new Television(); //Television.java의 객체 생성
		//tv는 참조변수(=메모리의 주소값을 가짐);
	    tv.channel = 7;
	    tv.volume = 9;
	    tv.onOff = true;
	    System.out.println("텔레비전의 채널은"+tv.channel+"이고 볼륨은"
	    		+tv.volume+" 입니다. ");
		
	}

}
