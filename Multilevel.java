import java.util.Scanner;
class Collage
{
Scanner sc=new Scanner(System.in);
int clg_id;
String clg_name,clg_loc;
void getdata(){
System.out.println("=== Enter Collage Details ===");
System.out.println("Enter Collage ID: ");
clg_id=sc.nextInt();
System.out.println("Enter Collage Name: ");
clg_name=sc.next();
System.out.println("Enter Collage Location: ");
clg_loc=sc.next();
}
void putdata(){
System.out.println("Collage ID : "+clg_id);
System.out.println("Collage Name : "+clg_name);
System.out.println("Collage Location : "+clg_loc);
}
}
class Department extends Collage{
Scanner sc=new Scanner(System.in);
int Dep_id;
String Dep_name;
void getdata1(){
System.out.println("=== Enter Department Details ===");
System.out.println("Enter Deaprtment ID: ");
Dep_id=sc.nextInt();
System.out.println("Enter Deaprtment Name: ");
Dep_name=sc.next();
}
void putdata1(){
System.out.println("Department ID : "+Dep_id);
System.out.println("Department Name : "+Dep_name);
}
}
class Teacher extends Department{
Scanner sc=new Scanner(System.in);
String Teacher_name;
String Teacher_qualification;
void getdata2(){
System.out.println("=== Enter Teacher Details ===");
System.out.println("Enter Teacher Name: ");
Teacher_name=sc.next();
System.out.println("Enter Teacher Qualification: ");
Teacher_qualification=sc.next();
}
void putdata2(){
System.out.println("Teacher Name : "+Teacher_name);
System.out.println("Teacher Qualification: "+Teacher_qualification);
}
}
public class Multilevel {
public static void main(String[] args) {
Teacher t1=new Teacher();
t1.getdata();
t1.getdata1();
t1.getdata2();
System.out.println(" ********** Collage Deatils ********");
t1.putdata();
t1.putdata1();
t1.putdata2();
}
}
