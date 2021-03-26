package ch02;

public class Light {
	public static void main(String args[]) {
		//long은 64비트(8바이트)정수를 저장
		long lightspeed;
		long distance;
		
		lightspeed = 300000L;
		distance = lightspeed * 365 * 24 * 60 * 60;
		//빛의속도 * 365일 * 24시 * 60분 * 60초
		System.out.println("빛이 1년 동안 가는 거리 : "+distance + "km");
		// + 기호는 연결 연산자
	}

}
