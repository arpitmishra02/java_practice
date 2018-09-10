import java.io.*;
class myclass4{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int k;
        for(int i=1;i<=n;i++)
        {   k=i;
            while(k!=0)
            {   k--;
                System.out.print(i + " ");
            }
        }
    }
}
