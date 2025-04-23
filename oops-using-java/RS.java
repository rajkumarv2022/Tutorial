class lb
{
  int l;
  int b;

  public lb(int l1,int b1){
   l = l1;
   b = b1;
  }
}

class Rectangle extends lb
{

Rectangle(int l,int b){
super(l,b);
 System.out.println("Rectangle perimeeter ="+" "+2*(l+b));
 System.out.println("Rectangle area ="+" "+(l*b));
}
}

class Square extends lb
{

Square(int l)
{
super(l,l);
System.out.println("Square perimeeter ="+" "+4*l);
System.out.println("Square area ="+" "+l*l);
}
}


public class RS{
public static void main(String[] args)
{
Rectangle obj = new Rectangle(4,5);
Square obj1 = new Square(4);
}
}