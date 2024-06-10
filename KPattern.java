import java.util.*;
/**
 * KPattern
 */
public class KPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int temp=0;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=temp;k++)
            {
                System.out.print(" ");
            }
            temp++;
            System.out.println();
        }
        int flag=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=flag;k++)
            {
                System.out.print(" ");
            }
            flag--;
            System.out.println();
        }
    }
}