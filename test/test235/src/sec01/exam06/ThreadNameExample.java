package sec01.exam06;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); 	//<---- �� �ڵ带 �����ϴ� ������ ��ü ���
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();	//<----threadA ����
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();		//<---threadA ����
		
		ThreadB threadB = new ThreadB();		//<-- threadB ����
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();		// threadB ����

	}

}
