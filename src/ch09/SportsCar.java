package ch09;

public class SportsCar extends Car{
	boolean turbo;
	
	
	public void setTurbo(boolean flag) {
		this.turbo = flag;
		System.out.println(turbo);
	}

}
