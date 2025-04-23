interface animal{
    void animal();
    void sound();
}

class finall implements animal{
    
   public void animal()
    {
        System.out.println("Animal");
    }
    
   public void sound()
    {
        System.out.println("Sound");
    }
}

class main{
    public static void main(String[] args){
        
        finall obj = new finall();
        
        obj.animal();
        obj.sound();
    }
}