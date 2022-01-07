# Adapter ( Also known as: Wrapper )

Adapter is a structural design pattern, that acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes. The wrapped object isn’t even aware of the adapter. For example, you can wrap an object that operates in meters and kilometers with an adapter that converts all of the data to imperial units such as feet and miles.

## Here’s how it works

* The adapter gets an interface, compatible with one of the existing objects.
* Using this interface, the existing object can safely call the adapter’s methods.
* Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.

## Components

* **Client**: the class that wants to use the third-party library or the external system
* **Adaptee**: a class in the third-party library or the external system that we want to use
* **Target interface**: the desired interface that the client will use
* **Adapter**: this class sits between the client and the adaptee and implement

## Examples

There are some standard Adapters in Java core libraries:

* java.util.Arrays#asList()
* java.util.Collections#list()
* java.io.InputStreamReader(InputStream) (returns a Reader object)
* java.io.OutputStreamWriter(OutputStream) (returns a Writer object)

## Identification

Adapter is recognizable by a constructor which takes an instance of a different abstract/interface type. When the adapter receives a call to any of its methods, it translates parameters to the appropriate format and then directs the call to one or several methods of the wrapped object.

References
==========
https://refactoring.guru/design-patterns/adapter

https://www.vogella.com/tutorials/DesignPatternAdapter/article.html