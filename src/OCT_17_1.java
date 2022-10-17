import java.util.Scanner;

public class OCT_17_1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while (tc-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] narr=new int[10];
            for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                narr[arr[i]]=1;
            }
            int leftnum=0;
            for(int i=0;i<10;i++)
            {
                if(narr[i]==0)leftnum++;
            }
            int ans=leftnum*(leftnum-1);
            System.out.println((6*ans)/2);
        }
    }
}
