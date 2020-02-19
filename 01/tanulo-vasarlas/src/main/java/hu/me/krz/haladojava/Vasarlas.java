package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import hu.me.krz.haladojava.*;

public class Vasarlas {
	public static void main(String[] args) {
		
		
		List<Tanulo> tanulok = new ArrayList<>(Arrays.asList(new Tanulo("Katalin"), new Tanulo("István"),
				new Tanulo("Péter"), new Tanulo("Gréta"), new Tanulo("Lilla")));

		Random r = new Random();
		for (int i = 0; i <= tanulok.size(); i++) {
			
			tanulok.get(i).fogyasztas(r.nextInt((3000 - 1500) + 1) + 1500);

			System.out.println("Maradt tanulók száma: " + tanulok.size()) ;
			
			for(Tanulo t : tanulok) {
				System.out.println(t);
			}
		}

	}

}

/*
 * Hozzon létre egy dinamikus tömböt, melyben Tanulo példányok tárolhatók!
 * Példányosítson 5 db objektumot, tetszőleges adattokkal, használja az egy
 * paraméteres konstruktort, majd illessze be a tömbbe! Hadd szaladjon a
 * vásárlás! 6 körös vásárlást szimulálunk. Ciklusban (6 iteráció) hívja meg a
 * fogyasztás metódust minden Tanulo objektumra, véletlen értékekkel (a
 * 1500-3000 intervallumból). A visszatérési értéket vizsgálva nullázza ki
 * azokat a Tanulo –kat amelyeknek elfogyott a pénzük! Minden körben írja ki az
 * átlag pénz értékét (összes pénz / tanulok száma)! Írassa ki hány Tanulo
 * maradt a vásárlás végén, majd írassa ki a tanulókat (toString)!
 */