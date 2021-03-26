package ch10;

public class StaticVar2Use {
	public static void main(String[] args) {
		//static => 클래스 이름으로 접근, 객체생성 안함
		System.out.println(StaticVar2.total);
		
		//nonstatic => 객체생성 후 사용 가능
		StaticVar2 car1 = new StaticVar2("쏘나타");//인스턴스 생성
		StaticVar2 car2 = new StaticVar2("모닝");//인스턴스 생성
		StaticVar2 car3 = new StaticVar2("아반떼");//인스턴스 생성
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);//인스턴스가 3개 만들어졌어도
		//static은 공용으로 활용되는 영역이기 때문에 nonstatic이 생성될때마다 카운팅됨.
	}

}
