# Chain of Responsibility (Also known as: CoR, Chain of Command)

***Use the CoR pattern when the set of handlers and their order are supposed to change at runtime***

## Components

* The **Handler** declares the interface, common for all concrete handlers. It usually contains just a single method for handling requests, but sometimes it may also have another method for setting the next handler on the chain.
* The **Base Handler** is an optional class where you can put the boilerplate code that’s common to all handler classes. Usually, this class defines a field for storing a reference to the next handler. The clients can build a chain by passing a handler to the constructor or setter of the previous handler. The class may also implement the default handling behavior: it can pass execution to the next handler after checking for its existence.
* **Concrete Handlers** contain the actual code for processing requests. Upon receiving a request, each handler must decide whether to process it and, additionally, whether to pass it along the chain. Handlers are usually self-contained and immutable, accepting all necessary data just once via the constructor.
* The **Client** may compose chains just once or compose them dynamically, depending on the application’s logic. Note that a request can be sent to any handler in the chain—it doesn’t have to be the first one.

## Identification

The pattern is recognizable by behavioral methods of one group of objects that indirectly call the same methods in other objects, while all the objects follow the common interface

## Examples

Here are some examples of the pattern in core Java libraries:

* javax.servlet.Filter#doFilter()
* java.util.logging.Logger#log()

References
==========
https://refactoring.guru/design-patterns/chain-of-responsibility