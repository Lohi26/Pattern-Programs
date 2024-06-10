import java.util.*;
/**
 * TriangularStarPattern
 */
public class TriangularStarPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numeber of rows:");
        int n=sc.nextInt();
        int temp=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=temp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            temp--;
            System.out.println();
        }
    }
}