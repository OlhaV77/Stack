# Stack		

You will implement a simple stack!		

Stack is a collection of elements, with two main principal operations: 		
* Push, which adds an element to the collection, and		
* Pop, which removes the most recently added element that was not yet removed.		

Our stack will have a maximum size of 5 (integers) and must be LIFO (last in, first out).		

Starting points:		
- Create class stack		
- Implement push 		
- Implement pop		

Bonus points:		
- When stack is full and push new data - display "can't add anymore"		
- When stack is empty and pop the data - display "there is nothing on the stack"

## Exception task:

- Create: new (your own) checked exception 
- Add: checked exception when trying to pop empty stack

- Create: new (your own) checked exception
- Add: check exception when trying to push when stack is full

## Stack creation task:

- Add: ability to create a stack with arbitrary size
  - Make sure default stack initialization defaults to stack length of size 5
    
## Stack length management task:

- Add: ability to increase stack length by size of 5 via method call `increase()`
- Add: ability to decrease stack length by szie of 5 via method call `decrease()`

Note: above operations are NON-destructive!