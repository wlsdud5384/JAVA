package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean K1 = new Korean("������", "011225-1234567");
		System.out.println("K1.name : " + K1.name);
		System.out.println("K1.ssn : " + K1.ssn);
		
		Korean K2 = new Korean("������", "960211-1440111");
		System.out.println("K2.name : " + K2.name);
		System.out.println("K2.ssn : " + K2.ssn);

	}

}
