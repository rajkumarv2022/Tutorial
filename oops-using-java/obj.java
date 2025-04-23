public class red
{
     int x =10;

    public void oo()
    { 
        x=15;
    }

}
public class obj
{
    public static void main(String[] args)
    {
        red obj1 = new red();
        System.out.println(obj1.x);
    }
}