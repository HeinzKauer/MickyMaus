package ch.ks;

import ch.ks.enumExample.EnumExample;
import ch.ks.enumExample.EnumExample2;
import ch.ks.enumExample.EnumExample3;
import ch.ks.enumExample.EnumExample4;

public class EnumTypes {

	public static void main(String[] args) {
		new EnumTypes().run();
	}

	/**
	 * http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
	 * http://www.javaseiten.de/ch01s11.html
	 * 
	 */
	private void run() {
		System.out
				.println("------------------------  start --------------------------");

		System.out.println(EnumExample.A.name());
		System.out.println(EnumExample.A.ordinal());
		System.out.println(EnumExample.B.ordinal());
		System.out.println(EnumExample.C.getClass());

		EnumExample2.main(null);

		
		System.out.println(EnumExample3.A.getValue1() + " : "
				+ EnumExample3.A.getValue2());

		EnumExample4.main(null);

	}

}
