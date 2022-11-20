
public class propProff extends Propriete {
	int nbEmployes;
	boolean estEtatique;
	

	
	public propProff(int id, Personne responsable, String adresse, double surface, int nbEmployes,
			boolean estEtatique) {
		super(id, responsable, adresse, surface);
		this.nbEmployes = nbEmployes;
		this.estEtatique = estEtatique;
	}
	public int getNbEmployes() {
		return nbEmployes;
	}
	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
	}
	public boolean isEstEtatique() {
		return estEtatique;
	}
	public void setEstEtatique(boolean estEtatique) {
		this.estEtatique = estEtatique;
	}


	@Override
	public String toString() {
		super.toString();
		return "propProff [nbEmployes=" + nbEmployes + ", estEtatique=" + estEtatique + "]";
	}
	
	
	double calculImpo() {
		if(estEtatique=false) {
		double propprof=(100*surface/100)+30*nbEmployes;
		return (propprof);			
		}
		else {
			return 0;
		}
	}
	
	
	
}
