package ch14;

public class Member {
	private String userid;
	private String passwd;
	private String name;
	private String tel;
	private String email;
	
	public Member() {
		
	}
	
	
	
	
	public Member(String userid, String passwd, String name, String tel, String email) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}




	public String getUserid() {
		return userid;
	}




	public String getPasswd() {
		return passwd;
	}




	public String getName() {
		return name;
	}




	public String getTel() {
		return tel;
	}




	public String getEmail() {
		return email;
	}




	public void setUserid(String userid) {
		this.userid = userid;
	}




	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setTel(String tel) {
		this.tel = tel;
	}




	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
