# Composite Design Pattern

* Used to represent part whole hierarchies
* Used to represent tree structures
* Composite pattern should be applied only when the group of objects should behave as the single object.

## Components

* The components of this design pattern are :

1. Component (usually an interface)
2. Leaf           
  - Defines the behaviour for the elements in the composition.
  - It is the building block for the composition and implements base component. 
  - It doesn't have references to other Components
3. Composite - It consists of leaf elements and implements the operations in base component

References
==========

https://refactoring.guru/design-patterns/composite
