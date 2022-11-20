
public class lotissement {
   protected Propriete[] tabProp;
   protected int nombre;
   
public lotissement(Propriete[] tabProp, int nombre) {
	super();
	this.tabProp = tabProp;
	this.nombre = nombre;
}
  
 void afficherPropriétés() {
	for (Propriete p:tabProp) {
		if (p!=null) {
			System.out.println(p);
		}
	}	
  }
 
 Propriete Propriete(int i) {
	 if (i<=nombre) {

	  return(this.tabProp[i]);
	 } 
	 else {

		 return null;
	 }
 }
 
  boolean ajouter(Propriete p) {
		  if(nombre<tabProp.length) {
		    tabProp[nombre]=p;
		    return true;
		  }    
	  
		  else {
			  return false;
		  }
   }
  
 
  boolean supprimer(Propriete p) {
	  //recherche
	  int i=0;
	  while((i<nombre)&&(tabProp[i].equals(p)==false)) {
		  i++;
	  }
	  if(i==nombre) {
		  return false;
	  }
		  
	  else {
		  for(int j=i;j<nombre-1;j++) {
			  tabProp[j]=tabProp[j+1];
			  nombre--;
		  }
		  return true;
	  }
	  
  }
 
  int getnbPièces() {
	  int s=0;
	  for (int i=0;i<nombre ;i++) {
		  if(tabProp[i] instanceof PropPriv) {
			  s+=((PropPriv)tabProp[i]).getNbPièces();
		  }
		  
	  }
	  return s;
   }
 }
