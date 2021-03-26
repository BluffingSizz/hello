package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener{
	private JFrame f;
	private Color c;
	private Container con;
	//component : 화면 구성 요소(프레임,버튼,...)
	//container : 다른 컴포넌트를 담을 수 있는 요소
	
	public MyColorAction(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();
		this.c = c;
	}
	
	//버튼을 클릭할 때 호출하는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상 처리
		
	}
	
	

}
