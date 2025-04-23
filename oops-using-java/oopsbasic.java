class C{
    
    static{
        System.out.println("\nStatic block of grand Parrent is executed");
    }
    
    C()
    {
        System.out.println("\nGrand Parrent constructor is invoked");
    }
}

class B extends C{
    static{
        System.out.println("\nStatic block of Parrent class is executed");
    }
    
    B()
    {
        System.out.println("\nParrent class constructor is invoked");
    }
    
}
class A extends B{
    
    static{
        System.out.println("\nStatic block of child class");
    }
    
    A()
    {
        System.out.println("\nChild class constructo is invoked");
    }
    
}

class main{
    public static void main(String[] args)
    {
        A obj = new A();
    }
    
}