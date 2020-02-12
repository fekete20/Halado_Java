package hu.me.krz.haladojava;

import java.util.List;
import java.util.Random;
import hu.me.krz.haladojava.*;

public class Astronomer  {
	private List<Planet> DiscoveredPlanets;
	private String name;


	public Astronomer(List<Planet> planets, String name) {
	//	super();
		this.DiscoveredPlanets = planets;
		this.name = name;
	}



	public String getName() {
		return name;
	}


	public List<Planet> getDiscoveredPlanets() {
		return DiscoveredPlanets;
	}
	
	Random r = new Random();
	
	public void observeTheSky() {
		List<Planet> lista;
		Planet p;
		Point inc;
		Point pont;
		
		//	double[] radius = new double[10];
		for(int i = 0; i < 10; i++) {
			inc.x += r.nextInt()%20
			inc = Translate()
			p = new Planet();
			
		}
	}
	

	
}
