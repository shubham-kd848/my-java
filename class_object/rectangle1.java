 class rectangle {
    public double length,breadth;
    public double area()
    {
        return length * breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
public class rectangle1
{
    public static void main(String[] args)
    {
        rectangle r1=new rectangle();
        r1.length=4;
        r1.breadth=7;
        System.out.println("area is : " +r1.area());
        System.out.println("perimeter is : "+r1.perimeter());
    }
}
