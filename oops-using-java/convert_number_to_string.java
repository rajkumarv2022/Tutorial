import java.util.Scanner;

class main{
    
    public static void main(String[] args)
    {
        
      Scanner obj = new Scanner(System.in);
      
      int num = obj.nextInt();
      
      String str=Integer.toString(num); 
      if(num==Integer.parseInt(str))
      {
          System.out.println("Good Job");
      }
      
       
    }
    
}