package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {
	public static void main(String[] args) {
		try {
			DataOutputStream dataout = new DataOutputStream(new FileOutputStream("c:\\test\\abc.dat"));
			dataout.writeInt(123);//숫자 형식의 자료를 파일에 저장
			dataout.writeChar('A');//문자 형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);//실수 형식의 자료를 파일에 저장
			dataout.close();//스트림 닫기(파일이 완성됨)
			System.out.println("저장되었습니다.");
			
			DataInputStream datain = new DataInputStream(new FileInputStream("c:\\test\\abc.dat"));
			//이전파일로 저장된 내용을 콘솔화면에 정상적으로 출력
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
