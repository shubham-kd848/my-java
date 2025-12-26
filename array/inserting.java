public class inserting {
    public static void main(String[] args)
    {
        int A[]=new int[10];
        int n=6;
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=30;
        A[4]=12;
        A[5]= 7;
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+",");
            System.out.print("");
        }
        int x=20;
        int index=2;
        System.out.print("\n");
        for(int i=n;i>index;i--)
        {
            A[i]=A[i-1];
           
        }
        A[index]=x;
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+",");
             System.out.print("");
        }

    }
    
}
