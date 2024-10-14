import java.util.*;
class Student{
int prn;
String name,email;
Scanner sc = new Scanner(System.in);
void getdata(){
System.out.println("=== Enter Student Details ===");
System.out.println("Enter Name: ");
name=sc.next();
System.out.println("Enter PRN: ");
prn=sc.nextInt();
System.out.println("Enter Email: ");
email=sc.next();
}
void display(){
System.out.println("**** Student Information *****");
System.out.println("Name : "+name);
System.out.println("PRN : "+prn);
System.out.println("Email : "+email); }
}
public class SingleInExp extends Student {
Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
SingleInExp s1=new SingleInExp();
s1.getdata();
s1.display();
}
}
