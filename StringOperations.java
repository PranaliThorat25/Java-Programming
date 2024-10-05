package project;

public class StringOperations {
	
	    public static void main(String[] args) {
	        // Sample string
	        String str = "Hello, Java!";

	        // 1. String length
	        int length = str.length();
	        System.out.println("Length: " + length);

	        // 2. Character at a specific index
	        char charAt = str.charAt(5);
	        System.out.println("Character at index 5: " + charAt);

	        // 3. Substring
	        String substring = str.substring(7);
	        System.out.println("Substring from index 7: " + substring);

	        // 4. String concatenation
	        String concatenated = str.concat(" Welcome!");
	        System.out.println("Concatenated string: " + concatenated);

	        // 5. Check if strings are equal
	        boolean equals = str.equals("Hello, Java!");
	        System.out.println("String equals 'Hello, Java!': " + equals);

	        // 6. Convert to uppercase
	        String upperCase = str.toUpperCase();
	        System.out.println("Uppercase: " + upperCase);

	        // 7. Replace characters
	        String replaced = str.replace('a', 'o');
	        System.out.println("String after replace: " + replaced);

	        // 8. Check if the string contains a sequence
	        boolean contains = str.contains("Java");
	        System.out.println("Contains 'Java': " + contains);

	        // 9. Split string by a delimiter
	        String[] parts = str.split(",");
	        System.out.println("Split parts:");
	        for (String part : parts) {
	            System.out.println(part);
	        }

	        // 10. Trim leading and trailing spaces
	        String strWithSpaces = "   Hello, Java!   ";
	        String trimmed = strWithSpaces.trim();
	        System.out.println("Trimmed string: '" + trimmed + "'");
	    }
	}
