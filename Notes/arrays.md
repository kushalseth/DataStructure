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

# Operations on Array

## 1. Search

- Searching an element in an array is about returning the index of an array. If the element is not found, we returns -1.

_Example of Linear Search_

- We have to search the first index of the given index.
- Linear search is about searching the element in the given array. If the event is not found then we have to traverse the whole array.
- The worst case complexity of this is Big O(n). This happens when the element is not found in the array. as the result will be a linear expresssion always.

```
int search(int arr[], int length, int elementtosearch) {
    for(int i =0; i < length; i++) {
        if(arr[i] == elementtosearch) {
            return i;
        }
    }
    return -1;
}
```

- Above elements were not sorted. But what happens when the arrays are sorted.
- We can do a seach with Big O(log n) for sorted array.

## 2. Insert

- _Insertion in Fixed Size Arrays_
- We cannot insert in fixed fixed array if it is already full. So, we can insert an element at a position only when it has some empty space.
- When we insert, we returm the size of the updated array. If the size and capaity of the array is same, we will not increase the size of array and will directly returns the current size of array.
- Time complexity of Insert operation: worst case Big O(n)
- example:

```
function insertion(int arr[], int currentSizeOfArray, int elementtoinsert, int position, int capacity) {
    if(currentSizeOfArray == capacity)
        return currentSizeOfArray;

    int indexToInsertAt = position - 1; // as position starts from 1 and index starts from 0

    for(int i = currentSizeOfArray - 1; i >= indexToInsertAt; i++) {
        arr[i+1] = arr[i];
    }
    arr[indexToInsertAt] = elementtoinsert;
    return currentSizeOfArray + 1;
}
```

- _Insertion in Dynamic Size Arrays_
- Dynamic size array doubles it's size when they are full and releases their existing memory.
- This is the most costly step when you are using dynamic sized error. Need to be avoided in production environments.
- add operation in arraylist of java and c#.

## 3. Delete

- When we delete an array, we want to remove the elemenet from the array, reduce the cuurent size of array, but capacity remains same for array. Also, the elements should move one position ahead.

```
int deleteElement(int arr[], int sizeOfArray, int elementToDelete) {
    int i = 0;
    // searching element in array
    for(i = 0; i < sizeOfArray;i++) {
        if(arr[i] == elementToDelete) {
            break;
        }
    }
    // element is not present in array
    if(i == sizeOfArray) {
        return sizeOfArray;
    }
    for(int j = i; j < n - 1; j++) {
        arr[j] = arr[j+1];
    }
    retun (n -1);
}
```

## 4. Get and Update

- We can directly get or update the element in an array with Big O (1)

# Questions on Array

## 1. Check if the array is sorted or not
