import java.util.*;
/**
 * RightHalfPyramid
 */
public class RightHalfPyramid {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}