
public class PropPriv extends Propriete{
	int nbPièces;



	public PropPriv(int id, Personne responsable, String adresse, double surface, int nbPièces) {
		super(id, responsable, adresse, surface);
		this.nbPièces = nbPièces;
	}

	@Override
	public String toString() {
		return "PropPriv [nbPièces=" + nbPièces + "]";
	}
	
	  double calculImpo() {
		double calc=((50*surface)/100)+(10*nbPièces);
		return(calc);
	}

	public int getNbPièces() {
		return nbPièces;
	}

	public void setNbPièces(int nbPièces) {
		this.nbPièces = nbPièces;
	}
	  
}
