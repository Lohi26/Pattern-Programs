import java.util.*;
/**
 * ReverseRightHalfPyramid
 */
public class ReverseRightHalfPyramid {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=n-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}