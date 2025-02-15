import java.util.Scanner;

public class problem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String StudentName;
Long StudentID;
int StudentAge;
float StudentFee;
char StudentGrade;

// Taking student data as input
System.out.print("Enter Student name: ");
StudentName = scanner.nextLine();

 System.out.print("Enter Student ID: ");
 StudentID = scanner.nextLong();

 System.out.print("Enter Student age: ");
 StudentAge = scanner.nextInt();

 System.out.print("Enter Student fee: ");
 StudentFee = scanner.nextFloat();

 System.out.print("Enter Student grade: ");
StudentGrade = scanner.next().charAt(0);
// Printing student details
 System.out.println("\nStudent Details:");
 System.out.println("Student name: " + StudentName);
 System.out.println("Student ID: " + StudentID);
System.out.println("Student age: " + StudentAge);
System.out.println("Student fee: " + StudentFee);
System.out.println("Student grade: " + StudentGrade);
scanner.close();
 }
}