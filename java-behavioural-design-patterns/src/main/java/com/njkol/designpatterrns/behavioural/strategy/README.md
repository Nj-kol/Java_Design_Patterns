# Strategy ( Behavioural Design pattern )

## Description

* Strategy pattern is also known as ***Policy Pattern***
* The Strategy pattern provides a way to define a family of algorithms, encapsulate each one as an object, and make them interchangeable

## Components

* The components of this design pattern are :
   i. Context         - The context could be anything that would require changing behaviours. Context is composed of a Strategy. 
  ii. Strategy        - The Strategy is simply implemented as an interface
 iii. ConcreteStrategy - The actual implementation
 iv. Client -  creates a specific strategy object and passes it to the context
 
## Examples
* Ex - Collections.sort() and Arrays.sort() method that take comparator as argument.
* Choosing a compression, expression algorithm class

References
==========
https://refactoring.guru/design-patterns/strategy