import java.util.Scanner;

class traf
{
  public static void main(String[] args)

     {
           Scanner read = new Scanner(System.in);
           System.out.println("\n1 for Red \n2 for Yellow \n3 for Green \nEnter: ");
           int ch = read.nextInt();
           switch(ch)
              {
                 case 1:  System.out.print("Red");break;
                 case 2: System.out.print("Yellow");break;
                 case 3: System.out.print("Green");break;
                 default: System.out.print("Invalid Input");break;
                  
                
              }

     }
}