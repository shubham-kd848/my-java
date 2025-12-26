import java.lang.*;
class reversecopy
{
    public static void main(String[] args)
    {
        int A[]={ 8,6,10,9,2,15,7,13};
        int B[]=new int[8];
        for(int i=A.length-1;i>=0;i--)
        { 
            for(int j=0;j<A.length-1;j++)
            B[j]=A[i];
        }
        for(int j=0;j<B.length;j++)
        {
            System.out.print(B[j]);
        }
    }
}