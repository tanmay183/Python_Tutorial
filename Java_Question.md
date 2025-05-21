
---

## ✅ **Problem Statement**

Create a program to manage student records with the following requirements:

### ➤ Student Class:

* Attributes:

  * `id` (int)
  * `name` (String)
  * `marks` (int)
  * `age` (int)
* Implement:

  * A **parameterized constructor**
  * **Getters and setters** for all attributes

---

### ➤ Solution Class:

* Contains the `main` method.
* Read input for `n` students from the user.
* Implement two **static methods**:

---

### 🔹 `findStudentWithMaximumAge(Student[] students)`:

* Input: Array of `Student` objects
* Output: `Student` object with the **maximum age**
* Print: Student details (id, name, marks, age)

---

### 🔹 `searchStudentById(Student[] students, int id)`:

* Input: Array of `Student` objects and an `id`
* Output: Return the `Student` object matching the given `id`, or `null` if not found.
* Print:

  * If found: Print student details (id, name, marks, age)
  * Else: Print `"No Student found with mentioned attribute."`

---

## ✅ Sample Input

```
4
100
jisha
35
23
104
Uma
30
45
105
Eva 
36
21
102
Cissy
24
51
100
```

---

## ✅ Sample Output

```
id-102
name-Cissy
marks-24
age-51
id-100
name-jisha
marks-35
age-23
```

---

## ✅ Complete Java Code

```java
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int marks;
    private int age;

    // Parameterized constructor
    public Student(int id, String name, int marks, int age) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();  // Number of students

        Student[] students = new Student[n];

        // Input student data
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int marks = sc.nextInt(); sc.nextLine();
            int age = sc.nextInt(); sc.nextLine();

            students[i] = new Student(id, name, marks, age);
        }

        int searchId = sc.nextInt(); sc.nextLine();  // ID to search

        // Call method 1: Find student with max age
        Student oldest = findStudentWithMaximumAge(students);
        System.out.println("id-" + oldest.getId());
        System.out.println("name-" + oldest.getName());
        System.out.println("marks-" + oldest.getMarks());
        System.out.println("age-" + oldest.getAge());

        // Call method 2: Search by ID
        Student found = searchStudentById(students, searchId);
        if (found != null) {
            System.out.println("id-" + found.getId());
            System.out.println("name-" + found.getName());
            System.out.println("marks-" + found.getMarks());
            System.out.println("age-" + found.getAge());
        } else {
            System.out.println("No Student found with mentioned attribute.");
        }
    }

    // Method 1: Find student with maximum age
    public static Student findStudentWithMaximumAge(Student[] students) {
        Student maxAgeStudent = students[0];
        for (Student s : students) {
            if (s.getAge() > maxAgeStudent.getAge()) {
                maxAgeStudent = s;
            }
        }
        return maxAgeStudent;
    }

    // Method 2: Search student by ID
    public static Student searchStudentById(Student[] students, int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
```

---


