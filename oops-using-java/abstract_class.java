abstract class class1{
     abstract void animal();
     abstract void sound();
}

abstract class animal extends class1{

     
     void animal()
        {
            System.out.println("Animal");
        }
    
}

class finall extends animal{
    
    void sound()
    {
        System.out.println("Sound");
    }
    
}

class main{
    
    public static void main(String[] args)
    {
        finall obj = new finall();
        
        obj.animal();
        obj.sound();
    }
}