package ch18;

import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		StringBuilder output = new StringBuilder();
		String str = null;
		
		try {
			RandomAccessFile file = new RandomAccessFile("c:\\test\\test2.txt", "rw");
			file.seek(8);
			file.write("HTML".getBytes());
			
			while(file.getFilePointer() < file.length()) {
				str=file.readLine();
				str= new String(str.getBytes("8859_1"),"utf-8");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
