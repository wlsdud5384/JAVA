package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.KeyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ�: " + speed + "km/h");

	}

}
