package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;
import sec06.exam02.kumho.*;
import sec06.exam02.hyndai.Engine;

public class Car {
	// �ʵ�
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();	// �̷��Ե� �� �� ������ �����ʴ°� ���� ��������
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire(); 		// �̷��Ե� �� �� ������ �����ʴ°� ���� ��������
}