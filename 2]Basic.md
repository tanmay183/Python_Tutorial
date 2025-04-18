
---

### 🌟 1. Python Syntax

**Python syntax** refers to the set of rules that define how Python code is written and interpreted.

#### ✅ Basic Rules:
- Python uses **indentation (whitespace)** to define blocks of code (not curly braces like in C, Java).
- A **colon `:`** is used after statements that begin a block (like `if`, `for`, `while`, `def`, etc.).
- Python statements end with a **newline**, not a semicolon `;` (though `;` is allowed, it’s not common).

#### ✅ Example:
```python
if 5 > 2:
    print("5 is greater than 2")
```

#### 🔑 Key Points:
- Indentation is **mandatory** and usually 4 spaces.
- Python is **case-sensitive** (`Variable` and `variable` are different).
- Comments improve readability and are ignored by the interpreter.

---

### 📝 2. Python Comments

**Comments** are used to explain code and are ignored during execution.

#### ✅ Types of Comments:
1. **Single-line comment**: Begins with `#`
   ```python
   # This is a single-line comment
   print("Hello")  # Comment at end of line
   ```
2. **Multi-line comment**: Usually written using triple quotes (`'''` or `"""`)
   ```python
   '''
   This is a 
   multi-line comment
   '''
   print("Hello")
   ```

#### 🔑 Key Points:
- Always use comments to explain complex logic.
- Single-line comments are more commonly used.
- Multi-line comments are not truly comments — Python treats them as string literals unless assigned or used.

---

### 📦 3. Python Variables

**Variables** are used to store data values.

#### ✅ Syntax:
```python
x = 10
name = "Alice"
```

#### ✅ Rules for Naming:
- Must begin with a **letter (a–z, A–Z)** or **underscore `_`**
- Can have **letters, digits, underscores**
- Cannot start with a **digit**
- Are **case-sensitive**

#### ✅ Examples:
```python
my_name = "John"
age = 25
_is_valid = True
```

#### 🔑 Key Points:
- No need to declare the data type (`int`, `str`, etc.) — Python is **dynamically typed**.
- You can change the type of a variable at any time:
  ```python
  x = 5       # integer
  x = "five"  # now it's a string
  ```
- Use descriptive names for readability (`num_students`, not `ns`).

---


## 🧾 1. Output Variables in Python

**Output variables** refer to the variables whose values we want to display to the user or return from a function. These are not special variables — just regular variables used to **show results** using functions like `print()` or `return`.

### ✅ Example 1: Using `print()` to show output
```python
name = "Alice"
print("Hello", name)
```

🟢 **Output:**
```
Hello Alice
```

### ✅ Example 2: Returning from a function
```python
def add(a, b):
    result = a + b
    return result

output = add(5, 3)
print("The sum is:", output)
```

🟢 **Output:**
```
The sum is: 8
```

### 🔑 Key Points:
- `print()` displays data on the screen.
- `return` sends the value back from a function to where it was called.
- Output variables are helpful for **debugging**, **displaying results**, or **returning function values**.

---

## 🌍 2. Global Variables in Python

**Global variables** are variables declared **outside of any function**. They can be accessed by **any function** in the same file or module.

### ✅ Example:
```python
x = 10  # Global variable

def show():
    print("Value of x:", x)

show()
```

🟢 **Output:**
```
Value of x: 10
```

### 🔄 Modifying Global Variables Inside Functions

To **modify** a global variable inside a function, use the `global` keyword.

### ✅ Example:
```python
count = 0

def increase():
    global count  # tell Python we want to use the global 'count'
    count += 1

increase()
print("Count is:", count)
```

🟢 **Output:**
```
Count is: 1
```

### 🔴 Without `global` keyword:
```python
count = 0

def increase():
    count += 1  # Error: UnboundLocalError

increase()
```

❌ This will throw:
```
UnboundLocalError: local variable 'count' referenced before assignment
```

### 🔑 Key Points:
- Global variables are created **outside** of all functions.
- They can be **read** inside any function.
- To **modify** them inside a function, you **must use `global` keyword**.
- Use global variables **carefully** — too many of them make code hard to manage.

---

