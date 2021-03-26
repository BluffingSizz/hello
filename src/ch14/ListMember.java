package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//ArrayList<클래스객체>   <Object>대신 만들어 놓은 Member객체를
		//제너릭하면 Member에서 쓰이는 모든 자료형을 처리할 준비가 가능해짐
		List<Member> list = new ArrayList<>();
		
		Member m1 = new Member();
		m1.setName("김길동");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-123-5678");
		m1.setEmail("kim@naver.com");
		
		list.add(m1);//ArrayList에 Member객체를 1개 추가
		System.out.println(list.size());
		Member m2 = new Member("hong","1234","홍길동","010-123-4567","hong@gmail.com");
		list.add(m2);
		
		list.add(new Member("choi", "1234", "최길동", "031-123-4568", "choi@nate.com"));
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i =0; i<list.size();i++) {
			Member m = list.get(i);
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}

}
