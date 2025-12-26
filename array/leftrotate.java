public class leftrotate {
    public static  void main(String[] args)
    {
        int A[]={3,9,10,12,13,14};
        for(int i=0;i<A.length;i++)
        {
        System.out.println(A[i]);
        }
        int temp=A[0];
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int i=0;i<A.length;i++)
        {
        System.out.println(A[i]);
        }
    }
}
