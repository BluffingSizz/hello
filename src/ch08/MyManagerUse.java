package ch08;

public class MyManagerUse {
	public static void main(String[] args) {
		MyManager mgrobj=MyManager.getInstance();
		System.out.println("mgrobj.getScore():" +mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobh.getScore()" + mgrobj.getScore());
		
		MyManager newMgr=MyManager.getInstance();//두번째 싱글톤 호출이기 때문에
		//처음 mgr주소값만 받아서 리턴받아와서 newMgr에 대입
		System.out.println("newMgr.getScore():" + newMgr.getScore());
	}

}
