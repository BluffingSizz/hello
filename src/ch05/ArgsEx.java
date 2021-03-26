package ch05;

public class ArgsEx {
	//명령형 매개변수 (command line arguments)
	//자바 클래스를 실행할 때 옵션을 주는 것
	//입력한 매개변수들은 배열로 저장됨, args는 참조변수
	//배열참조변수.length =>배열의 사이즈
	//배열참조변수[인덱스]=>인덱스는 0부터 시작
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째 매개변수:"+args[i]);
			
		}
	}

}
