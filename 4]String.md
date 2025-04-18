
---

## 🧵 **Python Strings**

A string is a **sequence of characters** enclosed in quotes.

### ✅ Declaring a string:
```python
name = "Python"
```

---

## ✂️ **Slicing Strings**

Used to access parts of a string using index positions.

```python
text = "Python Programming"
print(text[0])       # P
print(text[0:6])     # Python
print(text[:6])      # Python
print(text[7:])      # Programming
print(text[-1])      # g (last char)
print(text[::-1])    # Reverse the string
```

---

## 🧼 **Modify Strings**

Strings are immutable, but you can create modified versions.

```python
text = "  Hello Python  "
print(text.lower())       # hello python
print(text.upper())       # HELLO PYTHON
print(text.strip())       # removes spaces from both ends
print(text.replace("Python", "World"))  # Hello World
print(text.split())       # ['Hello', 'Python']
```

---

## ➕ **Concatenate Strings**

Join two or more strings.

```python
a = "Hello"
b = "World"
print(a + " " + b)   # Hello World
```

---

## 📦 **Format Strings**

Used to inject variables into strings.

### ✅ Using `format()`:
```python
name = "Alice"
age = 25
print("My name is {} and I'm {} years old.".format(name, age))
```

### ✅ Using f-strings (Python 3.6+):
```python
print(f"My name is {name} and I'm {age} years old.")
```

---

## 🔠 **Escape Characters**

Escape characters are used to include special characters in strings.

| Escape | Meaning             |
|--------|----------------------|
| `\n`   | New Line             |
| `\t`   | Tab                  |
| `\\`   | Backslash            |
| `\'`   | Single Quote         |
| `\"`   | Double Quote         |

```python
print("She said, \"Python is great!\"")
print("Line1\nLine2")
```

---

## 🧰 **String Methods**

Here are some common string methods:

| Method           | Description                       |
|------------------|-----------------------------------|
| `lower()`        | Converts to lowercase             |
| `upper()`        | Converts to uppercase             |
| `strip()`        | Removes whitespace                |
| `replace()`      | Replaces substring                |
| `split()`        | Splits string into a list         |
| `find()`         | Finds index of substring          |
| `count()`        | Counts occurrences                |
| `startswith()`   | Checks if starts with substring   |
| `endswith()`     | Checks if ends with substring     |
| `isalpha()`      | Checks if all chars are alphabets |
| `isdigit()`      | Checks if all chars are digits    |

---


## ✅ **Python Boolean**

Boolean represents **True or False** values.

```python
x = True
y = False
print(type(x))   # <class 'bool'>
```

### ✅ Boolean expressions:
```python
print(10 > 5)        # True
print(5 == 5)        # True
print(3 != 4)        # True
```

Used in `if`, `while`, `and`, `or`, etc.

---

## 🔧 **Python Operators**

### ✅ 1. **Arithmetic Operators**

| Operator | Description        | Example     |
|----------|--------------------|-------------|
| `+`      | Addition            | `a + b`     |
| `-`      | Subtraction         | `a - b`     |
| `*`      | Multiplication      | `a * b`     |
| `/`      | Division (float)    | `a / b`     |
| `//`     | Floor division      | `a // b`    |
| `%`      | Modulus             | `a % b`     |
| `**`     | Exponentiation      | `a ** b`    |

---

### ✅ 2. **Comparison Operators**

Used to compare values and return boolean.

| Operator | Meaning             |
|----------|----------------------|
| `==`     | Equal to             |
| `!=`     | Not equal to         |
| `>`      | Greater than         |
| `<`      | Less than            |
| `>=`     | Greater or equal     |
| `<=`     | Less or equal        |

---

### ✅ 3. **Logical Operators**

| Operator | Description                | Example           |
|----------|-----------------------------|-------------------|
| `and`    | True if both are true       | `x > 5 and y < 10`|
| `or`     | True if at least one is true| `x > 5 or y < 3`  |
| `not`    | Inverts the result          | `not(x > 5)`      |

---

### ✅ 4. **Assignment Operators**

Used to assign and modify values.

| Operator | Example     | Same As     |
|----------|-------------|-------------|
| `=`      | `x = 5`     | Assign 5    |
| `+=`     | `x += 2`    | `x = x + 2` |
| `-=`     | `x -= 2`    | `x = x - 2` |
| `*=`     | `x *= 2`    | `x = x * 2` |
| `/=`     | `x /= 2`    | `x = x / 2` |

---

### ✅ 5. **Membership Operators**

Used to test membership in sequences like strings, lists, etc.

| Operator | Description                |
|----------|-----------------------------|
| `in`     | Returns True if present     |
| `not in` | Returns True if not present |

```python
text = "Python"
print("P" in text)       # True
print("z" not in text)   # True
```

---

## 🧠 Final Tips:

- Use `type()` to check data types.
- Use string methods for clean data handling.
- Use boolean logic in `if` conditions and loops.
- Combine slicing and string methods to manipulate text efficiently.

---



### ✅ **`string_exercises`**

```python
# String Exercises in Python

import string

print("========== 1. Reverse a String ==========")
s = "Python"
reversed_s = s[::-1]
print(f"Original: {s}")
print(f"Reversed: {reversed_s}")

print("\n========== 2. Count Vowels in a String ==========")
text = "Hello World"
vowels = "aeiouAEIOU"
vowel_count = sum(1 for char in text if char in vowels)
print(f"Text: {text}")
print(f"Vowel Count: {vowel_count}")

print("\n========== 3. Check if a String is a Palindrome ==========")
s = "madam"
is_palindrome = s == s[::-1]
print(f"String: {s}")
print("Palindrome" if is_palindrome else "Not a Palindrome")

print("\n========== 4. Find the First Non-Repeating Character ==========")
s = "aabbccdef"
found = False
for char in s:
    if s.count(char) == 1:
        print(f"First non-repeating character: {char}")
        found = True
        break
if not found:
    print("No non-repeating character found.")

print("\n========== 5. Replace Spaces with Hyphens ==========")
sentence = "Python is fun and easy"
modified = sentence.replace(" ", "-")
print(f"Original: {sentence}")
print(f"Modified: {modified}")

print("\n========== 6. Remove Punctuation from a String ==========")
sentence = "Hello, world! Python is awesome :)"
cleaned = ''.join(char for char in sentence if char not in string.punctuation)
print(f"Original: {sentence}")
print(f"Cleaned: {cleaned}")
```

---

### ✅ **Sample Output When You Run the File**

```
========== 1. Reverse a String ==========
Original: Python
Reversed: nohtyP

========== 2. Count Vowels in a String ==========
Text: Hello World
Vowel Count: 3

========== 3. Check if a String is a Palindrome ==========
String: madam
Palindrome

========== 4. Find the First Non-Repeating Character ==========
First non-repeating character: d

========== 5. Replace Spaces with Hyphens ==========
Original: Python is fun and easy
Modified: Python-is-fun-and-easy

========== 6. Remove Punctuation from a String ==========
Original: Hello, world! Python is awesome :)
Cleaned: Hello world Python is awesome 
```

---
