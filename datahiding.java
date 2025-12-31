class circle
{
   private int radius;
    void setradius(int r)
    {
        radius=r;
    }
    

    
    double area()
    {
        return 3.14*radius*radius;
    }
}
public class datahiding
{
    public static void main(String[] args)
    {
        circle c1=new circle();
        c1.setradius(2);
        System.out.println("area is:  "+c1.area());
    }
}