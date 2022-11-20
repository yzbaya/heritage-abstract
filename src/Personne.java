
public class Personne {
   int cin;
   String nom;
   String prenom;
  
  Personne (int cin, String nom,String prenom){
	  this.cin=cin;
	  this.setNom(nom);
	  this.setPrenom(prenom);
  }
  
  public int getcin() {
	return cin;
  }
  
  public void setcin(int cin) {
	  this.cin=cin;
  }

  public String getNom() {
	return nom;
  }

  public void setNom(String nom) {
	this.nom = nom;
  }

   public String getPrenom() {
	 return prenom;
  }

    public void setPrenom(String prenom) {
	  this.prenom = prenom;
  }
    @Override
    public String toString() {
		return ("le cin est:"+this.cin+""+this.prenom+""+this.nom);
    	
    }
}
