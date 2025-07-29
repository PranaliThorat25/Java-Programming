// function should print the alphabets
// from c1 to c2 (space separated)

class Solution {
    public static void alphabets(char c1, char c2) {
    
        for(char ch = c1; ch <= c2; ch++)
        {
            System.out.print(ch + " ");
        }
    }
}
