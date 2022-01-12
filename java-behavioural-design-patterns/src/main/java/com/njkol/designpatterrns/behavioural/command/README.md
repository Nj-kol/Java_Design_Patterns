# Command pattern (Also known as: Action, Transaction)

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. 

This transformation lets you :
- pass requests as a method arguments,
- delay or queue the request's execution
- and support undoable operations.

The pattern intends to **encapsulate in an object all the data required for performing a given action (command)**, including what method to call, the method's arguments, and the object to which the method belongs.

This model allows us to **decouple objects that produce the commands from their consumers**, so that's why the pattern is commonly known as the producer-consumer pattern.

## Components

* The **Invoker** class (aka Sender) is responsible for initiating requests. This class must have a field for storing a reference to a command object. The sender triggers that command instead of sending the request directly to the receiver. Note that the sender isn’t responsible for creating the command object. Usually, it gets a pre-created command from the client via the constructor
* The **Command** interface usually declares just a single method for executing the command
* **Concrete Commands** implement various kinds of requests. A concrete command isn’t supposed to perform the work on its own, but rather to pass the call to one of the business logic objects. However, for the sake of simplifying the code, these classes can be merged. Parameters required to execute a method on a receiving object can be declared as fields in the concrete command. You can make command objects immutable by only allowing the initialization of these fields via the constructor
* The **Receiver** class contains some business logic. Almost any object may act as a receiver. Most commands only handle the details of how a request is passed to the receiver, while the receiver itself does the actual work
* The **Client** creates and configures concrete command objects. The client must pass all of the request parameters, including a receiver instance, into the command’s constructor. After that, the resulting command may be associated with one or multiple senders.

## Identification

If you see a set of related classes that represent specific actions (such as “Copy”, “Cut”, “Send”, “Print”, etc.), this may be a Command pattern. These classes should implement the same interface/abstract class. 

The commands may implement the relevant actions on their own or delegate the work to separate objects—that will be the receivers. The last piece of the puzzle is to identify an invoker—search for a class that accepts the command objects in the parameters of its methods or constructor.

## Examples

Here are some examples of Commands in core Java libraries:

* All implementations of `java.lang.Runnable`

* All implementations of `javax.swing.Action`

References
==========
https://refactoring.guru/design-patterns/command

https://www.baeldung.com/java-command-pattern

https://www.newthinktank.com/2012/09/command-design-pattern-tutorial/