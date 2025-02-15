import java.util.Scanner;

public class EvenOddproblem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    // Taking input
System.out.print("Enter a number: ");
int num = scanner.nextInt();
        
 // Checking if the number is even or odd
if (num % 2 == 0) {
 System.out.println(num + " is Even.");
} else {
 System.out.println(num + " is Odd.");
}
        
scanner.close();
 }
}