import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int nn,i;
        m:for (i=1; i<=9; ++i)
        {
            nn=n;
            while(nn>0)
            {
                if (nn%10==i)
                {
                    System.out.println(i);
                    break m;
                }
                nn=nn/10;
            }
        }
    }
}