class lb
{
  public lb(int l,int b){}
}

class Rectangle extends lb
{

Rectangle(int l,int b){
 System.out.println("Rectangle perimeeter ="+" "+2*(l+b));
 System.out.println("Rectangle area ="+" "+2*(l+b));
}
}

class Square extends lb
{

Square(int l,int b)
{
System.out.println("Square perimeeter ="+" "+2*(l+b));
System.out.println("Square area ="+" "+2*(l+b));
}
}


public class RS{
public static void main(String[] args)
{
Rectangle obj = new Rectangle(4,5);
Square obj1 = new Square(4,5);
}
}