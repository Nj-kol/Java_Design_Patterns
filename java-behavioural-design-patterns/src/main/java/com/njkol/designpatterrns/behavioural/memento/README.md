# Mememto ( Also known as: Snapshot )

* Memento is a behavioral design pattern that allows making snapshots of an object’s state and restoring it in future.
* This pattern is used to implement this in such a way that the saved state data of the object is not accessible 
  outside of the object, this protects the integrity of saved state data.
* One of the thing needs to take care is that Memento class should be accessible only to the Originator object.
* Also in client application, we should use caretaker object for saving and restoring the originator state.
* If Originator object has properties that are mutable, we should use deep copy or cloning to avoid data integrity issue
* We can use Serialization to achieve memento pattern implementation that is more generic rather than Memento pattern where every object needs to have itâ€™s own Memento class implementation

## Components

* The components of this design pattern are :

1. **Originator** 

* Knows how to save itself: the class that you want to make stateful.
* It has two kinds of method :
a. To set current state
b. To save current state

2. **Caretaker**  

* Deals with when, and why, the Originator needs to save or restore itself.
* It has two kinds of method :
a. To save current state of the originator
b. To undo current state of the originator

3. **Memento**

Holds the information about the Originator's state, and cannot be modified by the Caretaker
 
## When Would I Use This Pattern?

* The Memento pattern is useful when you need to provide an undo mechanism in your applications, when the internal state of an object may need to be restored at a later stage
* Using serialization along with this pattern, it's easy to preserve the object state and bring it back later on.

## Examples

* A File editor

## References

https://refactoring.guru/design-patterns/memento

https://www.newthinktank.com/2012/10/memento-design-pattern-tutorial/

https://dzone.com/articles/design-patterns-memento

https://www.journaldev.com/1734/memento-design-pattern-java

https://sourcemaking.com/design_patterns/memento/java/1
