package sec04.exam04;

public class QStropExample {

	public static void main(String[] args) throws Exception {
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode:" + KeyCode);
			if(KeyCode == 113) {
				break;		//KeyCode 가 113 과 동일할 경우 실행
			}
		}
			System.out.println("종료");
	}

}
