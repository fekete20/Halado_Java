package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import hu.me.krz.haladojava.*;

public class Vasarlas {
	public static void main(String[] args) {

		List<Tanulo> tanulok = new ArrayList<>(Arrays.asList(new Tanulo("Sándor"), new Tanulo("Zsuzsanna"),
				new Tanulo("Zsolt"), new Tanulo("Gréta"), new Tanulo("Lilla")));

		Random r = new Random();
		for (int i = 0; i <= 5 && tanulok.size() != 0; i++) {

			System.out.println((i + 1) + ". vásárlási kör:");

			for (int j = 0; j < tanulok.size(); j++) {

				if (tanulok.get(j).fogyasztas(r.nextInt((3000 - 1500) + 1) + 1500)) {
					System.out.println(tanulok.get(j).getName() + " kiesett.");
					tanulok.remove(j);
				}

			}

			System.out.println("Átlag pénz értéke: " + averageOfMoney(tanulok));

			System.out.println("Maradt tanulók száma: " + tanulok.size());

			for (Tanulo t : tanulok) {
				System.out.println(t);
			}
		}

	}

	public static double averageOfMoney(List<Tanulo> lista) {
		int sum = 0;
		int i;
		for (i = 0; i < lista.size(); i++) {
			sum += lista.get(i).penz();
		}

		return sum / i;
	}

}
