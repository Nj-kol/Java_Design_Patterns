# Factory

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

Also known as: Virtual Constructor

The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method. Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method. Objects returned by a factory method are often referred to as products. 

The factory method could be used as a static method if we are willing to give up subclassing it

The factory design pattern is used when we have a superclass with multiple subclasses and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.


## Components

* **Product** declares the interface, which is common to all objects that can be produced by the creator and its subclasses.
* **Concrete** Products are different implementations of the product interface.
* **Creator** class declares the factory method that returns new product objects. It’s important that the return type of this method matches the product interface.You can declare the factory method as abstract to force all subclasses to implement their own versions of the method. As an alternative, the base factory method can return some default product type. Note, despite its name, product creation is not the primary responsibility of the creator. Usually, the creator class already has some core business logic related to products. The factory method helps to decouple this logic from the concrete product classes. Here is an analogy: a large software development company can have a training department for programmers. However, the primary function of the company as a whole is still writing code, not producing programmers.
* **Concrete Creators** override the base factory method so it returns a different type of product. Note that the factory method doesn’t have to create new instances all the time. It can also return existing objects from a cache, an object pool, or another source.

## Examples

The pattern is present in core Java libraries:

* java.util.Calendar#getInstance()
* java.util.ResourceBundle#getBundle()
* java.text.NumberFormat#getInstance()
* java.nio.charset.Charset#forName()
* java.util.EnumSet#of()

## Identification

Factory methods can be recognized by creation methods, which create objects from concrete classes, but return them as objects of abstract type or interface.

References
==========
https://refactoring.guru/design-patterns/factory-method

https://www.newthinktank.com/2012/09/factory-design-pattern-tutorial/
