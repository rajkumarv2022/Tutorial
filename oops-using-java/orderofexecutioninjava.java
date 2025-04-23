/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class gp{
    
    static{
        System.out.println("gp class static block is executed");
    }
    gp()
    {
        System.out.println("gp class method is executed");
    }
    
}
class parrent extends gp{
    
    static{
        System.out.println("parrent class static block is executed");
    }
    parrent()
    {
        System.out.println("parrent class method is executed");
    }
    
}
class child extends parrent{
    static{
        System.out.println("child class static block is executed");
    }
    child()
    {
        System.out.println("child class method is executed");
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	    child obj = new child();
		
	}
}
