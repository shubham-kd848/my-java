public class secondlargest {
    public static void main(String[] args)
    {
         int A[]={3,9,7,8,12,6,15,5,4,10};
         int max1,sax;
         max1=sax=A[0];
         for(int i=0;i<A.length;i++)
         {
            if(A[i]>max1)
            {
                sax=max1;
                max1=A[i];

            }
            else if(A[i]>sax)
            {
                sax=A[i];
            }
         }
         System.out.println(sax);
         System.out.println(max1);
    }
    
}

