
public class Villa extends PropPriv {

   boolean avecpisc;


public Villa(int id, Personne responsable, String adresse, double surface, int nbPièces, boolean avecpisc) {
	super(id, responsable, adresse, surface, nbPièces);
	this.avecpisc = avecpisc;
}

public boolean isAvecpisc() {
	return avecpisc;
}

public void setAvecpisc(boolean avecpisc) {
	this.avecpisc = avecpisc;
}

@Override
public String toString() {
	super.toString();
	return "Villa [avecpisc=" + avecpisc + "]";
}
   double calculImpo() {
	   
	double calc2=(super.calculImpo()+200);
	return (calc2);
   }

}
