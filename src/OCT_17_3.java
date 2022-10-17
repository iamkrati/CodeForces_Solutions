import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OCT_17_3
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
//        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while (tc-->0)
        {
            int n= sc.nextInt();
            String lids = sc.next();
            int[] mag = new int[n];
            int magzine=0;
            for (int i=0;i<n;i++)
            {
                mag[i] = sc.nextInt();
                if(lids.charAt(i)=='1')magzine+=mag[i];
            }
            int nmagzine=0;
            for(int i=0;i<n;i++)
            {
                if(lids.charAt(i)=='0')nmagzine=mag[i];
                else
                {
                    if(mag[i]<nmagzine)
                    {
                        magzine=magzine+nmagzine;
                        magzine=magzine-mag[i];
                        nmagzine=mag[i];
                    }
                }
            }
            System.out.println(magzine);
        }
    }
}
