import java.util.Scanner;

public class OCT_17_2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while (tc-->0)
        {
            int n= sc.nextInt();
            int arr[]=new int[n];
            int s=0,e=n-1;
            int a=1;
            while(s<e)
            {
                arr[s]=a;
                arr[e]=a+1;
                a+=2;
                s++;
                e--;
            }
            if(n%2!=0)
                arr[s]=n;
            for(int j:arr)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
