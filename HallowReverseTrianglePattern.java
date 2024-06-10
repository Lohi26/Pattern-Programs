import java.util.*;
/**
 * HallowReverseTrianglePattern
 */
public class HallowReverseTrianglePattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int flag=0;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=flag;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i>=2 && j>=2 && i!=n && j!=i)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            flag++;
            System.out.println();
        }
    }
}
