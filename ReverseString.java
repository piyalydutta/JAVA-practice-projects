import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

  // Taking input from the user
System.out.print("Enter a string: ");

String originalStr = scanner.nextLine();
String reversedStr = "";

  // Printing the original string
System.out.println("Original string: " + originalStr);

  // Reversing the string
for (int i = 0; i < originalStr.length(); i++) {
     reversedStr = originalStr.charAt(i) + reversedStr;
    }

  // Printing the reversed string
System.out.println("Reversed string: " + reversedStr);

scanner.close();
 }
}
    

