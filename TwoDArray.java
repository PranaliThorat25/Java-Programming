import java.util.Scanner;
public class TwoDArray {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows = scanner.nextInt();
System.out.print("Enter the number of columns: ");
int columns = scanner.nextInt();
// Create the 2D array
int[][] array = new int[rows][columns];
System.out.println("Enter the elements of the array:");
// Input loop to populate the array
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print("Enter element at position [" + i + "][" + j + "]: ");
array[i][j] = scanner.nextInt();
}
}
// Output the array
System.out.println("The entered 2D array is:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print(array[i][j] + " ");
}
System.out.println();
}
scanner.close();
}
}