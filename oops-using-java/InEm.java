class Membors
{
  String name,add;
  int age;
  long pn;
  float sal;
}
class Employee extends Membors
{
  String spec,dep;
  public Employee()
{
    name = "Dev";
    age = 16;
    pn = 9875635478L;
    sal = 12.55f;
    add = "No 450 Ambedkar colony";
    spec = "IOT";
    dep = "ECE";
}
public void printSalary()

{
  System.out.println(name+"\n"+age+"\n"+pn+"\n"+sal+"\n"+add+"\n"+spec+"\n"+dep);
}

}

class Manager extends Membors
{ 
  String spec,dep;
  public Manager(){
    name = "Dev";
    age = 16;
    pn = 9875635478L;
    sal = 12.55f;
    add = "No 450 Ambedkar colony";
    spec = "IOT";
    dep = "ECE";
}
public void printSalary()

{
  System.out.println(name+"\n"+age+"\n"+pn+"\n"+sal+"\n"+add+"\n"+spec+"\n"+dep);
}

}

public class InEm{

public static void main(String[] args)
{
  Employee obj = new Employee();
  Manager obj2 = new Manager();
  obj.printSalary();
  obj2.printSalary();
}
}