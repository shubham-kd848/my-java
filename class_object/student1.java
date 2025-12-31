 class student {
    public int rollno;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (m1+m2+m3)/3;
    }
    

}
public class student1
{
    public static void main(String[] args)
    {
    student s=new student();
   s.rollno=1;
   s.name="abc";
   s.course="java";
   s.m1=80;
   s.m2=70;
   s.m3=90;
   System.out.println("Roll No: "+s.rollno);
   System.out.println("Name: "+s.name);
   System.out.println("Course: "+s.course);
   System.out.println("Total Marks: "+s.total());
   System.out.println("Average Marks: "+s.average());
}
}
