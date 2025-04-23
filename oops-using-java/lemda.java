interface lemda1
{
void print();
}


public class lemda 
{

	public static void main(String[] args)
	{
                                                               //lemda2 obj = new lemda2();
                					       //obj.print();
             printThing(() -> System.out.println("Hii"));

	}


       static void printThing(lemda1 thing)
        {
                thing.print();
        }


}
`

/*
class lemda2 implements lemda1{

  public void print()
    { 
   System.out.println("Hii");
    }

}  */

