import java.util.Scanner;
class ListComprehension
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sublist value : ");
        int n=sc.nextInt();
        int list[][]=new int[n][n];
        int index=1;
        for(int x=0;x<list.length;x++)
        {
            for(int y=0;y<list[0].length;y++)
            {
                list[x][y]=index;
                index++;
            }
        }
        for(int x=0;x<list.length;x++)
        {
            for(int y=0;y<list[0].length;y++)
            {
                System.out.print(list[x][y]+" ");
            }
            System.out.println();
        }
    }
}