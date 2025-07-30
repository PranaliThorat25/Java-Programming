class Solution {
    public static boolean isPalindrome(String s) {
  
        String rev = new StringBuilder(s).reverse().toString();
        
       return s.equalsIgnoreCase(rev);
    }
}
