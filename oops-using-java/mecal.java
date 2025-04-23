import java.util.*;

class mecal
{
  public static void main(String[] args)
  {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number of items : ");
        int n = read.nextInt();
        float total=0;
        for(int i=1;i<=n;i++)
            {
               System.out.println("Enter the product "+ i +" price : ");
               float price=read.nextFloat();
               total=total+price;
            }
          System.out.println("Total amount to be paid : "+total);

          
        
  }
}