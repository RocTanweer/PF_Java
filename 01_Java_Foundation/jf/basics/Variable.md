```java
package jf.basics;

public class Variable {
    public static void main(String[] args) {
        // Variable Declaration and Initialization in Java

        // 1. Declaring variables
                int age;                  // Declaration
                age = 25;                 // Initialization

        // 2. Declaration with initialization
                double height = 1.75;
                boolean isJavaFun = true;
                char grade = 'A';

        // 3. String variable (reference type)
                String name = "Alice";

        // 4. Multiple variables of same type
                int x = 5, y = 10, z = 15;

        // 5. Final variable (constant)
                final double PI = 3.14159;

        // 6. Default values (only for class-level variables)
        // int → 0, double → 0.0, boolean → false, object → null

        // 7. Variable naming rules
                int _count;
                int totalAmount;
                int $index;
        // Invalid: int 2value; (cannot start with digit)



            }

    // 8. Variable scope example
    public static class VariableScope {
        public static void main(String[] args) {
            int localVar = 10;  // local scope
            System.out.println("Local Variable: " + localVar);
        }
    }
}
```