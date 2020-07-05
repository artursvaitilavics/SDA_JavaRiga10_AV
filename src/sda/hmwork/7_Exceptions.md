# Exceptions Task 1. 

For this task use only exceptions for all error handling.
 
1. Create class pocket.
1. In constructor accept parameters:
    1. Initial amount - the amount how much money there is at the start
    1. Maximal amount - the amount how much it is possible to store in a pocket.
    1. Note - we cannot have less than 0 in a pocket.
1. Set current amount to initial amount.
1. When creating an object (in constructor) verify that:
    1. Initial amount is less than maximal amount and greater or equal to 0
    1. Maximal amount is greater or equal to zero.
    1. Throw an exception in case of an error
1. Write method `add` with a parameter `amount` - how much to add.
    1. This method attempts to put money into a pocket. 
    1. If after adding current amount exceeds maximal amount - take only as much as allowed (until max amount), and throw an exception with overhead.
    1. For example if `current = 1`, `max = 3` and trying to add `5` then set current to `3` and throw exception with `3` 
   `5 - (3 - 1) = 3` 
1. Write method `get` with a parameter - how much required.
    1. If there is not enough money - throw an exception with information how much money present in a pocket
    1. If there is enough money - decrease the `current` amount.


Write a program that uses this Pocket.
1. Ask user to provide all the values when creating a pocket.
1. Allow user to decide what to do - get or add money from/to pocket and the amount.
1. Ensure all exceptions are handled and appropriate messages are printed.
1. Use `Scanner` to interact with user.    

 