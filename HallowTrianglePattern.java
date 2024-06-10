import java.util.*;
/**
 * HallowTrianglePattern
 */
public class HallowTrianglePattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int temp=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=temp;k++)
            {
                System.out.print(" ");
            }
            temp--;
            for(int j=1;j<=i;j++)
            {
                if(i>=3 && j>=2 && i!=n && j!=i)
                {
                    System.out.print("  ");
                }
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}