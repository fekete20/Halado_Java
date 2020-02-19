package hu.me.krz.haladojava;

public class Tanulo {

	private final String name;
	private int money;
	private int tanulok = 0;

	public int osszestanulo() {
		return tanulok;
	}

	public int penz() {
		return money;
	}

	public Tanulo(String name, int money) {
		// super();
		this.name = name;
		this.money = money;
		tanulok++;
	}

	public Tanulo(String name) {
		this(name, 10000);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		tanulok--;
	}

	@Override
	public String toString() {
		return "Tanuló: " + name + ", " + money;
	}

	public boolean fogyasztas(int dec) {
		this.money -= dec;

		if (money <= 0) {
			return true;
		} else
			return false;
	}

}
