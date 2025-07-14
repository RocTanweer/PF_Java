## 1️⃣ Basic Method – No Params, No Return

```java
public class Demo {
    public static void greet() {
        System.out.println("Hello, Roc!");
    }

    public static void main(String[] args) {
        greet(); // call method
    }
}
```

## 2️⃣ Method with Parameters

```java
public static void printSum(int a, int b) {
    System.out.println("Sum: " + (a + b));
}
```

## 3️⃣ Method with Return Type

```java
public static int square(int n) {
    return n * n;
}
```

## 4️⃣ Multiple Parameters & Return

```java
public static double divide(int a, int b) {
    if (b == 0) return -1; // handle division by zero
    return (double) a / b;
}
```

## 5️⃣ Method Overloading (Same name, different params)

```java
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a, double b) {
    return a + b;
}
```

## 6️⃣ Calling One Method from Another

```java
public static void outer() {
    System.out.println("Calling inner:");
    inner();
}

public static void inner() {
    System.out.println("Inside inner method.");
}
```

## 7️⃣ Returning Array from Method

```java
public static int[] createArray() {
    return new int[]{1, 2, 3};
}
```

## 8️⃣ Passing Array to Method

```java
public static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
```

## 9️⃣ Method in Non-static Context (Object-oriented)

```java
public class Person {
    String name;

    public void introduce() {
        System.out.println("Hi, I'm " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Roc";
        p.introduce();
    }
}
```

# Tips about Method

## ✅ 1. Memorize Method Syntax Cold

```java
public static returnType methodName(type param1, type param2) { }
```

Examples:

- `public static void print()`
- `public static int sum(int a, int b)`

This speeds up fluency and reduces bugs.

## ✅ 2. Master Parameter Passing

Java passes:

- **Primitive types** → by value
- **Objects/arrays** → by reference (technically object reference is passed by value)

So:

```java
modify(int x) → original x not changed
modify(int[] arr) → original arr is changed
```
Understand this difference very well. It matters in DSA.

## ✅ 3. Use Return Values Properly

Avoid doing everything with `void`. Practice:

- Returning `int`, `boolean`, `String`, `char[]`, etc.
- Using return values inside conditionals:

```java
if (isEven(10)) { ... }
```

## ✅ 4. Never Write Repetitive Code

If you're writing the **same logic** more than once — make it a method.

Examples:

- Swapping two elements in an array → `swap(arr, i, j)`
- Checking if number is prime → `isPrime(n)`

This builds **clean thinking** and reuse.

## ✅ 5. Don’t Avoid Overloading

Understand that method overloading allows the same method name with different parameter lists.

```java
sum(int a, int b);
sum(double a, double b);
```
Don’t fear it — it shows up in real-world code and system design.

## ✅ 6. Methods Are Your Weapon in DSA

In DSA, your main tools will be:

- `isValid()`, `canPartition()`, `helper()`, `dfs()`, `binarySearch()`, etc.

All of these are just **well-named methods with correct logic**.

Train yourself now to name, write, and call methods clearly.

## ✅ 7. Avoid Too Many Responsibilities

A method should do **one thing only**.

Bad:

```java
void processUserData() {
    read(); validate(); save(); email(); log();
}
```

Better:

```java
void processUserData() {
    readUser();
    validateUser();
    saveUser();
    sendEmail();
    logActivity();
}
```
Clear separation helps you write modular, testable DSA code later.

## ✅ 8. Use static While Learning

Until you move to OOP or projects, just keep everything static for simplicity.

```java
public static void main(String[] args) { ... }
```