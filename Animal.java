public  class Animal {
    //ki yabda fama méthode abstract lezem l classe nhotha abstract
    int age;
    String nom;
    float poids;


    public Animal()
    {

    }


    public Animal(int age,String nom,float poids)
    {
        this.age=age;
        this.nom=nom;
        this.poids=poids;
    }

    @Override
    public String toString()
    {
        return "Age:"+age+"Nom:"+nom+"Poids:"+poids+"\n";
    }



}
