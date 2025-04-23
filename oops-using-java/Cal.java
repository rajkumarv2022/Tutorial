import java.util.Scanner;

class Cal
{
 public static void main(String[] args)
 {
    
    Scanner read = new Scanner(System.in);
    System.out.print("Enter No of Prod : ");
    int n = read.nextInt();
    while(n!=0)
{
    float tot;
    
    System.out.print("Enter Prod Id : ");
    int id = read.nextInt();
    System.out.print("Enter prod Name : ");
    String prod = read.next(); 
    System.out.print("Enter Qty : ");
    int Qty = read.nextInt();
    System.out.print("Enter Price : ");
    float price = read.nextFloat();
    System.out.print("Prd Id : "+id+"\n"+"Prd Name : "+prod+"\n"+"Qty : "+Qty+"\n"+"Price : "+price);
   // tot = price*Qty;
} 

   // System.out.print("\n"+"Total : "+tot);
    
 }

}