package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		//String : 불변성, 값이 변할일이 없을 때 사용
		//StringBulider : 가변성,값이 변할일들이 많을 때 사용
		
		StringBuilder output = new StringBuilder();
		String str = null;
		try {
			RandomAccessFile file =
					new RandomAccessFile("c:\\test\\test.txt","rw");
			//rw : 읽기쓰기모드
			file.seek(8);//89번째 인덱스 부터
			file.write("HTML".getBytes());//기존내용을 덮어쓰게 된다.
			//file.seek(0);
			//파일포인터(파일을 어디까지 읽었는지 가리킴)
			while(file.getFilePointer() < file.length()) {
				//output.append(file.getFilePointer()+":");
				str=file.readLine();
				//한글처리
				//스트링.getBytes()스트링을 바이트배열로 변환
				//new String(문자열,캐릭터셋)인코딩 방식 변환
				//8859_1, iso-8859-1 서유럽언어 인코딩방식
				//ms949,euc-kr : 2바이트
				//utf-8 3바이트 : ex)학생 - 초성:1byte, 중성:1byte, 종성:1byte
				str = new String(str.getBytes("8859_1"),"utf-8");
				//output.append(str+"\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
