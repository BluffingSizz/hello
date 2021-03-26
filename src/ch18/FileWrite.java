package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		//프로그램 ==> 파일 (출력스트림이 필요함)
		//OutputStream : 1byte 출력
		//OutputStreamWriter : 1char 출력
		OutputStream os = null;
		try {
			
			//유닉스,리눅스 => 디렉토리이름/파일이름,
			//윈도우즈 => 디렉토리이름\\파일이름
			os = new FileOutputStream("c:\\test\\aa.txt");
			System.out.println("입력하세요 : ");
			while(true) {
				int ch = System.in.read();//1byte 읽음
				if(ch==13) break;
				os.write(ch);
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
