package sec01.exam06;

public class Car {
	// �ʵ�
	public int speed;
	
	// �޼ҵ�
	public void speedUP() {
		speed += 1;
		
	}
	
	//final �޼ҵ�
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;

	}
	
}
