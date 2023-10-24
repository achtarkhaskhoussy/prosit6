public class Terestre extends Animal{
    int nbrLegs;

    public Terestre()
    {

    }

    public Terestre(int ag,String n,float p,int nbrLegs )
    {
        super(ag,n,p);
        this.nbrLegs=nbrLegs;
    }

    @Override
    public String toString()
    {
        return super.toString()+nbrLegs;
    }



}
