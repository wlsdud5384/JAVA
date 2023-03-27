package sec01.exam04;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		rc.setVolume(10);
		rc.turnOn();
		rc.turnOff();
		
		tv.search("ddddd");
		tv.turnOn();
		tv.turnOff();
		
	}

}
