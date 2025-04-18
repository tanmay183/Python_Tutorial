
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


---
