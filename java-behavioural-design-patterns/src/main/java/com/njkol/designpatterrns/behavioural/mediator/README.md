# Mediator ( Behavioural Design pattern )

## Description

* Mediator design pattern is very helpful in an enterprise application where multiple objects are interacting with each other.
* If the objects interact with each other directly, the system components are tightly-coupled with each other that makes higher maintainability cost and not hard to extend.
* Mediator pattern focuses on provide a mediator between objects for communication and help in implementing lose-coupling between objects.
* The Mediator ( actually ConcreteMediator ) contains a list of Colleagues
* Colleague has a reference to the mediator object, it’s required for the communication between different colleagues.

## Components

* The components of this design pattern are :
   i. **Colleague**          - Objects that communicate with each other. A Colleague has a Mediator
  ii. **ConcreteColleague**  - Concrete implementation of a Colleague
 iii. **Mediator**           - Defines the interface for communication between *Colleague* objects. 
 iv.  **ConcreteMediator**  - Implements the Mediator interface and coordinates communication between Colleague objects.
 
## When Would I Use This Pattern?

* The mediator is a good choice of pattern when the communication between objects is complicated, but well defined
* When there are too many relationships between the objects in your code, it's time to think of having such a central point of control
* An observer based variation of the mediator pattern is used in Java Message Service (JMS) implementations, which allows applications to subscribe and publish data to other applications. This is a common combination of patterns that makes sense.
* We should not use mediator pattern just to achieve lo0se-coupling because if the number of mediators will grow, then it will become hard to maintain them.

## Examples
* java.util.Timer class scheduleXXX() methods
* Java Concurrency Executor execute() method
* java.lang.reflect.Method invoke() method
* JMS


## References
https://dzone.com/articles/design-patterns-mediator
https://www.journaldev.com/1730/mediator-design-pattern-java
