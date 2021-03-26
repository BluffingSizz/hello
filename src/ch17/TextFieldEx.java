package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//플로우 레이아웃 설정
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));//텍스트길이 20
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과", 20));
		c.add(new JLabel("주소"));
		c.add(new TextField("서울시...",20));
		c.
		
		setSize(300, 200);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
