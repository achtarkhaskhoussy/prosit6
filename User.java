public class User {
    int id;
    String nom,prenom;

    public User(String nom,String prenom)
    {
        this.nom=nom;
        this.prenom=prenom;
    }

    public User(int id,String nom,String prenom)
    {
        this(nom,prenom);
        this.id=id;
    }
    public User()
    {
        System.out.println("je suis User");
    }

    public  void afficherUser()
    {
        System.out.println("Id:"+id);
        System.out.println("Nom:"+nom);
        System.out.println("Prenom:"+prenom);
    }

    @Override
    public String toString()
    {
        return "nom"+nom+"\n"+"Prenom"+"\n"+prenom;
    }




}
