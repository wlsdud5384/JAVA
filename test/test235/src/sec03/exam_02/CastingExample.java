package sec03.exam_02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032; //이건 뭐지 왜 가 가 나오지??
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500; // 이건 괜찮음
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14; // .14 가 값을 잃어버림
		intValue = (int) doubleValue;
		System.out.println(intValue);

	}

}
