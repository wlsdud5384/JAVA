package sec01.exam01;

public class DmbCellphoneExmple {

	public static void main(String[] args) {
		// DmbCellphone ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("�ڹ���", "����", 10);
		
		//Chllphone���κ��� ��� ���� �ʵ�
		System.out.println("��: " + dmbCellphone.model);
		System.out.println("����� " + dmbCellphone.color);
		
		//DmbCellphone�� �ʵ�
		System.out.println("ä��: " + dmbCellphone.channel);
		
		//Cellphone���κ��� ��� ���� �޼ҵ� ȣ��
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellphone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellphone.hangUp();
		
		//DmbCellphone�� �޼ҵ� ȣ��
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
		

	}

}
