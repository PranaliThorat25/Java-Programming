class Solution {
    void printDivisors(int n) {
        // code here
        int i = 1;
        
        while(i <= n)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
