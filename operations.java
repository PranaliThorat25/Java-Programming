import java.util.Scanner;
public class operations {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n1,n2,n3,ch;
        do {

            System.out.println("\n--Menu--\n1.ADD\n2.SUB\n3.MUL\n4.DIV\n");
            System.out.print("Enter the Choice:");
            ch = ob.nextInt();
            switch (ch) {
            case 1:
            System.out.print("Enter 1st Number: ");
            n1 = ob.nextInt();
            System.out.print("Enter 2nd Number: ");
            n2 = ob.nextInt();

            n3=n1+n2;
            System.out.print("Addition = "+n3);
            break;
            case 2:
            System.out.print("Enter 1st Number: ");
            n1 = ob.nextInt();

            System.out.print("Enter 2nd Number: ");
            n2 = ob.nextInt();

            n3=n1-n2;
            System.out.print("Subtraction = "+n3);
            break;
            case 3:
            System.out.print("Enter 1st Number: ");
            n1 = ob.nextInt();
            System.out.print("Enter 2nd Number: ");
            n2 = ob.nextInt();

            n3=n1*n2;
            System.out.print("Multiplication = "+n3);
            break;
            case 4:
            System.out.print("Enter 1st Number: ");
            n1 = ob.nextInt();
            System.out.print("Enter 2nd Number: ");
            n2 = ob.nextInt();

            n3=n1/n2;
            System.out.print("Division = "+n3);
            break;
            default:
            System.out.print("Invalid Choice...!");
 }
 } while (ch!=5);
 ob.close();
 }
}