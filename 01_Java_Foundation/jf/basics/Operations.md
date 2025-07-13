```java
package jf.basics;

public class Operations {
    public static void main(String[] args) {
        // Arithmetic Operations

        int a = 20;
        int b = 8;

        int sum = a + b;            // Addition
        int difference = a - b;     // Subtraction
        int product = a * b;        // Multiplication
        int quotient = a / b;       // Integer Division
        int remainder = a % b;      // Modulus

        double x = 7.0;
        double y = 2.0;
        double preciseQuotient = x / y; // Floating-point Division

        // Relational/Comparison Operations

        boolean isEqual = (a == b);           // Equal to
        boolean isNotEqual = (a != b);        // Not equal to
        boolean isGreater = (a > b);          // Greater than
        boolean isLess = (a < b);             // Less than
        boolean isGreaterOrEqual = (a >= b);  // Greater than or equal to
        boolean isLessOrEqual = (a <= b);     // Less than or equal to

        // Logical Operations

        boolean x = true;
        boolean y = false;

        boolean andResult = x && y;    // Logical AND
        boolean orResult = x || y;     // Logical OR
        boolean notX = !x;             // Logical NOT

        // Bitwise Operations

        int a = 5;   // 0101 in binary
        int b = 3;   // 0011 in binary

        int and = a & b;    // Bitwise AND → 0001 → 1
        int or = a | b;     // Bitwise OR  → 0111 → 7
        int xor = a ^ b;    // Bitwise XOR → 0110 → 6
        // ~n = -(n+1)
        int complement = ~a; // Bitwise NOT → ...11111010 → -6 (2's complement)
        int leftShift = a << 1;  // Shift left  → 1010 → 10
        int rightShift = a >> 1; // Shift right → 0010 → 2

        // General formula: Two’s Compliment

        // If you already have the bit width 'n', and a positive integer `x`, the two’s complement of `x` is:

        // Two’s complement of x = 2^n - x

//        2^8 = 256
//        256 - 6 = 250
//        250 in binary = 11111010 → this is -6
//
//        2^32 - 6 = 4294967290 → binary = 11111111 11111111 11111111 11111010

        // Assignment Operations

        int a = 10;       // Simple assignment
        a += 5;           // a = a + 5 → 15
        a -= 3;           // a = a - 3 → 12
        a *= 2;           // a = a * 2 → 24
        a /= 4;           // a = a / 4 → 6
        a %= 5;           // a = a % 5 → 1

        // Unary Operations

        int a = 5;

        int preIncrement = ++a;   // Increment before use, a = 6
        int postIncrement = a++;  // Use then increment, postIncrement = 6, a = 7

        int preDecrement = --a;   // Decrement before use, a = 6
        int postDecrement = a--;  // Use then decrement, postDecrement = 6, a = 5

        int positive = +a;        // Unary plus (no change)
        int negative = -a;        // Unary minus (negation)

        boolean flag = true;
        boolean notFlag = !flag;  // Logical NOT

        // Shift Operations

        int a = 16; // Binary: 0001 0000

        int leftShift1 = a << 2;    // Shift left by 2 → 0100 0000 (64)
        int rightShift1 = a >> 2;   // Shift right by 2 → 0000 0100 (4)
        int unsignedRightShift = a >>> 2; // Unsigned right shift → 0000 0100 (4)

        int negative1 = -16;         // Binary (two's complement)
        int rightShiftNeg = negative >> 2;     // Arithmetic right shift (sign extended)
        int unsignedRightShiftNeg = negative >>> 2; // Logical right shift (fills with 0)

        // Ternary Operations

        int a = 10;
        int b = 20;

        // Syntax: condition ? valueIfTrue : valueIfFalse;
        int max = (a > b) ? a : b;

        String result = (a % 2 == 0) ? "Even" : "Odd";

        // InstanceOf Operations

        Object obj1 = "Hello, World!";
        Object obj2 = 123;
        Object obj3 = new Person();

        if (obj1 instanceof String) {
            System.out.println("obj1 is a String");
        }

        if (obj2 instanceof Integer) {
            System.out.println("obj2 is an Integer");
        }

        if (obj3 instanceof Person) {
            System.out.println("obj3 is a Person");
        }

        if (!(obj3 instanceof String)) {
            System.out.println("obj3 is NOT a String");
        }

        // String Concatenation Operations

        String firstName = "John";
        String lastName = "Doe";
        int age = 30;

        // Using + operator
        String fullName = firstName + " " + lastName;
        String message = "Name: " + fullName + ", Age: " + age;

        // Using concat() method
        String greeting = "Hello, ".concat(firstName).concat("!");
    }

    static class Person {
        // Empty class for demonstration
    }
}
```
# Operation Precedence

// 1. Postfix
a++; a--;

// 2. Unary
++a; --a; +a; -a; ~a; !a;

// 3. Multiplicative
a * b; a / b; a % b;

// 4. Additive
a + b; a - b;

// 5. Shift
a << b; a >> b; a >>> b;

// 6. Relational
a < b; a > b; a <= b; a >= b; a instanceof B;

// 7. Equality
a == b; a != b;

// 8. Bitwise AND
a & b;

// 9. Bitwise XOR
a ^ b;

// 10. Bitwise OR
a | b;

// 11. Logical AND
a && b;

// 12. Logical OR
a || b;

// 13. Ternary
a ? b : c;

// 14. Assignment
a = b; a += b; a -= b; a *= b;
a /= b; a %= b; a &= b;
a |= b; a ^= b; a <<= b;
a >>= b; a >>>= b;