Let's discuss arrays in part-3. We will quickly read or skip the theory and will solve some Array competitive problems. I will share few competitive problems here but you can check more at my GitHub repository. https://github.com/kushalseth/DataStructure

# Array

- Array is one of the data structure that stores multiple items of same data type at contiguous(next or together in sequence) memory locations.

> **#important** This means we can access the element using the index of the array. The advantage of accessing using index and contiguous memory location is the complexity to get the ith index is Big O(1). Means they find the ith element in constant time. Big O(1), because you can easily get the address of any item using x + iy, where x is the initial memory state, and y is the memory of each item.

- Array provides Cache friendlyness, Cache is the memory closed to CPU, then RAM or any other harddisk memory.

> **#important** Due to contiguous memory location, It's more likely that the CPU caches all the contiguous items of Array.

# Memory Allocation

- Fixed Sized Arrays
  In C# or Java, the arrays have Heap allocated memories. while in C/C++, we can have both heap/stack allocated memories.

```
Java
int[] array1 = new int[5];
int[] array1 = new int[n];
int[] array1 = {10, 20, 30, 40};

C#
int[] array1 = new int[5];
int[] array1 = new int[] { 1, 3, 5, 7, 9 };
```

- Dynamic Sized Arrays
  In dynamic sized array, we can insert as many elements as we want. Whenever the capacity is exhausted for an array and we try to insert something the size of array automatically increases.

Example of dynamic sized arrayes:

```
C++ -> vectors
Java and C# -> ArrayList
Python -> List
```
