package sec04.exam04;

public class QStropExample {

	public static void main(String[] args) throws Exception {
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode:" + KeyCode);
			if(KeyCode == 113) {
				break;		//KeyCode �� 113 �� ������ ��� ����
			}
		}
			System.out.println("����");
	}

}
