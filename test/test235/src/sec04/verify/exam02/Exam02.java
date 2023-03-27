package sec04.verify.exam02;

import java.util.Scanner; // 이거 왜 쓰는거지?

public class Exam02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //이거 왜 쓰는거지?
		System.out.println("첫번째 수:");
		String strNum1 = scanner.nextLine(); //이건 뭐지?
		System.out.println("두번째 수:");
		String strNum2 = scanner.nextLine(); // 이것도 왜 쓰는지 잘
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);

	}

}
