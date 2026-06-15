# Strings Problems & Algorithms

A collection of standard string operations, pattern checks, and utility scripts in Java.

All source implementations are located under this directory.

## List of String Programs

- **[Reverse a String](reverse_a_string.java)**: Reverses the characters of a given string using a loop.
- **[Palindrome Check](Palindrome_check.java)**: Checks whether a given string reads the same forwards and backwards.
- **[Vowel Count](Vowel_count.java)**: Counts the number of vowels (`a, e, i, o, u`) in a string (case-insensitive).
- **[Words Count](words_count.java)**: Counts the total number of words in a given string, handling multiple spaces.

---

## 📘 Learning Strings in DSA

A String is a sequence of characters. In Java, strings are **immutable** — once created, their value cannot be changed. Java provides the `String`, `StringBuilder`, and `StringBuffer` classes for string manipulation.

### 1. Time & Space Complexity of String Operations

| Operation | Time Complexity | Notes |
| :--- | :--- | :--- |
| **Access (charAt)** | $O(1)$ | Direct index access. |
| **Length** | $O(1)$ | Stored internally. |
| **Concatenation (+)** | $O(n)$ | Creates a new string object each time. |
| **Reverse** | $O(n)$ | Must iterate through all characters. |
| **Search (contains/indexOf)** | $O(n \cdot m)$ | `n` = string length, `m` = pattern length. |
| **StringBuilder append** | $O(1)$ amortized | Preferred for building strings in loops. |
| **Space Complexity** | $O(n)$ | Linear in the length of the string. |

---

### 2. Core Concepts & Techniques

#### 🔄 Two-Pointer Technique
Used to solve string problems efficiently in $O(n)$ time and $O(1)$ space.
- *Example applications*: Palindrome check (compare characters from both ends), reversing a string in-place.

#### 🪟 Sliding Window
Used to scan a substring of a given size across the string.
- *Example applications*: Longest substring without repeating characters, anagram detection.

#### 🔤 StringBuilder vs String
- **String**: Immutable. Every modification creates a new object — avoid using `+` in loops.
- **StringBuilder**: Mutable and efficient. Use for building or modifying strings in loops.

#### 📊 Character Frequency (Hashing)
Using an integer array or `HashMap` of size 26 to count character occurrences.
- *Example applications*: Anagram check, vowel/consonant count, first non-repeating character.

---

### 3. Recommended Practice Roadmap

1. **Basic String Operations**
   - [Reverse a String](reverse_a_string.java)
   - [Words Count](words_count.java)
2. **Pattern Checks**
   - [Palindrome Check](Palindrome_check.java)
   - [Vowel Count](Vowel_count.java)
3. **Intermediate Techniques**
   - Anagram Check *(coming soon)*
   - Longest Common Prefix *(coming soon)*
   - First Non-Repeating Character *(coming soon)*
