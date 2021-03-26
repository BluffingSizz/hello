package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExam {
	//stream : 데이터의 논리적인 통로, 바이트 단위
	//프로그램 ====> 외부자원 : 출력 스트림
	//프로그램 <==== 외부자원 : 입력 스트림
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		MemberDTO m1 = new MemberDTO("kim", 30, "871231-111111", "1234");
		MemberDTO m2 = new MemberDTO("park", 28, "891231-111111", "2222");
		MemberDTO m3 = new MemberDTO("hong", 25, "911231-111111", "3333");
		//객체 직렬화 : serialization
		try {
			//파일저장을 위한 출력 스트림
			fos = new FileOutputStream("c:\\test\\object.dat");
			//메모리에 있는 객체를 파일로 저장하기 위한 스트림
			oos = new ObjectOutputStream(fos);
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(m3);
			System.out.println("객체를 파일로 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//역직렬화 : deserialization 파일 ==>프로그램==>메모리
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis=new FileInputStream("c\\test\\object.dat");
			ois=new ObjectInputStream(fis);
			MemberDTO dto1 = (MemberDTO)ois.readObject();
			MemberDTO dto2 = (MemberDTO)ois.readObject();
			MemberDTO dto3 = (MemberDTO)ois.readObject();
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto3);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
