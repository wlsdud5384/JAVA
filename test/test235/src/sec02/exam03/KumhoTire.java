package sec02.exam03;

public class KumhoTire extends Tire {
	// �ʵ�
	// ������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	// �޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire ��ũ ***");
			return false;
		}
	}
}
