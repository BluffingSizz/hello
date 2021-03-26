package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		String[] fruits = {"사과", "배", "포도", "딸기", "수박"};
		LinkedList list = new LinkedList();
		for(String str : fruits) {
			list.offer(str);//큐 구조에 자료 입력
		}
		String str="";
		while((str=(String)list.poll()) != null) {//poll() 자료 꺼내기
			//poll()자료형이 E(미정)이기 때문에 (String)처럼 자료형을 적어주어야한다.
			System.out.println(str+" 삭제되었습니다.");
			
		}
	}

}
