import java.util.Scanner;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        // take input and print their LCM
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }
    
    public static int findGCD(int x, int y)
    {
        while(y != 0)
        {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
