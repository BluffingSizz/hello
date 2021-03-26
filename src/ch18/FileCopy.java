package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		String str="";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		String file1 = "c:\\test\\aa.txt";//원본
		String file2 = "c:\\test\\b.txt";//복사본
		try {
			reader=new BufferedReader(new FileReader(new File(file1)));
			writer=new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				str = reader.readLine();//한 라인을 읽음
				if(str==null) break;//내용이 없으면 종료
				// \r carriage return(캐리지 리턴)
				// \n : new line(줄바꿈)
				writer.write(str+"\r\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(reader != null) reader.close();//리소스를 개별적으로 닫는다.
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(writer != null) writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			
		}
	}

}
}
