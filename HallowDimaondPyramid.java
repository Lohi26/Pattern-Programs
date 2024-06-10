import java.util.*;
/**
 * HallowDimaondPyramid
 */
public class HallowDimaondPyramid {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int temp=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=temp;j++)
            {
                System.out.print(" ");
            }
            temp--;
            for(int k=1;k<=i;k++)
            {
                if(i>=3 && k>=2 && k!=i)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        temp=1;
        for(int i=n-1;i>=1;i--)
        {
            for(int k=1;k<=temp;k++)
            {
                System.out.print(" ");
            }
            temp++;
            for(int j=1;j<=i;j++)
            {
                if(i>=3 && j>=2 && j!=i && i!=n)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}