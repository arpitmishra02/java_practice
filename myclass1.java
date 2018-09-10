import java.util.Scanner;
class myclass1{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,j=0,k,sum=0;
        i=s.nextInt();
        k=i;
        while(k!=0)
        {
            j=j*10+k%10;
            k=k/10;
        }
        if(i==j)
        {   k=i;
            System.out.print(j+ " is palindrome");
            while(k!=0)
            {   if(k%2==0)
                    sum+=k%10;
                k=k/2;
            }
            if(sum>25)
                System.out.println(" and the sum of even numbers is greater than 25 ");
            else
            {
                System.out.println(" and the sum of even numbers is less than 25");
            }
        }
        else
        {
            System.out.print(i + " is not a palindrome");
        }
    }

}
