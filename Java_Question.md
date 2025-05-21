✅ Problem Statement
You need to:

Create a class named Student with the following attributes:

id (int)

name (String)

marks (int)

age (int)

Also include:

Getters and setters for all attributes.

A parameterized constructor.

Create another class named Solution containing the main() method.

Inside Solution, implement two static methods:

findStudentWithMaximumAge(Student[] students):
Returns the Student object with the maximum age.

searchStudentById(Student[] students, int id):
Searches for the student with the given ID.
Returns the student if found; otherwise, returns null.

In the main() method:

Read input for 4 student objects.

Call findStudentWithMaximumAge and display the student details.

Call searchStudentById and display the student details, or print a message if not found.

✅ Sample Input
Copy
Edit
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
✅ Sample Output
css
Copy
Edit
id-102
name-Cissy
marks-24
age-51
id-100
name-jisha
marks-35
age-23
✅ Java Code
java
Copy
Edit
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

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();  // Number of students
        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int marks = sc.nextInt(); sc.nextLine();
            int age = sc.nextInt(); sc.nextLine();
            students[i] = new Student(id, name, marks, age);
        }

        // Read id to search
        int searchId = sc.nextInt(); sc.nextLine();

        // Find and print student with maximum age
        Student maxAgeStudent = findStudentWithMaximumAge(students);
        if (maxAgeStudent != null) {
            System.out.println("id-" + maxAgeStudent.getId());
            System.out.println("name-" + maxAgeStudent.getName());
            System.out.println("marks-" + maxAgeStudent.getMarks());
            System.out.println("age-" + maxAgeStudent.getAge());
        }

        // Search student by ID
        Student foundStudent = searchStudentById(students, searchId);
        if (foundStudent != null) {
            System.out.println("id-" + foundStudent.getId());
            System.out.println("name-" + foundStudent.getName());
            System.out.println("marks-" + foundStudent.getMarks());
            System.out.println("age-" + foundStudent.getAge());
        } else {
            System.out.println("No Student found with mentioned attribute.");
        }
    }

    // Method to find student with maximum age
    public static Student findStudentWithMaximumAge(Student[] students) {
        Student maxStudent = students[0];
        for (Student s : students) {
            if (s.getAge() > maxStudent.getAge()) {
                maxStudent = s;
            }
        }
        return maxStudent;
    }

    // Method to search student by id
    public static Student searchStudentById(Student[] students, int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
✅ Explanation
You define a Student class to store student details.

In main(), you create an array of students and read data using Scanner.

You call:

findStudentWithMaximumAge() to find the student with the highest age.

searchStudentById() to look up a student by ID.

Results are printed according to whether the student is found or not.
