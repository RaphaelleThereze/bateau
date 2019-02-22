package data;


public class Bateau {
	private String nom;
	
	public Bateau() {
		super();
	}
	

	public Bateau(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "\\_*_" + nom + "_*_//";
	}
	
	

}
