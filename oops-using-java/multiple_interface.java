interface animal{
    void animal();
    void sound();
}
interface bird{
    
    void bird();
    void sound();
}

class class1{
    void print()
    {
        System.out.println("Print");
    }
}

class finall extends class1 implements animal,bird{
    
   public void animal()
    {
        System.out.println("Animal");
    }
    
   public void sound()
    {
        System.out.println("Sound");
    }
   public void bird()
   {
       System.out.println("Bird");
   }
   
   public void sound1(){
       System.out.println("Bird Sound");
   }
   
}

class main{
    public static void main(String[] args){
        
        finall obj = new finall();
        
        obj.animal();
        obj.sound();
        obj.bird();
        obj.sound1();
        obj.print();
    }
}