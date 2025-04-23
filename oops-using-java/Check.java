import java.util.*;
public class Check{
    public static void main(String[] args){
    System.out.println("Enter the number to check:");
    Scanner Input=new Scanner(System.in);
    int num=Input.nextInt();
    if(num<0){
    System.out.println("The number is negative");
}
else if(num>0){
    System.out.println("The number is positive");
}
else{
    System.out.println("The number is Zero");
}

}
}