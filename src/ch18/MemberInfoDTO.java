package ch18;

import java.io.Serializable;

//객체 직렬화 : Serialization
//메모리에 저장된 객체를 파일로 저장하거나 네트워크로 전송할 때 사용
//객체 직렬화를 하려면 반드시 Serializable 인터페이스를 상속받아야함.
public class MemberInfoDTO implements Serializable{
	private String juniNo;
	private String passwd;
	//생성자,getter,setter
	public MemberInfoDTO() {
		
	}
	public MemberInfoDTO(String juniNo, String passwd) {
		this.juniNo = juniNo;
		this.passwd = passwd;
	}
	public String getJuniNo() {
		return juniNo;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setJuniNo(String juniNo) {
		this.juniNo = juniNo;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	

}
