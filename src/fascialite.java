

public class fascialite {

	public static void main(String[] args) {

     Personne p1=new Personne(1, "aaa", "bbb");
     Personne p2=new Personne(2, "ccc", "ddd");
     Personne p3=new Personne(3, "xxx", "yyy");
     
    
     
     lotissement a[]=new lotissement [10] ;
     
     PropPriv b=new PropPriv (1,p1,"Corniche",350,4);
     Villa v=new Villa (2,p2,"Dar Chaabane", 400,6,true);
     appartement app=new appartement(3,p2,"Hammamet",1200,8, 3);
     propProff pr1=new propProff(4,p3,"Korba", 1000, 50,true);
     propProff pr2=new propProff (5,p1,"Bir Bouragba",2500, 400, false);
     a[0]=b;
     a[1]=v;
     a[2]=app;
     a[3]=pr1;
     a[4]=pr2;
     
	}

}
