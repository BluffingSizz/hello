package ch12;

public class ActionExam {
	public static void main(String[] args) {
		//좌변:부모,      우변 :자식
		Action action = new MyAction() {
			public void exec() {
				System.out.println("익명클래스 exec_inner");
			}
		};//익명클래스
		action.exec();
	}

}
