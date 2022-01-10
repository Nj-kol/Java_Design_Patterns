# Singleton

Singleton Design Pattern is a Creational Design Pattern

# Ways to create Singeton in Java

The first thing to decide upon is whether you want to initialize Sington Eagerly or lazily

## Eager

* Static factory (i.e with no synchronization or just single checking )
* Static block initialization
* Double checked Locking
* Enum

## Lazy

* Static Holder (This technique is also called Bill Pugh's Singleton)

## Serialization and Singleton

## Common concepts

* Private constructor to restrict instantiation of  the class from other classes
* Private static variable of the same class that is the only instance of the class
* Public static method that returns the instance of  the class, this is the global access point for  outer world to get the instance of the singleton class

## Examples

* java.lang.Runtime#getRuntime()
* java.awt.Desktop#getDesktop()
* java.lang.System#getSecurityManager()

References
===========
https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples

https://codepumpkin.com/singleton-design-pattern/

https://medium.com/@kevalpatel2106/how-to-make-the-perfect-singleton-de6b951dfdb0