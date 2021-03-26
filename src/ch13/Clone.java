package ch13;

//인스턴스를 복제하려면 Cloneable
public class Clone implements Cloneable{
	int num = 10;
	void print() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Clone t1=new Clone();
		Clone t2=null;
		try {//예외가 발생할 가능성의 코드처리
			t2=(Clone)t1.clone();//인스턴스를 복제함.clone()은 Object의
			//메소드이기 때문에 좌변과 맞추기 위해(Clone)형변
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}

}
