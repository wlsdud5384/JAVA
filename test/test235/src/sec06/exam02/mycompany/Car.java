package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;
import sec06.exam02.kumho.*;
import sec06.exam02.hyndai.Engine;

public class Car {
	// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();	// 이렇게도 할 수 있지만 하지않는게 좋다 쓰지마라
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire(); 		// 이렇게도 할 수 있지만 하지않는게 좋다 쓰지마라
}
