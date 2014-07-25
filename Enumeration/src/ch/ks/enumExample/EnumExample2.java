package ch.ks.enumExample;

public class EnumExample2 {

	public enum Character {
		A, B, C, D
	}

	public static String word(Character c) {
		String str = "";
		switch (c) {
		case A:
			str = "Alida";
			break;
		case B:
			str = "Ben";
			break;
		case C:
			str = "Clara";
			break;
		case D:
			str = "Dennis";
			break;
		}
		return str;
	}

	public static void main(String[] args) {
		Character c1 = Character.A;
		System.out.println(word(c1));
		System.out.println(Character.D + ": " + word(Character.D));
		System.out.println(Character.D.name());
	}
}