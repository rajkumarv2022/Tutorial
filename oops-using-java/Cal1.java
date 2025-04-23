import java.util.*;

class Cal1
{
  public static void main(String[] args)
  {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter no of items : ");
        int n = read.nextInt();
        float temp=0;
        for(int i=1;i<=n;i++)
            {
               System.out.println("Enter product "+i+" Price : ");
               float pri=read.nextFloat();
               temp=temp+pri;
            }
          System.out.println("Total amount to be paid : "+temp);

          
        
  }
}