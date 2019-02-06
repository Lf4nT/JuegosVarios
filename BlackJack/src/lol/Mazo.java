package lol;

import lel.Id;
import lel.Naipe;
import lel.Palo;

public class Mazo extends lel.Mazo {

	public Mazo() {
		for (int i = 0; i < 6; i++) {
			for (Palo palo : Palo.values()) {
				for (Id id : Id.values()) {
					int r;
					Naipe n;
					naipes.add(new Naipe(palo, id, 0));
				}
			}
		}
	}

}
