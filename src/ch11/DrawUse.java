package ch11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("deprecation")
public class DrawUse extends Applet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Draw shape1;//Interface 타입
	Draw shape2;
	public DrawUse() {
		shape1 = new DrawCircle(30, 30, 60, 80);
		//다형성기법 좌변:부모(인터페이스), 우변:자식(DrawCircle)
		shape2 = new DrawLine(10, 20, 150, 100);
		setBackground(Color.yellow);//배경색상 설정
	}
	
	public void paint(Graphics g) {
		g.drawString("자바 그래픽", 100, 60);
		shape1.paint(g);//DrawCircle(30, 30, 60, 80)호출 실행
		shape2.paint(g);//Draw
	}

}
