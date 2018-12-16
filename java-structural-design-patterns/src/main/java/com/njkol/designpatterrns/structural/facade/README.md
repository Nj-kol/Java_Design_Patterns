# Facade ( Structural Design pattern )

## Description

* Provide a unified interface to a set of interfaces in a subsystem. Façade defines a higher-level interface that makes the subsystem easier to use.
* Facade can be used to hide the inner workings of a third party library, or some legacy code. 
* All that the client needs to do is interact with the Facade, and not the subsystem that it is encompassing.

## Components

* The components of this design pattern are :
   i. **Facade**          - The Facade hiding subsystems
  ii. **Subsystem**       - The sub systems
 iii. **Client**          - Client using the Facade
 
## When Would I Use This Pattern?

* As the concept behind facade is to simplify an interface, service oriented architectures make use of the facade pattern.
  For example, in web services, one web service might provide access to a number of smaller services that have been hidden from the caller by the facade
  
## Examples
* Tika class in Apache Tika

## References
https://dzone.com/articles/design-patterns-uncovered-1
https://www.journaldev.com/1557/facade-design-pattern-in-java
