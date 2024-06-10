import java.util.*;
/**
 * HallowHourGlassPattern
 */
public class HallowHourGlassPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int temp=0;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=temp;k++)
            {
                System.out.print(" ");
            }
            temp++;
            for(int j=1;j<=i;j++)
            {
                if(i>=3 && j>=2 && i!=n && j!=i)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        temp=n-2;
        for(int i=2;i<=n;i++)
        {
            for(int k=1;k<=temp;k++)
            {
                System.out.print(" ");
            }
            temp--;
            for(int j=1;j<=i;j++)
            {
                if(i>=3 && j>=2 && i!=n && j!=i)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}