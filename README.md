# Median of Two Sorted Arrays

## Problem Statement

Given two sorted arrays `nums1` and `nums2` of sizes `m` and `n`, return the **median** of the two sorted arrays.

The median is defined as:
- The **middle value** if the combined length is **odd**
- The **average of the two middle values** if the combined length is **even**

---

## Evaluation Criteria

The solution is evaluated based on the following:

1. **Maintainability**  
   - Clean and readable code  
   - Low complexity and easy to understand logic

2. **Performance**  
   - Time complexity analysis using **Big O notation**

3. **Testing Principles**  
   - Correct handling of edge cases  
   - Valid outputs for all test scenarios

---

## Test Cases

| nums1              | nums2              | Expected Output |
|--------------------|--------------------|-----------------|
| `[1, 3]`           | `[2]`              | `2.0`           |
| `[1, 2]`           | `[3, 4]`            | `2.5`           |
| `[0, 0]`           | `[0, 0]`            | `0.0`           |
| `[]`               | `[1]`              | `1.0`           |
| `[1,2,3,4,5]`      | `[6,7,8,9,10]`      | `5.5`           |
| `[1,3,5]`          | `[2,4,6,8]`         | `4.0`           |

---

## Approach

1. **Merge the Two Sorted Arrays**
   - Use two pointers to traverse both arrays
   - Compare elements and insert the smaller one into a new merged array
   - Continue until all elements from both arrays are merged

2. **Find the Median**
   - If the merged array length is **odd**, return the middle element
   - If the merged array length is **even**, return the average of the two middle elements

---

## Complexity Analysis

- **Time Complexity:**  
  `O(m + n)` — each element from both arrays is visited once

- **Space Complexity:**  
  `O(m + n)` — extra space used for the merged array
