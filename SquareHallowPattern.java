import java.util.*;
public class SquareHallowPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("*  ");
        }
        System.out.println();
        for(int i=1;i<=n-1;i++)
        {
            System.out.print("*  ");
            for(int j=1;j<=n-2;j++)
            {
                System.out.print("   ");
            }
            System.out.println("*");
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print("*  ");
        }
    }    
}