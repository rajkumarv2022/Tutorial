import java.util.Scanner;

class D_C
{
   String name = "Hii";
   int id = 12;
    D_C(String name,int id)
    {
       System.out.print(name+" "+id);
    }
    D_C()
    {
        System.out.print(name+" "+id);
    }
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String name = read.next();
        int id = read.nextInt();
        D_C ob = new D_C(name,id);
        D_C ob1 = new D_C();
        

    }
}