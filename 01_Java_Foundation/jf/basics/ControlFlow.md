```java
package jf.basics;

public class ControlFlow {
    public static void main(String[] args) {
        // if, else if, and else

        int num = 10;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Switch (with break)

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other Day");
        }

        // for loop

        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }

        // while loop

        int i = 0;
        while (i < 5) {
            System.out.println("Count: " + i);
            i++;
        }

        // do-while loop

        int i1 = 0;

        do {
            System.out.println("Count: " + i);
            i1++;
        } while (i1 < 5);

        // break - exit loop/switch early

        for (int i2 = 0; i2 < 10; i2++) {
            if (i2 == 5) break;
            System.out.println(i2);
        }

        // continue

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i); // prints only odd numbers
        }

        // nested loop

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        // label break/continue

        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) break outer;
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        // Infinite loop (with break)

        while (true) {
            if (someCondition()) break;
            process();
        }

    }

    // return - exit method
    void greet(String name) {
        if (name == null) return;
        System.out.println("Hello, " + name);
    }
}
```