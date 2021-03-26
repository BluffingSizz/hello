package ch14;

import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		//Vector v = new Vector();//에러는아니지만 아래처럼 처리하는게 좋다.
		Vector<Object> v = new Vector<>();
		//모든 자료형 처리 가능
		//사이즈가 자동으로 늘어남
		System.out.println("초기사이즈 : "+v.capacity());
		//벡터는 기본적으로 10개의 길이값을 가지고 있다.
		//만약에 자료가 1개 더 추가되면 10이 더 늘어난 20으로 사이즈를 확보
		v.add("first");//add("추가할 자료")
		v.add(2);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		
		System.out.println("중간사이즈 : "+v.capacity());
		System.out.println("데이터의 갯수 : "+v.size());
		
		System.out.println("초기 데이터 : ");
		for(int i = 0; i<v.size();i++) {
			System.out.println(v.get(i)+"\t");//배열[i]처럼 쓰면 안된다.
		}
		
		System.out.println();
		v.add(5,102);//백터의 인덱스 5번에 102라는 데이터 추가
		System.out.println("최종 데이터 : ");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i)+"\t");//배열[i]처럼 쓰면 안된다.
		}
		
		System.out.println("중간사이즈 : "+v.capacity());
	}

}
