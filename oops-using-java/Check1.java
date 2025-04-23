import java.util.Scanner;

class Check1
{ 
  public static void main(String[] args)
{
  Scanner read = new Scanner(System.in);

  System.out.println("Enter number to check : ");
  int num = read.nextInt();
  
  if(num >0)
   {
      System.out.println("The number is Possitive");
   }
else if (num<0)
{
     System.out.print("The number is Negative");
}
else
{
  System.out.print("The number is Zero");
}
}
}