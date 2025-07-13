```java
package jf.basics;

public class StringBasics {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s;
//
//        System.out.print("Enter sentence: ");
//        s = sc.nextLine();

        // Declaration and Initialization
        String s1 = "Hello"; // String literal (pooled)
        String s2 = new String("Hello"); // String literal (heap)

        // length of string
        System.out.println(s1.length());

        // character access
        System.out.println(s1.charAt(1)); // 'e'

        // Substring
        System.out.println(s1.substring(1)); // "ello"
        System.out.println(s1.substring(1, 4)); // "ell"

        // Concatenation
        String s3 = s1 + "World";
        System.out.println(s3); // "Hello World"

        // String Comparison
        String a = "test";
        String b = "test";
        System.out.println(a == b); // true (same literal pool)
        System.out.println(a.equals(b)); // true (content check)

        String c = new String("test");
        System.out.println(a == c); // false (different object)
        System.out.println(a.equals(c)); // true (same content)

        // Case conversion
        System.out.println(s1.toUpperCase()); // "HELLO"
        System.out.println(s1.toLowerCase()); // "hello"

        // Trim spaces
        String spaced = "   Java   ";
        System.out.println(spaced.trim()); // "Java"

        // Replace characters
        System.out.println(s1.replace('l', 'x')); // "Hexxo"

        // Split string
        String line = "a,b,c";
        String[] parts = line.split(","); // ["a", "b", "c"]
        for (String part: parts) {
            System.out.println(part);
        }

        // Convert string to char array
        char[] chars = s1.toCharArray();
        for (char ch: chars) {
            System.out.println(ch);
        }

        // Convert other types to String
        int num = 123;
        String strNum = String.valueOf(num); // "123"

        // StringBuilder for efficient editing
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.deleteCharAt(5);
        sb.reverse();
        System.out.println(sb.toString());

        // String immutability
        String original = "abc";
        original.concat("def"); // does nothing unless reassigned
        System.out.println(original); // still "abc"

        // Check prefix/suffix
        System.out.println(s1.startsWith("He")); // true
        System.out.println(s1.endsWith("lo")); // true

        // Check containment
        System.out.println(s1.contains("ll")); // true

        // Index methods
        System.out.println(s1.indexOf('l')); // 2
        System.out.println(s1.lastIndexOf('l'));  // 3

        // Empty or blank
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true
    }
}
```