package sec01.exam01;

public class Cellphone {
	// �ʵ�
	String model;
	String color;
	
	// ������
	
	// �޼ҵ�
	void powerOn() { System.out.println("������ �մϴ�.");}
	void powerOff() { System.out.println("������ ���ϴ�.");}
	void bell() { System.err.println("���� �︳�ϴ�.");}
	void sendVoice(String message) { System.out.println("�ڱ�: " + message);}
	void receiveVoice(String message) { System.out.println("����: " + message);}
	void hangUp() { System.out.println("��ȭ�� �����ϴ�.");}
}
