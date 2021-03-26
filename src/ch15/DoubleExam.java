package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
	public static void main(String[] args) {
		int num = 50;
		Scanner scan = null;
		try {
			System.out.println("숫자를 입력하세요 : ");
			scan = new Scanner(System.in);
			int value = scan.nextInt();
			System.out.println(num/value);
		}catch (NullPointerException e) {
			System.out.println("널포인터 예외");
		} catch ( ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch ( InputMismatchException e) {
			System.out.println("숫자만 입력할 수 있습니다.");
		} catch (Exception e) {//catch (Exception e)가 마지막 부분에 오는게 좋다
			//위로가면 다른 Exception들을 쓰는 의미가 없다.
			System.out.println("기타 예외");
		} finally {
			//if문으로 걸러줘야지 아니면 scan이 없는데 닫으라고 하면 finally절에서
			//또 예외가 발생할 수 있다.
			if(scan != null)
				scan.close();
		}
	}

}
