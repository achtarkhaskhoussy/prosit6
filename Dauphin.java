public class Dauphin extends Aquatic{

    float swimmingspeed;
    public Dauphin()
    {

    }

    public Dauphin(int ag,String n,float p,String h,float swimmingspeed )
    {
        //super(ag,n,p,h);
        this.swimmingspeed=swimmingspeed;
    }

    @Override
    public String toString()
    {
        return super.toString()+swimmingspeed;
    }
    public void swim()
    {
        System.out.println("This dolphin is swimming");
    }




}
