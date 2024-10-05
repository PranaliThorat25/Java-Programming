package project;

public class StringBufferOperations {

	    public static void main(String[] args) {
	        // Create a StringBuffer object
	        StringBuffer sb = new StringBuffer("Hello, Java!");

	        // 1. Append a string
	        sb.append(" Welcome!");
	        System.out.println("After append: " + sb);

	        // 2. Insert a string at a specific position
	        sb.insert(7, "to ");
	        System.out.println("After insert: " + sb);

	        // 3. Replace a part of the string
	        sb.replace(7, 10, "the");
	        System.out.println("After replace: " + sb);

	        // 4. Delete a part of the string
	        sb.delete(5, 7);
	        System.out.println("After delete: " + sb);

	        // 5. Reverse the string
	        sb.reverse();
	        System.out.println("After reverse: " + sb);

	        // Reversing back to the original order for further operations
	        sb.reverse();

	        // 6. Get the length of the string
	        int length = sb.length();
	        System.out.println("Length of string: " + length);

	        // 7. Get a character at a specific index
	        char charAt = sb.charAt(4);
	        System.out.println("Character at index 4: " + charAt);

	        // 8. Set a character at a specific index
	        sb.setCharAt(4, 'o');
	        System.out.println("After setting character at index 4: " + sb);

	        // 9. Get substring
	        String substring = sb.substring(7);
	        System.out.println("Substring from index 7: " + substring);
	    }
	}
