package hu.me.krz.haladojava;

import java.util.Random;
import java.util.Scanner;

public class Proba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg, hogy hány példányt kell létrehozni!");
		int db = 0;

		try {
			db = sc.nextInt();

		} catch (Exception ex) {
			System.err.println("Hiba: " + ex.getMessage());
			System.exit(-20);
		}
		
		sc.close();
		
		Valogato[] szemelyek = new Valogato[db];

		for (int i = 0; i < szemelyek.length; i++) {
			String name = "diák" + (i + 1);
			Random r = new Random();
			int age = r.nextInt(80 - 16 + 1) + 16;
			
			if(age %2 == 0) {
				int puska = r.nextInt(6 - 0) % 6;
				szemelyek[i] = new Diak(name, age, puska);
			} else {
				double vizsgajegyavg = r.nextDouble()*5;
				szemelyek[i] = new Tanar(name, age, vizsgajegyavg);
			}
			
		}

	

		for (Valogato d : szemelyek) {
			if (d.joAlanyE()) {
				System.out.print("jó alany: ");
			} else {
			System.out.print("nem jó alany: ");
			}
			System.out.println(d);
		}

	
		}
	}

