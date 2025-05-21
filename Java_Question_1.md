Great! Here's another **sample question** that will help you practice using **array of objects** (`arr[i].getId()` style), **encapsulation**, and **custom search/sorting logic** in Java.

---

## ✅ Sample Question:

### **Find the Employee with Highest Salary in a Specific Department**

---

## ✅ **Problem Statement**

Create a program that maintains a list of employees and allows the user to find the employee with the **highest salary** in a **specified department**.

---

### ➤ **Employee Class**

Create a class `Employee` with the following attributes:

* `id` (int)
* `name` (String)
* `salary` (int)
* `department` (String)

Implement:

* **Parameterized constructor**
* **Getters and Setters** for all fields

---

### ➤ **Solution Class**

* Implement the `main` method.
* Read input for `n` employees.
* Read a department name.
* Find the employee in the given department who has the **highest salary**.
* If found, print the employee details as shown below.
* If no employee is found in the department, print:
  `"No Employee found in the given department."`

---

## ✅ Sample Input:

```
3
101
Alice
50000
HR
102
Bob
60000
IT
103
Charlie
55000
IT
IT
```

---

## ✅ Sample Output:

```
id-102
name-Bob
salary-60000
department-IT
```

---

## ✅ Java Solution:

```java
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int salary;
    private String department;

    // Constructor
    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();  // Number of employees
        Employee[] arr = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int salary = sc.nextInt(); sc.nextLine();
            String dept = sc.nextLine();

            arr[i] = new Employee(id, name, salary, dept);
        }

        // Department to search
        String searchDept = sc.nextLine();

        // Find employee with highest salary in department
        Employee top = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment().equalsIgnoreCase(searchDept)) {
                if (top == null || arr[i].getSalary() > top.getSalary()) {
                    top = arr[i];
                }
            }
        }

        // Print result
        if (top != null) {
            System.out.println("id-" + top.getId());
            System.out.println("name-" + top.getName());
            System.out.println("salary-" + top.getSalary());
            System.out.println("department-" + top.getDepartment());
        } else {
            System.out.println("No Employee found in the given department.");
        }
    }
}
```

---

## ✅ Concepts Practiced:

* Array of custom objects → `arr[i].getId()`, `arr[i].getDepartment()`
* Custom search/filter logic
* Encapsulation (private fields + public getters/setters)

---

Let me know if you want one more question on **sorting**, **filtering**, or **object comparison** with array of objects!
