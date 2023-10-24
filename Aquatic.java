public abstract class Aquatic extends Animal{

   String habitat;

  public Aquatic()
   {

   }

   public Aquatic(int ag,String n,float p,String habitat)
   {
      super(ag,n,p);
      this.habitat=habitat;
   }

   @Override
   public String toString()
   {
      return super.toString()+habitat;
   }

   public abstract void swim();

















}
