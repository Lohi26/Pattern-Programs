import java.util.*;
/**
 * ZeroOneTriangle
 */
public class ZeroOneTriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int count;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                count=0;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(count+" ");
                    count=count==0?1:0;
                }
            }
            else if(i%2!=0)
            {
                count=1;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(count+" ");
                    count=count==1?0:1;
                }
            }
            System.out.println();
        }
    }
}
