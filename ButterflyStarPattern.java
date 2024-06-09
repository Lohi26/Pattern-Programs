import java.util.*;
/**
 * ButterflyStarPattern
 */
public class ButterflyStarPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=i;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=2*(n-i);k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int x=1;x<=i;x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// *        *
// **      **
// ***    ***
// ****  ****
// **********