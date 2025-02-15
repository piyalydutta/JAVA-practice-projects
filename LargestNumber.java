import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    // Taking input from user
System.out.print("Enter first number: ");
 int num1 = scanner.nextInt();
        
System.out.print("Enter second number: ");
int num2 = scanner.nextInt();
        
System.out.print("Enter third number: ");
int num3 = scanner.nextInt();
        
   // Finding largest number
int largest = Math.max(num1, Math.max(num2, num3));
        
    // Displaying result
System.out.println("The largest number is: " + largest);
        
scanner.close();
 }
}
    

