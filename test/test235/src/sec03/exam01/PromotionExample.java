package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		//�ڵ� Ÿ�� ��ȯ
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println("intvalue:" + intvalue);
		
		char charvalue = '��';
		intvalue = charvalue;
		System.out.println("���� �����ڵ�:" + intvalue);
		
		intvalue = 50;
		long longvalue = intvalue;
		System.out.println("longvalue: " + longvalue);
		
		longvalue = 100;
		float floatvalue = longvalue;
		System.out.println("floatvalue:" + floatvalue);
		
		floatvalue = 100.5F;
		double doublevalue = floatvalue;
		System.out.println("doublevalue: " + doublevalue);

	}

}
