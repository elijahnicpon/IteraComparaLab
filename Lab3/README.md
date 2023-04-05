# Hello! This lab was made for CS 1331 Exam 3 at the Georgia Institute of Technology
#### This lab was created, in its entirety, by Elijah Nicpon.

## Part 1: Remembering how interfaces work
- Interfaces are another way to achieve abstraction in Java and allow for multiple inheritance.
  - Think of it as a blueprint for a set of behaviors, or a certification with a list of requirements
  - Interfaces specify what a implementing class can do, not *how*.
  - The Interface and Class should still follow a "Is-A" relationship
- Interfaces Vs. Abstract Classes
  - Interfaces do not have constructors, abstract classes do (whether its the null implicit constructor or explicitly declared constructor)
  - Interfaces can only have abstract methods, abstract classes can have *both* concrete or abstract methods.
  - Concrete classes can implement multiple interfaces, classes can only extend one abstract class
  
## Part 2: Comparable vs Comparator
- A class implementing *Comparable* means that it is capable of comparing itself with another object.
  - 1 Required Method
    - `compareTo()` which returns a signed int.
- A class implementing *Comparator* is capable of comparing two other objects, even if the objects don't implement comparable themselves.
  - 1 Required Method
    - `compare()` which returns a signed int.
- Complete TODOs 1.1 through 1.11 in the `/Compara` folder.

## Part 3: Iterable vs Iterator
- A class implementing *Iterable* represents a series of objects that can be iterated over. 
  - 1 Required Method
    - `iterator()` which returns an Iterator.
- A class implementing *Iterator* is the object with iteration state.
  - 2 Required Methods
    - `hasNext()` which returns a boolean representing whether the iterator has an element following the current one
    - `next()` which returns the next object to be iterated over.

- Complete TODOs 2.x through 2.x in the `/Itera` folder.