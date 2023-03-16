import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to test for Prime : ");
        int number=sc.nextInt();
        if(number==1)
        {
            System.out.println("Not Prime");
            System.exit(0);
        }    
        else if(number==2 || number==3)
        {
            System.out.println("Prime");
            System.exit(0);
        }    
        else if(number%2==0 || number%3==0)
        {
            System.out.println("Not Prime");
            System.exit(0);
        }    
        else
        {
            for(int x=5;x<Math.sqrt(number)+1;x+=6)
            {
                if((number%x==0) || (number%(x+2)==0))
                {
                    System.out.println("Not Prime");
                    System.exit(0);
                }    
            }
        }
        System.out.println("Prime");
    }
}