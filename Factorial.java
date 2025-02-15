import java.util.Scanner;

public class Factorial {
    
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    // Taking input from user
System.out.print("Enter a number: ");
int num = scanner.nextInt();
        
int factorial = 1;
    for (int i = 1; i <= num; i++) {
        factorial *= i;
    }
        
    // Displaying result
System.out.println("Factorial of " + num + " is: " + factorial);

scanner.close();
  }
}

