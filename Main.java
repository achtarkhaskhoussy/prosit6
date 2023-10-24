public class Main {
    public static void main (String [] args)
    {
      //  User u=new User();
       /* Etudiant e=new Etudiant(3,"jawher","talbi",16,2);
        Animal A=new Animal(12,"lion",100.5);

        e.afficherUser();
        System.out.println(e.toString());*/

        Zoo Z=new Zoo("myZoo","ariana");



        Animal A=new Animal();
       // Aquatic Aq=new Aquatic(12,"jawher",50,"ghazella");
       // Z.addAquaticAnimal(Aq);


        Terestre T=new Terestre();
        Dauphin D=new Dauphin();
        Penguin P=new Penguin();

        P.swim();
       // Aq.swim();
        D.swim();

Z.maxPenguinSwimmingDepth();




    }
}
