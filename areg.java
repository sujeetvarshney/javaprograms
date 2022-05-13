import java.util.Scanner;

class areg
{
    public static void main(String args[]) {
 
        Scanner sc=new Scanner(System.in);

        int ar[]=new int[10]; //array of size 10
        
        int s=0;
        for(int i=0;i<10;i++)
        {
               ar[i]=sc.nextInt(); 
               s=s+ar[i];
        }

        System.out.println("sum is "+s);



    }
}