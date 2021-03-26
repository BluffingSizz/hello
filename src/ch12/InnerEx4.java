package ch12;

class Outer{
	class InstanceInner{//inner class
		int iv=100;
	}//end inner class
	
	static class StaticInner {
		int iv =200;//non-static
		static int cv=300;//static member
	}//end inner class
	
	void myMethod() {
		class LocalInner{
			int iv =400;
		}//end inner class
		LocalInner li = new LocalInner();
		System.out.println("li.iv : "+li.iv);
	}//end MyMethod
}//end outer class

public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner li =oc.new InstanceInner();
		
		System.out.println("li.iv : "+li.iv);
		System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : "+ si.iv);
		
		oc.myMethod();
	}

}
