package sec01.exam04;

import java.util.Date;	// 이거를 써줘야 시간이 나온다 
//안써주면 Date 에서 오류난다.
public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
