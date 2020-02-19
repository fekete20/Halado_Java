package hu.me.krz.haladojava;

public class Tanulo {

	/*
	 * 1. Definiáljon egy **Tanulo** osztályt, amely tárolja a **nev** (szöveg) és a **penz** (egész) adatokat. A
	 *  név adatot csak egyszer szeretnénk beállítani a konstruktorban! 
Az adatokat a leszármazott osztályból és az adott osztályból szeretnénk csak kiolvasni!
    * Definiáljon egy megfelelő adattagot (tanulok), amely az összes Tanulo objektum darabszámát képes tárolni.
    * Készítsen megfelelő gettert osszestanulo néven, amely a tanulok darabszámát adja vissza!
    * Készítsen csak gettert penz néven, amely a penz értékét adja vissza!
    * Definiáljon konstruktort, amellyel egy példány létrehozható! 
    Gondoskodjon a tanulok adattag frissítéséről!
    * Definiáljon egy egy paraméteres konstruktort, amely meghívja az előző konstruktort, a nevet a 
    * paraméterrel, 
    a pénzt pedig 10000-re állítja be.
    * Definiáljon egy megfelelő metódust arra az esetre, ha az objektum megszűnne, frissítse a tanulok 
    * adattagot.
    * Definiálja a toString metódust úgy, hogy a következő formában adja vissza az objektum állapotát:
    *  Tanuló: [név] 1301 Ft;
    * Definiáljon egy fogyasztás metódust, amely a paraméterben kapott értékkel csökkenti a pénz adattagot! 
    * Térjen vissza igaz értékkel, ha a pénz elfogyott, hamissal egyébként!
	 */
	
	private final String name;
	private int money;
	private int tanulok;
	
	public int osszestanulo() {
		return tanulok;
	}
	
	public int penz() {
		return money;
	}

	public Tanulo(String name, int money, int tanulok) {
		//super();
		this.name = name;
		this.money = money;
		this.tanulok = tanulok;
	}
	
	public Tanulo(String name) {
		this(name);
		money = 
	}
	
	
	
	
	
}
