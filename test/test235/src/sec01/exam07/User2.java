package sec01.exam07;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");	//<---- ������ �̸��� user2�� ����
		this.calculator = calculator;  //<----- ���� ��ü��calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calculator.setMemory(50);	//<---- ���� ��ü�� calculator�� �޸𸮿� 50����
	}
}
