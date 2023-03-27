package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 10000000000000; //컴파일 에러 난다 int 형 에서 담을수있는 리터럴 크기가
		// 너무커서 그렇다 여튼 값이 너무 커서 안됨
		// 값 뒤에 L 을 써줘야함
		long var4 = 10000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
