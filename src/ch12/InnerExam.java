package ch12;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam extends Frame{
	public InnerExam() {//기본생성자
		super("내부 클래스 테스트");//부모클래스의 생성자 호출, 제목용도
		setSize(300,400);//가로,세로 초기사이즈 설정
		setVisible(true);//프레임을 화면에 표시
	}
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		e.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			    
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}
			
			//윈도우창(프레임)이 닫힐 때 호출
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//프로그램 강제 종료
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});//무명클래스
	}

}
