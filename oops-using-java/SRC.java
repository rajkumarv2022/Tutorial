class Shape{
    void printShape()
{
System.out.println("This is a Shape");
}
}
class Rectangle extends Shape{

void printRectangle()
{
System.out.println("This is  Rectangle Shape");

}
}

class Circle extends Shape{
 void printCircle()
{
System.out.println("This is Circle  Shape");

}

}

class Square extends Rectangle{
    void printSquare()
{
System.out.println("Square is a Rectangle");
}
}

public class SRC
{
public static void main(String[] args){
Square obj = new Square();
obj.printShape();
obj.printRectangle();
//obj.printCircle();
obj.printSquare();
}
}
