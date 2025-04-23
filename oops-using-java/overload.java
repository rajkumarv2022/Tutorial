import java.util*;

class static void method(int x,int y)
{
  System.out.print(x);
  System.out.print(y);
}

class static void method(int x)
 {
   System.out.print(x);
 }
public class static void main(String[] args)
{
  Scanner read = new Scanner;

  int x = read.nextInt();
  int y = read.nextInt();
  method(x,y); 
  method(x);
}