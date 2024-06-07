import java.util.*;
/**
 * DiamondPattern
 */
public class DiamondPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int temp=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=temp-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
            temp--;
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=temp+1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
            temp++;
        }
    }
}