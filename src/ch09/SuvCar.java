package ch09;

public class SuvCar extends Car{
	String road;
	String gear;
	
	public void SetRoad(String road) {
		this.road = road;
	}
	public void SetGear(String gear) {
		this.gear = gear;
	}
	
	public void print() {
		System.out.println("최대속도 : "+speed+"Km");
		System.out.println("주행도로 : "+road);
		System.out.println("기어 : "+gear);
	}

}
