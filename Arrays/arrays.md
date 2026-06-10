# Arrays Problems & Algorithms

A collection of standard array operations, search algorithms, and math-related array utility scripts in Java.

All source implementations are located under this directory.

## List of Array Programs

- **[Binary Search](Binary_search.java)**: Classic binary search implementation on a sorted array.
- **[Linear Search](linear_search.java)**: Simple linear search to find the index of a target element in an array.
- **[Sum of Elements](sumofelements.java)**: Calculates the sum of all elements in an array.
- **[Max of Element](maxofelement.java)**: Finds the maximum element in an array.
- **[Min of Elements](minofelements.java)**: Finds the minimum element in an array.
- **[Second Max Element](second_max_element.java)**: Finds the second largest element in an array.
- **[Reverse Array Elements](reverse_a_number.java)**: Prints the elements of an array in reverse order.
- **[Adding K to Elements](adding_k_element.java)**: Adds a constant value `k` to each element in an array and prints the result.
- **[Even & Odd Elements](even_odd_elements.java)**: Traverses the array to separate and print even and odd elements.

---

## 📘 Learning Arrays in DSA

An array is a linear data structure that collects elements of the same type at contiguous memory locations. It is the most fundamental data structure to learn before diving into more complex ones.

### 1. Time & Space Complexity of Array Operations

| Operation | Time Complexity | Notes |
| :--- | :--- | :--- |
| **Access** | $O(1)$ | Accessing element by index is instantaneous. |
| **Search (Linear)** | $O(n)$ | Scanning elements one by one. |
| **Search (Binary)** | $O(\log n)$ | Requires the array to be **sorted**. |
| **Insertion** | $O(n)$ | Shifting elements if inserted at the beginning or middle. |
| **Deletion** | $O(n)$ | Shifting elements to fill the vacant index. |
| **Space Complexity** | $O(n)$ | Linear memory allocated based on size. |

---

### 2. Core Concepts & Techniques

#### 🔍 Searching Algorithms
- **Linear Search**: Checks every element sequentially from the start to the end. Best used for unsorted arrays or small datasets.
- **Binary Search**: A Divide and Conquer algorithm. It finds the position of a target value within a sorted array by repeatedly dividing the search interval in half.

#### 🔄 Two-Pointer Technique
Used to solve array problems efficiently in $O(n)$ time and $O(1)$ space.
- *Example applications*: Reversing an array (swapping start and end pointers), finding pairs that sum to a target value in a sorted array.

#### 🪟 Sliding Window
Used to perform operations on a specific window (subarray) of a given size.
- *Example applications*: Finding the maximum sum of $k$ consecutive elements, longest substring without repeating characters.

#### 📈 Kadane's Algorithm
An iterative dynamic programming algorithm used to find the maximum subarray sum in $O(n)$ time.

---

### 3. Recommended Practice Roadmap

1. **Basic Traversal & Operations**
   - [Sum of Elements](sumofelements.java)
   - [Min of Elements](minofelements.java) / [Max of Element](maxofelement.java)
   - [Even & Odd Elements](even_odd_elements.java)
2. **Intermediate Operations**
   - [Reverse Array Elements](reverse_a_number.java)
   - [Second Max Element](second_max_element.java)
3. **Search Algorithms**
   - [Linear Search](linear_search.java)
   - [Binary Search](Binary_search.java) (Requires sorted array)
