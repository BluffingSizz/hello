package ch18;


//스트림(Stream) : 데이터의 논리적인 통로
// 1byte 단위로 처리됨
// InputStream(입력스트림)
// OutputStream(츨력스트림)
public class InputStreamExam {
	
	public static void main(String[] args) {
		int var = 0;
		try {
			System.out.println("내용을 입력하세요 : ");
			var = System.in.read();//키보드로부터 1byte를 읽음. 한글(2byte)처리는 안됨.
			while(var != 13) {//13은 키보드의 엔터키값
				System.out.println(var+"==>"+(char)var);
				//모든문자에는 고유한 숫자코드가 있다. int형 var를 문자형(char)로
				//형변환해서 출력
				var = System.in.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
