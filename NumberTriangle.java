/**
 * NumberTriangle
 */
import java.util.*;
public class NumberTriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        int k=n,count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=k-1;j++)
            {
                System.out.print(" ");
            }
            for(int x=1;x<=count;x++)
            System.out.print(i+" ");
            count++;
            k--;
            System.out.println();
        }
    }
}