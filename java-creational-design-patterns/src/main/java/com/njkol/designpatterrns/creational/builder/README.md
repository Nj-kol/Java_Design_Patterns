# Builder Pattern

Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code. The Builder doesn’t allow other objects to access the product while it’s being built

The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.

The pattern organizes object construction into a set of steps (buildWalls, buildDoor, etc.). To create an object, you execute a series of these steps on a builder object. The important part is that you don’t need to call all of the steps. You can call only those steps that are necessary for producing a particular configuration of an object.

## Use the Builder pattern to get rid of a “telescopic constructor”.

Say you have a constructor with ten optional parameters. Calling such a beast is very inconvenient; therefore, you overload the constructor and create several shorter versions with fewer parameters. These constructors still refer to the main one, passing some default values into any omitted parameters.

```java
class Pizza {
    Pizza(int size) { ... }
    Pizza(int size, boolean cheese) { ... }
    Pizza(int size, boolean cheese, boolean pepperoni) { ... }
```
 
## Examples

Builder is widely used in Java core libraries:

* java.lang.StringBuilder#append() (unsynchronized)
* java.lang.StringBuffer#append() (synchronized)
* java.nio.ByteBuffer#put() (also in CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
* All implementations java.lang.Appendable

## Identification

* The Builder pattern can be recognized in a class, which has a single creation method and several methods to configure the resulting object. 
* Builder methods often support chaining (for example, someBuilder->setValueA(1)->setValueB(2)->create()).

References
==========
https://refactoring.guru/design-patterns/builder

Effective Java
