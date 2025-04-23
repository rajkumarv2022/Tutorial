/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    
	
    public static void main(String[] args) throws Exception {
        BufferedReader read1 = new BufferedReader(new InputStreamReader(System.in));
        
        try{
      String a = read1.readLine();
      int aa = Integer.parseInt(a);
      a = String.valueOf(aa);
      System.out.println(a);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }

}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Enter an integer: ");
            String input = reader.readLine();
            int a = Integer.parseInt(input);
            System.out.println("You entered: " + a);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
*/
