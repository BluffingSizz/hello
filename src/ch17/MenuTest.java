package ch17;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {
	
	public static void main(String[] args) {
		Frame f = new Frame("Frame with menu");
		f.setSize(300, 200);
		
		MenuBar mb = new MenuBar();
		Menu mFile=new Menu("File");
		MenuItem miNew=new MenuItem("New");
		MenuItem miOpen=new MenuItem("Open");
		
		Menu mOthers = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");
		
		//Menu에 MenuItem들을 추가
		mFile.add(miNew);
		mFile.add(miOpen);
		
		//Menu에 Menu를 추가
		mFile.add(mOthers);
		
		//메뉴에 분리선을 추가
		mFile.addSeparator();
		
		mFile.add(miExit);
		
		MenuItem miPrint = new MenuItem("print ...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
		
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		
		mView.add(miStatusbar);
		
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		
		//mHelp를 HelpMenu로 지정
		mb.setHelpMenu(mHelp);
		
		//Frame에 MenuBar를 포함
		f.setMenuBar(mb);
		f.setVisible(true);
		
		//윈도우창 종료처리
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		

		});
		
	}

}
