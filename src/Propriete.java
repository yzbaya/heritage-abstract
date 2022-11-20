
public abstract class Propriete {
  int id;
  Personne responsable;
   String adresse;
 double surface;
   public Propriete(int id, Personne responsable, String adresse, double surface) {
	super();
	this.id = id;
	this.responsable = responsable;
	this.adresse = adresse;
	this.surface = surface;
 }
 @Override
   public String toString() {
	return "Propriete [id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", surface=" + surface
			+ "]";
 }
  abstract double calculImpo();
  
  
  private Object getId() {
		return id;
	}
  @Override
 public boolean equals(Object o){
	  Propriete o1=(Propriete) o;
	  return(this.getId()==o1.getId());
  }

 }
