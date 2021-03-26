package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv =new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		
		//Controllable클래스의 static 메소드인 reset()은 클래스이름.메소드이름
		//으로 접근가능
		
		Controllable.reset();
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
	}

}
