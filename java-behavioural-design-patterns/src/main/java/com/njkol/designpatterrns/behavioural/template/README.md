# Template ( Behavioural Design pattern )

## Description

* The Template pattern consists of certain steps whose order is fixed and for some of the methods,
  implementation differs from base class to subclass.
* It has an AbstractClass which contains the **templateMethod()**, which should be made final so that it cannot be overridden.   
* This template method makes use of other operations available in order to run the algorithm, but is decoupled for the actual implementation of these methods. All operations used by this template method are made abstract, so their implementation is deferred to subclasses.
* Template method should be final & it should have method calls ( steps ) in a fixed pre-determined order
* The ConcreteClass implements all the operations required by the templateMethod that were defined as abstract in the parent class. There can be many different ConcreteClasses. 
* The Template Method pattern makes use of the Hollywood Principle: Don't call us, we'll call you. The template method in the parent class controls the overall process, "calling" subclass methods when necessary.
* The Hollywood principle avoids low level components depending on high level components, and instead give these low level classes (ConcreteClass) a way of hooking into the parent class (AbstractClass). 
* Methods in base class with default implementation are referred as *Hooks* and they are intended to be overridden by subclasses,
* If you want some of the methods to be not overridden, you can make them final
* When broken down, there are **four different types of methods** used in the parent class: 
  * **Concrete methods** : Standard complete methods that are useful to the subclasses. These methods are usually utility methods
  * **Abstract methods** : Methods containing no implementation that must be implemented in subclasses
  * **Hook methods**     : Methods containing a default implementation that may be overidden in some classes.Hook methods are intended to be overridden, concrete methods are not
  * **Template methods** : A method that calls any of the methods listed above in order to describe the algorithm without needing to implement the details
  

The components of this design pattern are :

1. **AbstractTemplate** - Contains the templateMethod(), and the abstract methods ( & optional Hook methods )
2. **ConcretTemplate**  - The actual implementations of template containing the Concrete methods
 
## When Would I Use This Pattern?

The Template Method pattern is used when :

* When behaviour of an algorithm can vary, you let subclasses implement the behaviour through overriding
* You want to avoid code duplication, implementing variations of the algorithm in subclasses
* You want to control the point that subclassing is allowed

## Examples

* All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer
* All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap
* javax.servlet.http.HttpServlet, all the doXXX() methods by default sends a HTTP 405 "Method Not Allowed" error to the response. 
  You're free to implement none or any of them.
* A generic ETL method, with a method doETL() making calls to extract, transform & load in sequence.

References
===========
https://refactoring.guru/design-patterns/template-method

https://www.journaldev.com/1763/template-method-design-pattern-in-java

https://www.newthinktank.com/2012/10/template-method-design-pattern-tutorial/
