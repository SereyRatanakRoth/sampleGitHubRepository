package computearea;
import java.util.Scanner;

public class ComputeArea {
  
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       //tell user to enter the value
       System.out.println("enter the three numbers: ");
       double number1 = input.nextDouble();
       double number2 = input.nextDouble();
       double number3 = input.nextDouble();
       
       double average = (number1 + number2 + number3)/3;
       
       System.out.print("the average of " + number1 + " " + number2 + " " + number3 + " is " + average);
       
       
        
    
    }
    
}
