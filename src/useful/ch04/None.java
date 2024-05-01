package useful.ch04;

public class None {

	private static None none;

	private None() {

	}

	private static None getInstance() {

		if (none == null) {
			none = new None();
		}

		return none;
	}
}
