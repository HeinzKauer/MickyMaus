package ch.ks.enumExample;

public enum EnumExample3 {
	A(1, 2), B(3, 4), C(5, 6), D(7, 8);

	private final int value1;
	private final int value2;

	private EnumExample3(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public int getValue1() {
		return value1;
	}

	public int getValue2() {
		return value2;
	}
}
