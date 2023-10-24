public class Zoo {

    String name;
    String city;
    Aquatic [] aquaticAnimals;
    int nbrAnimauxAquatic;

    public Zoo()
    {

    }

    public Zoo(String name,String city)
    {
        this.name=name;
        this.city=city;
        aquaticAnimals=new Aquatic[10];
        this.nbrAnimauxAquatic=0;
    }
    public void addAquaticAnimal(Aquatic aquatic)
    {
        if(this.nbrAnimauxAquatic<10)
        {
            aquaticAnimals[nbrAnimauxAquatic]=aquatic;
            nbrAnimauxAquatic++;
        }
        else
        {
            System.out.println("Vous ne pouvez pas ajouter un animal");
        }
    }
    public void afficherAquatic()
    {
        int i;
        for(i=0;i<this.nbrAnimauxAquatic;i++)
        {
            System.out.println(aquaticAnimals[i].toString());
        }
    }
    public void afficherswim()
    {
        int i;
        for(i=0;i<this.nbrAnimauxAquatic;i++)
        {
            aquaticAnimals[i].swim();
        }
    }
    public void maxPenguinSwimmingDepth()
    {
        int i;
        float max;
        for (i=0;i<nbrAnimauxAquatic;i++)
        {

                Penguin p =(Penguin) aquaticAnimals[i];






        }


    }








}
