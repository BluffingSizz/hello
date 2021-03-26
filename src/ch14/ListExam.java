package ch14;

import java.util.ArrayList;
import java.util.List;


//ArrayList : Vector와 사용법이 비슷하지만 좀 더 가볍고 속도가 빠름
public class ListExam {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();//다양한 자료형 처리 가능
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+"\t");
		}
	}

}
