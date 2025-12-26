 class circle
{
  public  double radius;
   public double area()
   {
    return 3.14*radius*radius;

   }
   public double perimeter()
   {
    return 2*3.14*radius;
   }
}
public class circle1
{
    public static void main(String[] args)
    {
        circle c2=new circle();
        circle c1=new circle();
        c1.radius=12;
        c2.radius=34;
        System.out.println("area is"+ c1.area());
        System.out.println("perimeter is" +c1.perimeter());
        System.out.println("area is" +c2.area());
        System.out.println("perimeter is" +c2.perimeter());
    }
}