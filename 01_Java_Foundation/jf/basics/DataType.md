```java
package jf.basics;

public class DataType {
    public static void main(String[] args) {
        // Primitive Data Types

        // 1. Integer types
        byte b = 127;              // 8-bit
        short s = 32000;           // 16-bit
        int i = 2147483647;        // 32-bit
        long l = 9223372036854775807L; // 64-bit

        // 2. Floating-point types
        float f = 3.14f;           // 32-bit
        double d = 3.14159265359;  // 64-bit

        // 3. Character type
        char c = 'A';              // 16-bit (Unicode)

        // 4. Boolean type
        boolean isTrue = true;     // true or false

        // Non-Primitive (Reference) Data Types

        // 1. String
        String name = "Java";

        // 2. Array
        int[] numbers = {1, 2, 3};

        // 3. Object (Custom class) // Subclass for now
        DataType.Person person = new DataType.Person("Alice", 30);
    }

    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
```