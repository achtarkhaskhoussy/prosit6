public class Etudiant extends User{
    float note;
    int niveau;

    public Etudiant()
    {
        super(); //appel du contructeur par défaut du classe mere User
        System.out.println("je suis Etudiant");
    }
   /* public Etudiant(float note,int niveau)
    {
       this.note=note;
       this.niveau=niveau;
    }*/

    public Etudiant(int id,String nom,String prenom,float note,int niveau)
    {
        super(id,nom,prenom);
        this.note=note;
        this.niveau=niveau;

    }

    @Override
    public final void afficherUser()
    {
        super.afficherUser();
        System.out.println("Note:"+note);
    }
    @Override
    public String toString()
    {
       return super.toString()+"Note:"+"\n"+"Niveau"+"\n"+niveau;
    }



}
