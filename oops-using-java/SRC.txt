class Shape{
    Shape()
{
System.out.println("This is a Shape");
}
}
class Rectangle extends Shape{

Rectangle()
{
System.out.println("This is a Rectangle Shape");

}
}

class Circle extends Shape{
 Circle()
{
System.out.println("This is Circle a Shape");

}

}

class Square1 extends Rectangle{
    Square()
{
Shape obj = new Shape();
Rectangle obj1 = new Rectangle();
}
}

public class SRC
{
public static void main(){
Circle obj = new Circle();
}
}
