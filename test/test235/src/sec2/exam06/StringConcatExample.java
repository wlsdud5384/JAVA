package sec2.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" +3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);   // 왜지? 33.0 ????
		System.out.println(str4);   // 이건 알겠고

	}

}
