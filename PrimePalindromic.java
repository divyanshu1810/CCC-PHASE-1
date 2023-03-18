import java.util.Scanner;
class PrimePalindromic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        int x=0;
        while(true)
        {
            if(isPrime(x+n) && isPalindrome(x+n))
            {
                System.out.println(x+n);
                System.exit(0);
            }
            if(isPrime(n-x) && isPalindrome(n-x))
            {
                System.out.println(n-x);
                System.exit(0);
            }
            x++;
        }
    }
    public static boolean isPrime(int n)
    {
        if (n==1) return false;
        else
        {
            for(int x=2;x<=n/2;x++)
            {
                if(n%x==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isPalindrome(int n)
    {
        int m=n;
        int t=0;
        while(n!=0)
        {
            int d=n%10;
            t=t*10+d;
            n=n/10;
        }
        return m==t;
    }
}