
---

## 🧾 1. Python Input

Used to take **user input**.

### ✅ Syntax:
```python
input("Message to show user")
```

### ✅ Example:
```python
name = input("Enter your name: ")
print("Hello", name)
```

💡 `input()` **always returns a string** type by default.

To take numeric input:
```python
age = int(input("Enter your age: "))  # Convert string to int
```

---

## 📤 2. Python Output

Used to **display data**.

### ✅ Syntax:
```python
print(value1, value2, ...)
```

### ✅ Example:
```python
print("Hello", "World")
```

🔧 Optional parameters:
```python
print("Python", "is", "fun", sep="-", end="!!!\n")
```

🟢 Output:
```
Python-is-fun!!!
```

---

## 🧱 3. Python Data Types

Here are the **main built-in data types** in Python:

| Data Type     | Example              | Description                       | Size (approximate) |
|---------------|----------------------|-----------------------------------|---------------------|
| `int`         | `10`, `-100`         | Integer numbers                   | Unlimited precision |
| `float`       | `3.14`, `-0.001`     | Decimal numbers (floating point)  | 24 bytes            |
| `complex`     | `3+4j`               | Complex numbers                   | 32 bytes            |
| `bool`        | `True`, `False`      | Boolean (0 or 1)                  | 24 bytes            |
| `str`         | `"Hello"`            | Text                              | 49 + 1 byte/char    |
| `list`        | `[1, 2, 3]`          | Ordered, mutable sequence         | Depends on content  |
| `tuple`       | `(1, 2)`             | Ordered, immutable sequence       | Less than list      |
| `set`         | `{1, 2, 3}`          | Unordered, no duplicates          | Depends on size     |
| `dict`        | `{"a": 1}`           | Key-value pairs                   | Depends on keys/vals |

📌 You can check data type using `type()`:
```python
print(type(10))         # <class 'int'>
print(type("Python"))   # <class 'str'>
```

🔍 Get memory size:
```python
import sys
print(sys.getsizeof(100))       # Size in bytes
```

---

## 🔢 4. Python Numbers

Python supports three numeric types:

### ✅ `int`:
- Whole numbers
- No size limit (arbitrary precision)
```python
a = 100
```

### ✅ `float`:
- Decimal numbers
- Follows IEEE 754 format (like double in C)
```python
pi = 3.14159
```

### ✅ `complex`:
- Real and imaginary parts
```python
z = 2 + 3j
print(z.real)  # 2.0
print(z.imag)  # 3.0
```

---

## 🔁 5. Type Casting in Python

**Type Casting** is converting one data type to another.

### ✅ Implicit Casting (automatic):
```python
x = 10
y = 2.5
z = x + y  # int + float → float
print(z)   # 12.5
```

### ✅ Explicit Casting (manual):

| To Type    | Function        | Example                 |
|------------|------------------|-------------------------|
| Integer    | `int()`          | `int("5") → 5`          |
| Float      | `float()`        | `float("3.14") → 3.14`  |
| String     | `str()`          | `str(123) → "123"`      |
| List       | `list()`         | `list("abc") → ['a','b','c']` |
| Tuple      | `tuple()`        | `tuple([1,2]) → (1,2)`  |
| Set        | `set()`          | `set([1,2,2]) → {1,2}`  |

### ✅ Example:
```python
age = "25"
age_num = int(age)
print(age_num + 5)  # 30
```

---

