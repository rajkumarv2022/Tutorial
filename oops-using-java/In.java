class parent
{
public parent()
{
System.out.println("This is Parrent class");
}
}

class child extends parent
{

public child()
{
super();
System.out.println("This is child class");
}
}

public class In{
  public static void main(String[] args)
{
   child obj = new child();
   
}
}