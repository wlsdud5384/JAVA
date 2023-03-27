package sec2.exam03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);    // true ³ª¿È
		
		play = !play;
		System.out.println(play);	// false ³ª¿È
		
		play = !play;
		System.out.println(play);	// true ³ª¿È

	}

}
