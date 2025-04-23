import java.util.Scanner;

class main{
    
    public static void main(String[] args)
    {
        
      Scanner obj = new Scanner(System.in);
      
      while(true)
      {
          String name = obj.nextLine();
          
          System.out.println(name);
          
          if(!obj.hasNext())
          {
              break;
          }
      }
      
       
    }
    
}