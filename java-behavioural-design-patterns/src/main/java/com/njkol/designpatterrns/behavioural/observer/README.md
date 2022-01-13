# Observer Pattern (Also known as: Event-Subscriber, Listener)

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

The goal of Observer is to establish dynamic one-way connections between objects, where some objects act as subordinates of others.

The object that has some interesting state is often called subject, but since it’s also going to notify other objects about the changes to its state, we’ll call it publisher. All other objects that want to track changes to the publisher’s state are called subscribers.

The Observer pattern suggests that you add a subscription mechanism to the publisher class so individual objects can subscribe to or unsubscribe from a stream of events coming from that publisher. Now, whenever an important event happens to the publisher, it goes over its subscribers and calls the specific notification method on their objects.

## Components

* **Subject/Publisher** – interface or abstract class defining the operations for attaching and de-attaching observers to the subject.
* **ConcreteSubject** – concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.
* **Observer/Subscriber** – interface or abstract class defining the operations to be used to notify this object.
* **ConcreteObserver** – concrete Observer implementations.

## Identification

The pattern can be recognized by subscription methods, that store objects in a list and by calls to the update method issued to objects in that list.

## Examples

Here are some examples of the pattern in core Java libraries:

* java.util.Observer/java.util.Observable (rarely used in real world)
* All implementations of java.util.EventListener (practically all over Swing components)
* javax.servlet.http.HttpSessionBindingListener
* javax.servlet.http.HttpSessionAttributeListener
* javax.faces.event.PhaseListener


References
==========
https://refactoring.guru/design-patterns/observer

https://java2blog.com/observer-design-pattern-in-java/

https://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/
