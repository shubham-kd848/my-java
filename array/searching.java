import java.util.Scanner;
public class searching
{
    public static void main(String[] args)
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter data to be found: ");
        int data=sc.nextInt();
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==data)
            {
                System.out.println("element found "+i);
                System.exit(0);
            }
            
        }
        
         System.out.println("element not found");
            
    }
}