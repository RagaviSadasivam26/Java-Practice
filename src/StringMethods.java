import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println("Length: " + str.length());

        System.out.println("Character at index 2: " + str.charAt(2));

        System.out.println("Concatenation: " + str.concat(" World"));

        System.out.println("Equals 'hello java': " + str.equals("hello java"));

        System.out.println("Equals Ignore Case 'hello java': " + str.equalsIgnoreCase("hello java"));

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        String spacedStr = "  Java  ";
        System.out.println("Trimmed: '" + spacedStr.trim() + "'");

        System.out.println("Substring (1, 5): " + str.substring(1, 5));

        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));

        System.out.println("Index of 'J': " + str.indexOf('J'));

        System.out.println("Last index of 'l': " + str.lastIndexOf('l'));

        System.out.println("Contains 'Java': " + str.contains("Java"));

        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        System.out.println("Ends with 'Java': " + str.endsWith("Java"));

        String csv = "a,b,c,d";
        String[] parts = csv.split(",");
        System.out.println("Split result: " + Arrays.toString(parts));


      // STring bulider

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        System.out.println("append: " + sb);

        sb.insert(5, " World");
        System.out.println("insert: " + sb);

        // replace(start, end, str) - Replaces a substring
        sb.replace(0, 5, "Hi");
        System.out.println("replace: " + sb);

        // delete(start, end) - Deletes characters from start to end index
        sb.delete(2, 8);
        System.out.println("delete: " + sb);

        // deleteCharAt(index) - Deletes a single character
        sb.deleteCharAt(2);
        System.out.println("deleteCharAt: " + sb);

        // reverse() - Reverses the string
        sb.reverse();
        System.out.println("reverse: " + sb);

        // length() - Returns the length
        System.out.println("length: " + sb.length());

        // capacity() - Returns current capacity
        System.out.println("capacity: " + sb.capacity());

        // ensureCapacity() - Increases capacity if needed
        sb.ensureCapacity(50);
        System.out.println("New capacity: " + sb.capacity());

        // trimToSize() - Reduces capacity to current length
        sb.trimToSize();
        System.out.println("Trimmed capacity: " + sb.capacity());

        //String buffer
        StringBuffer sbr = new StringBuffer("Hello");

        sbr.append(" Java");
        System.out.println("append: " + sbr);

        sbr.insert(5, " World");
        System.out.println("insert: " + sbr);

        sbr.replace(0, 5, "Hi");
        System.out.println("replace: " + sbr);

        sbr.delete(2, 8);
        System.out.println("delete: " + sbr);

        sbr.deleteCharAt(2);
        System.out.println("deleteCharAt: " + sbr);

        sbr.reverse();
        System.out.println("reverse: " + sbr);

        System.out.println("length: " + sbr.length());
        System.out.println("capacity: " + sbr.capacity());

        sbr.ensureCapacity(50);
        System.out.println("New capacity: " + sbr.capacity());

        sbr.trimToSize();
        System.out.println("Trimmed capacity: " + sbr.capacity());

    }
}
