# Visitor Design Pattern

Visitor is a behavioral design pattern that allows you to add methods to classes of different types without much altering to those classes. You can make completely different methods depending on the class used with this pattern.

The Visitor pattern suggests that you place the new behavior into a separate class called ***visitor***, instead of trying to integrate it into existing classes. The original object that had to perform the behavior is now passed to one of the visitor’s methods as an argument, providing the method access to all necessary data contained within the object.

It uses a technique called ***Double Dispatch***, which helps to execute the proper method on an object without cumbersome conditionals. Instead of letting the client select a proper version of the method to call, how about we delegate this choice to objects we’re passing to the visitor as an argument? Since the objects know their own classes, they’ll be able to pick a proper method on the visitor less awkwardly. They “accept” a visitor and tell it what visiting method should be executed.

## Components

* The **Visitor** interface declares a set of visiting methods that can take concrete elements of an object structure as arguments. These methods may have the same names if the program is written in a language that supports overloading, but the type of their parameters must be different.
* Each **Concrete Visitor** implements several versions of the same behaviors, tailored for different concrete element classes
* The **Element/Visitable** interface declares a method for ***“accepting”*** visitors. This method should have one parameter declared with the type of the visitor interface
* Each **Concrete Element/Visitable** must implement the acceptance method. The purpose of this method is to redirect the call to the proper visitor’s method corresponding to the current element class. Be aware that even if a base element class implements this method, all subclasses must still override this method in their own classes and call the appropriate method on the visitor object
* The **Client** usually represents a collection or some other complex object (for example, a Composite tree). Usually, clients aren’t aware of all the concrete element classes because they work with objects from that collection via some abstract interface


## References

https://refactoring.guru/design-patterns/visitor

https://www.newthinktank.com/2012/11/visitor-design-pattern-tutorial/
