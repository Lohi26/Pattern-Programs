import java.util.*;
/**
 * PalindromeTriangular
 */
public class PalindromeTriangular {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int count=1,k=1,temp=0;
        for(int i=1;i<=n;i++)
        {
            temp=k;
            for(int j=1;j<=n-i;j++)
            System.out.print("  ");
            for(int x=1;x<=count;x++)
            {
                System.out.print(temp+" ");
                if(temp==1 && k!=1)
                {
                    for(int y=1;y<=count-1;y++)
                    {
                        ++temp;
                        System.out.print(temp+" ");
                    }
                }
                temp--;
            }
            k++;
            count++;
            System.out.println();
        }
    }
}
