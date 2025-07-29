// function to print the two string
// first string: the first character is changed to uppercase
// second string: complete string is changed to upper case.
// print both the string in new line.
class Solution {
    public static void changeCase(String s) {
      
        String result = s.substring(0,1).toUpperCase() + s.substring(1);
        String FullCap =  s.toUpperCase();
        
        System.out.println(result);
        System.out.println(FullCap);
    }
}
