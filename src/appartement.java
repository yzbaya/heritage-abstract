
public class appartement extends PropPriv  {
   int numEtage;



   public appartement(int id, Personne responsable, String adresse, double surface, int nbPièces, int numEtage) {
	super(id, responsable, adresse, surface, nbPièces);
	this.numEtage = numEtage;
}

public int getNumEtage() {
	return numEtage;
   }

  public void setNumEtage(int numEtage) {
	this.numEtage = numEtage;
  }
   
@Override
  public String toString() {
	super.toString();
	return "appartement [numEtage=" + numEtage + "]";
}

  
}
