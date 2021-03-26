package ch18;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	private String name;
	private int age;
	private MemberInfoDTO memberInfo;
	
	public MemberDTO() {
		
	}

	public MemberDTO(String name, int age, String jumin, String pwd) {
		super();
		this.name=name;
		this.age=age;
		this.memberInfo= new MemberInfoDTO(jumin, pwd);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public MemberInfoDTO getMemberInfo() {
		return memberInfo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMemberInfo(MemberInfoDTO memberInfo) {
		this.memberInfo = memberInfo;
	}

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + ", memberInfo=" + memberInfo + "]";
	}
	
	

}
