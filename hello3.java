import java.util.Scanner;
public class hello3 {
public static void main(String []args)
{
try (Scanner ob = new Scanner(System.in)) {
int age;
long prn;
float cgpa;
System.out.print("Enter Name: ");
String name = ob.nextLine();
System.out.print("Enter Age: ");
age = ob.nextInt();
ob.nextLine();
System.out.print("Enter PRN No.: ");
prn = ob.nextLong();
System.out.print("Enter CGPA: ");
cgpa = ob.nextFloat();
System.out.println("\nDetails");
System.out.println("Student name:"+name+ "\nStudent Age:"+age+"\nPRN:"+prn+"\nCGPA:"+cgpa);
}
}
}