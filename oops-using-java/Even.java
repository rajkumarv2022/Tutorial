import java.util.Scanner;

class Add
{
     int z;
    void add(int x,int y)
    {
       
        if(x>y)
        {
            z=x;
        }
        else
        {
            z=y;
        }
    }
}

class Even
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();
        int y =read.nextInt();
        Add rEad = new Add();
        rEad.add(x,y);
        System.out.print(rEad.z);
        read.close();

    }
}