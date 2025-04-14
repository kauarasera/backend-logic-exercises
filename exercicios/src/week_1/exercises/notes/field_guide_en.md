# 🧭 Field Guide: Backend Java Journey

> This guide documents my progress, technical learnings, and common mistakes during my journey as a backend developer.  
> It serves as my own living learning documentation, with a focus on Java and programming logic, especially during practical exercises.

---

## 📌 Frequent Challenges and What I Learned from Them

### ☕ Scanner and Input Handling
- I forgot to use `nextLine()` after `nextInt()` and `nextDouble()`, which caused incorrect reading.
- **Solution:** Insert `scanner.nextLine();` after numeric input when reading a `String` next.

### 🧮 Variable Declarations and Types
- I confused `float` with `double` — on Beecrowd, always use `double` for precision.
- Use `int` for integers and `double` for decimal values.

### 🔁 Return in `void` Methods
- I used `return` with a value in `void` methods, which caused compilation errors.
- **Fix:** In `void` methods, use only `return;` or nothing — never `return value;`.

---

## 💡 Output Formatting on Beecrowd

- Whenever using `System.out.printf()`, **always end with `%n`**.
- Correct example:

```java
System.out.printf("TOTAL = R$ %.2f%n", salary);
```

## 📌 Quick Reference — `printf()` Formatting in Java

| Code   | Description                         | Example Output       |
|--------|-------------------------------------|-----------------------|
| `%s`   | String (text)                       | `"Name: Ana"`         |
| `%d`   | Integer number (`int`)              | `"Age: 25"`           |
| `%.2f` | Decimal number with 2 digits        | `"Salary: 2500.75"`   |
| `%.5f` | Decimal number with 5 digits        | `"6.43182"`           |
| `%n`   | Line break (like `\n`)              | Starts a new line     |

---

### 🧪 Combined Example

```java
String name = "Lucas";
int age = 30;
double salary = 2480.50;

System.out.printf("Name: %s | Age: %d | Salary: $ %.2f%n", name, age, salary);
```

## 🧠 Reflection
> This week was a moment of clarity. I realized that my main difficulty isn’t the logic itself, but rather paying attention to the details in the problem statements.
With that in mind, I started changing the way I read and approach the exercises.
I'm developing a more mature perspective as a programmer, and that keeps me motivated to keep improving step by step.
I'm not just learning Java — I'm learning how to think like a developer: with clarity, patience, and attention to the small details hidden within each problem.