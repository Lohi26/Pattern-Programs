import java.util.*;
/**
 * ReverseLeftHalfPyramid
 */
public class ReverseLeftHalfPyramid {

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
                System.out.print("*");
            }
            System.out.println();
        }
    }
}