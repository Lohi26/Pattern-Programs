import java.util.*;
/**
 * RhombusPattern
 */
public class RhombusPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        System.out.print(" ");
        for(int i=1;i<=n+1;i++)
        {
            if(i>1)
            {
                for(int k=1;k<=i;k++)
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}