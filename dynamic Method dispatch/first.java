class Super
{
    public  void meth1()
    {
        System.out.println("super class method 1");
    }
    public void meth2()
    {
        System.out.println("super class method 2");
    }
}
class Sub extends Super
{
   public void meth2()
   {
        System.out.println("sub class method 2");
   }
   public void meth3()
   {
        System.out.println("sub class method 3");
   }
}  
  public class first {
    public static void main(String [] args)
    {
        Super su=new Sub();
        su.meth1();
        su.meth2();
    }
    
}
