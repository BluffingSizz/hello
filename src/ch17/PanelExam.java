package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{
	
	public PanelExam() {
		//패털에는 2개 이상의 컴포넌트를 배치할 수 있음.
		//패널에 여러개의 컴포넌트를 배치한 후
		//프레임에 패널을 붙이면 1개를 붙인 효과가 됨
		JPanel p = new JPanel();
		p.setBackground(Color.RED);//패널의 배경색상 설정
		
		JButton button1=new JButton("버튼1");
		JButton button2=new JButton("버튼2");
		JButton button3=new JButton("버튼3");
		JButton button4=new JButton("버튼4");
		JButton button5=new JButton("버튼5");
		JButton button6=new JButton("버튼6");
		
		p.add(button1);
		p.add(button6);
		add(p, BorderLayout.NORTH);
		add(button2);//위치를 생략하면 Center로 배치
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300, 300);//화면 사이즈 설정
		setVisible(true);
		//윈도우 닫기 버튼을 눌렀을 때의 동작(완전히 종료)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PanelExam();//생성자는 메소드와 달리 생성과 동시에 호출
		//참조변수 생략가능
	}

}
