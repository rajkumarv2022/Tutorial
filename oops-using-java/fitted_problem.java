import java.util.Scanner;

class main{
    
    public static void main(String[] args)
    {
        
      Scanner obj = new Scanner(System.in);
      
      try{
          long val = obj.nextLong();
          
          if(val>=Byte.MIN_VALUE && val<= Byte.MAX_VALUE)
          {
              System.out.println("Can be fitted in Byte");
          }
          if(val>=Short.MIN_VALUE && val<=Short.MAX_VALUE)
          {
              System.out.println("Can be fitted in Short");
          }
          if(val>=Integer.MIN_VALUE && val<=Integer.MAX_VALUE)
          {
              System.out.println("Can be fitted in int");
          }
          if(val>=Long.MIN_VALUE && val<=Long.MAX_VALUE)
          {
              System.out.println("Can be fitted in Long");
          }
         
      }
      catch (Exception Error)
      {
          System.out.println(obj.next()+"Cant be fitted any where");
      }
       
    }
    
}