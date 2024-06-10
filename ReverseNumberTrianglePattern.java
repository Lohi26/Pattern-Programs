import java.util.*;
/**
 * ReverseNumberTrianglePattern
 */
public class ReverseNumberTrianglePattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int temp=1,flag=0;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=flag;k++)
            {
                System.out.print(" ");
            }
            flag++;
            for(int j=temp;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            temp++;
            System.out.println();
        }
    }
}