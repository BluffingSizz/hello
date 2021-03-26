package test;

public class SInfo implements Student{
	
	String name;
	String address;
	String email;
	
	int kor,eng,mat,tot;
    int avg;
    
    public SInfo(String name,String address,String email) {
    	this.name = name;
    	this.address = address;
    	this.email = email;
    }
    
    public SInfo(String name,int kor,int eng, int mat) {
    	this.name = name;
    	this.kor = kor;
    	this.eng = eng;
    	this.mat = mat;
    	tot = kor + eng + mat;
    	avg = tot/3;
    }

	@Override
	public void address() {
		System.out.println("=============================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name+"\t"+address+"\t"+email);
		
	}

	@Override
	public void point() {
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		
		
	}

}
