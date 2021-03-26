package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a =10;
		Object obj = 20;
		
		a=(Integer)obj;
		System.out.println(a);
		
		//오토박싱
		//각데이터가 Object객체(Integer,Double,Boolean등...)
		//Object자체를 쓰면 메모리낭비가 심하다. 이렇게 쓰는 일은 없는대신 컬렉션(ArrayList등)
		//을 쓰면 단점을 보완할 수 있다.
		Object[] obj2 = { 100,100.5,true,"hello", 'A'};
		for(Object o : obj2) {//향상된 for문
			System.out.println(o);//
		}
	}

}
