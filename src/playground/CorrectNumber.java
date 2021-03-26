package playground;

import java.util.Scanner;

public class CorrectNumber {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	int answer = 30;
	int user = 0;
	int tried = 0;
	
	do {
		System.out.print("정답: ");
		user = sc.nextInt();
		tried++;
		
		if(answer > user) {
			System.out.println("그것보다는 높습니다.");
		} else if (answer < user) {
			System.out.println("그것보다는 낮습니다.");
		}
		
	} while (answer !=user);
	System.out.println("정답입니다."+tried+"번만에 맞히셨습니다.");

sc.close();    }
}
