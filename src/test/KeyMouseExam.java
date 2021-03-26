package test;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

//MouseListener : 마우스 이벤트 처리를 위한 인터페이스
//MouseMotionListener : 마우스의 이동 이벤트 처리를 위한 인터페이스
//KeyListener : 키보드이벤트 처리를 위한 인터페이스

public class KeyMouseExam extends JApplet 
implements MouseListener,MouseMotionListener,KeyListener {
	private int x,y;//이미지를 출력할 x,y좌표값
	private int width, height;//가로,세로 사이즈
	private Image img;//이미지 car.gif 사용할 변수
	private boolean flag=false;//이미지가 처음 실행할땐 안보이게 불린값으로 false 씀
	
	//애플릿을 초기화하는 코드
	@Override
	public void init() {
		setSize(300,300);//화면 사이즈 설정
		//이미지를 불러오는 코드
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//현재클래스에 마우스 이벤트 기능을 추가(중요코드)
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		setFocusable(true);//키입력을 받을 수 있도록 설정
		requestFocus();//현재 화면에 키 입력을 요청
	}
	
	//화면 출력 method
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로,세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+","+height);//콘솔상에서 값확인
		
		//drawImage(이미지,x,y,이미지관찰자)
		if(flag) {//마우스 클릭시 true가 되어서 아래 이미지처리
			g.drawImage(img, x, y, this );
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//키가 눌려져있을 때에 호출
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//문자
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP://위쪽 키를 눌렀을 때
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN://아래쪽 키를 눌렀을 때
			y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT://왼쪽 키를 눌렀을 때
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT://오른쪽 키를 눌렀을 때
			x=Math.min(300-width, x+5); break;
		}
		repaint();//그래픽 갱신 요청
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag:x:"+x+",y"+y);
		
	}

	//마우스 커서가 컴퍼넌트 상에 이동했지만 버튼이 작동않은 경우에 호출
	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move:x:"+x+",y"+y);
		repaint();
	}

	//컴퍼넌트상에서 마우스 버튼을 클릭(눌렀다 놓아)했을 때 호출...
	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;//클릭을 할때 그림을 보여지게 처리
		x = e.getX();
		y = e.getY();
		//그래픽 갱신 요청 => paint()가 호출됨 
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
