import java.util.Scanner;
class bubble
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT TO INSERT");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i <= n-1; i++)
        {
            ar[i] = sc.nextInt();
        }
        for(int i = 0; i <= n-1; i++)
        {
            for(int j = 0; j<= n-2; j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int t = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                }
            }
        }
        for(int i = 0; i <= n-1; i++)
        {
            System.out.print(ar[i]);
        }
    }
}