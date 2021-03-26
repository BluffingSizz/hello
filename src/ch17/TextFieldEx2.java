package ch17;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx2 extends JFrame{
	public TextFieldEx2() {
		setTitle("텍스트 파일 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(new JLabel("학번 : "));
		c.add(new JTextField(20));
		c.add(new JLabel("이름 : "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 : "));
		c.add(new JTextField("전산학과",20));
		c.add(new JLabel("전화번호"));
		c.add(new JTextField("010-1234-5678",20));
		c.add(new JButton("확인"));
		c.add(new JButton("취소"));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx2();
	}

}
