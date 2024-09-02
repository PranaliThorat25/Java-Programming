import java.util.Scanner;
public class demo {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter the Number of Rows of Array:");
int size = obj.nextInt();
int [][]arr= new int[size][];
int i,j;
for(i=0 ; i<size; i++)
{
System.out.println("Enter the Number of Elements for Array:"+(i+1));
int count = obj.nextInt();
arr[i]=new int[count];
System.out.println("Enter the Variables:");
for(j=0;j<count;j++)
{
arr[i][j] = obj.nextInt();
}
System.out.print("\n");
}
System.out.println("Given Jagged Array:");
for(i=0 ; i<arr.length ; i++)
{
for(j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.print("\n");
}
}
}