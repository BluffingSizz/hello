package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx extends JFrame{
	JPanel jp;//패널 초기화
	JButton jb1, jb2, jb3, jb4, jb5, jb6;//버튼 초기화
	//GUI 코드처리는 기본생성자 안에서 처리
	public FlowLayoutEx() {
		super("FlowLayout 테스트");//부모생성자 호출,타이틀 처리
		jp = new JPanel();//그룹화할 패널을 생성
		//버튼
		jb1=new JButton("버튼1");
		jb2=new JButton("버튼2");
		jb3=new JButton("버튼3");
		jb4=new JButton("버튼4");
		jb5=new JButton("버튼5");
		jb6=new JButton("버튼6");
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		//FlowLayout으로 설정
		jp.setLayout(new FlowLayout());
		
		add(jp);//JFrame에 패널 추가
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
