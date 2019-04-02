package main;

import java.util.ArrayList;
import java.util.List;

public class KledingKast {
	private String naam;
	private List<KledingLade> ladeLijst;
	
	public KledingKast(String naam) {
		super();
		this.naam = naam;
		this.ladeLijst = new ArrayList<>();
	}

	public void voegLadeToe(KledingLade lade) {
		this.ladeLijst.add(lade);
	}
	
	public List<KledingLade> getLadeLijst(){
		return ladeLijst;
	}

	@Override
	public String toString() {
		return "KledingKast [naam=" + naam + "]";
	}
	
}
