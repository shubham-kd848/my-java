class rectangle
{
int length;
int breadth;
rectangle(int l,int b)
{
    this.length=l;
    this.breadth=b;
}
void display()
{
    System.out.println("Length: " + length);
    System.out.println("Breadth: " + breadth);
}
 public static void main(String[] args)
    {
        rectangle r1=new rectangle(5,10);
        r1.display();
}
}
