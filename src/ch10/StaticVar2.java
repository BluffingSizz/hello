package ch10;

public class StaticVar2 {
	static int total;//클래스 메모리영역에 생성(static)
	String model;//heap 영역에 생성됨(nonstatic, new)
	public StaticVar2(String model) {//생성자,
		this.model = model;
		total++;
	}

}
