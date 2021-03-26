package ch07;

public class Television {
	//전역변수, 멤버변수-자동초기화된다(정수형=0, 실수형=0.0, 불린=false, 문자=null)
	int channel; //채널 번호 channel=0
	int volume; //볼륨 volume=0
	boolean onOff; //전원상태 onOff=false
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 "+ volume + "입니다.");
	}
	
	int getChannel() {
		return channel;
	}
	
	int setchannel(int a) {
		return channel = a;
	}

}


