import java.util.Scanner;

public class SumofTwoNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    
    // Taking input from user
System.out.println("Enter first number: ");
int num1 = scanner.nextInt();
            
System.out.println("Enter second number: ");
int num2 = scanner.nextInt();
            
   // Calculating Sum
int sum = num1 + num2;
            
  // Displaying result
System.out.println("The sum of two numbers is: " + sum);
            
scanner.close();
  }
}
    
