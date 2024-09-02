import java.util.Scanner;
public class student {
String name, branch;
int age, roll_no, contact;
int prn;
Scanner obj = new Scanner(System.in);
void getdetails(){
System.out.print("Enter Name:");
name = obj.next();
System.out.print("Enter Roll No.:");
roll_no = obj.nextInt();
System.out.print("Enter PRN No.:");
prn = obj.nextInt();
System.out.print("Enter Branch:");
branch = obj.next();
System.out.print("Enter Conatct No.:");
contact = obj.nextInt();
System.out.print("Enter age:");
age = obj.nextInt();
}
void info(){
System.out.println("Name:"+name);
System.out.println("Roll No.:"+roll_no);
System.out.println("PRN No.:"+prn);
System.out.println("Branch:"+branch);
System.out.println("Contact:"+contact);
System.out.println("Age:"+age);
}
public static void main(String[] args) {
student s = new student();
s.getdetails();
s.info();
}
}