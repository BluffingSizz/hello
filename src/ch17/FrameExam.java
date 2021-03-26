package ch17;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

//AWT : java+c개발
//SWING : AWT를 향상시킨 버전, java로만 개발
public class FrameExam {
	public static void main(String[] args) {
		//Frame 생성
//		Frame f=new Frame("프레임 테스트");//제목처리
		JFrame f = new JFrame("프레임 테스트");//Swing GUI
		f.setSize(200, 300);//프레임 사이즈 설정
		//프레임을 화면에 표시
		f.setVisible(true);//false하면 숨김상태가 된다.
		
//		 f.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//프로그램을 종료시킴
//				//정상종료 : 0, 비정상종료 : -1
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//			}
//		});
		
		//위보다 Adapter를 사용하면 코드가 간략해진다.
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//end main()

}
