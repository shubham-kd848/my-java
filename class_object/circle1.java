 class circle
{
  public  double radius;
   public double area(double r)
   {
    return 3.14*r*r;

   }
   public double perimeter(double r)
   {
    return 2*3.14*r;
   }
}
public class circle1
{
    public static void main(String[] args)
    {
        circle c1=new circle();
        System.out.println("area is"+c1.area(4));
        System.out.println("perimeter is"+c1.perimeter(4));
    }
}