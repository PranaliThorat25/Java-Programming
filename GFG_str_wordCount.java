// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        String[] words = str.trim().split("\\s+"); 
        int wordCount = words.length;
        
        return wordCount;
        
    }
}
