
public class array2d {
    public static void main(String[] args)
    {
        int A[][] = {{1,2},{3,4}};
        int B[][] = {{3,4},{5,6}};

        int C[][]=new int[2][2];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                C[i][j] = A[i][j]+B[i][j];
            }
        }
        for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(C[i][j]+",");
            }
            System.out.print("\n");
            
        }
    }
}