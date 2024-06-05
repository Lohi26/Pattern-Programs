import java.util.*;
/**
 * NumberIncreasingReversePyramid
 */
public class NumberIncreasingReversePyramid {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int count=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=count;j++)
            {
                System.out.print(j+" ");
            }
            count--;
            System.out.println();
        }
    }
}
