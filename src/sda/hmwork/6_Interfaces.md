# Interfaces Task 1 - Queue

A queue is an abstract data type for adding and removing elements. The first element added to a queue ist the first element that is removed (first-in-first-out, FIFO). Queues can be used, for instance, to manage processes of an operating system: the first process added to the waiting queue is reactivated prior to all other processes (with the same priority).

Design an interface Queue, with methods to add and remove elements (integers). Furthermore, a methode to check whether the queue is empty or not should exist.

Implement the queue with an array. If the array becomes to small to hold all added elements, create a new larger (double the size of instance) array and copy all elements of the small array to the new one.

Thoroughly test your implementation with small and large queues.

# Interfaces Task 2

1. Create class Person with some field
2. Make class Person implement `Comparable` interface
3. Use `Arrays.sort(personArray)` to sort array.
4. See how order will change depending on implementation of the Persons comparison.

# Interfaces Task 3

Write a class that implements the CharSequence interface found in the java.lang package. Your implementation should return the string backwards.