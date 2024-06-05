/**
 * NumberIncreasingPyramid
 */
import java.util.*;
public class NumberIncreasingPyramid {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int count;
        for(int i=1;i<=n;i++)
        {
            count=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}