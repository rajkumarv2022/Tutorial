import java.util.Scanner;
class fa
{
    void fact(int x)
    {  
     int z =0;
      while(x!=0)    
      {           
      int y = (int)Math.sqrt(z),flag=0;
      for(int i=2;i<=y;i++)
      {
           if(z%i==0)
           {
              flag = 1;
           }
      }
      if(flag==0)
      {
        System.out.print(z+" ");
        x--;
      }
      flag=0;
      z++;
    }
}

}
class ex
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
       
        fa fact = new fa();
        fact.fact(a);
         read.close();
    }

}
