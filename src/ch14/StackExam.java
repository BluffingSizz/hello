package ch14;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		String[] nation = {"한국", "일본", "중국","미국","영국"};
		
		Stack<String> s = new Stack<>();
		for(String str : nation) {
			s.push(str);//스택에 입력
		}
		
		System.out.println(s.pop());//stack에서 pop(출력)
	}

}
