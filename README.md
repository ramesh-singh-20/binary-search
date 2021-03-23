# binary-search

This project implements binary search. 

**Algorithm**

Given a sorted array
1. Find the middle of the array.
2. If element at the middle is equal to element to be searched, return middle.
3. If element at the middle is less than element to be searched, discard the first section of the array and start the process by starting at middle+1 index.
4. If element at the middle is greater than element to be searched, discard the second section of the array and start the process by skrinking the array to be till at middle-1 index.
5. Repeat this process till only 1 element is left in the array.
6. if element is not found in the array return -1.

**Time Complexity**: O(log n)

**Testing**

For testing Spock and groovy framework is used.
