# Decorator Pattern

## Overview

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

***“Wrapper”*** is the alternative nickname for the Decorator pattern that clearly expresses the main idea of the pattern. A wrapper is an object that can be linked with some target object. The wrapper contains the same set of methods as the target and delegates to it all requests it receives. However, the wrapper may alter the result by doing something either before or after it passes the request to the target. The wrapper implements the same interface as the wrapped object

Using decorators you can wrap objects countless number of times since both target objects and decorators follow the same interface. The resulting object will get a ***stacking behavior*** of all wrappers.

## Components

1. **Component** declares the common interface for both wrappers and wrapped objects.
2. **Concrete** Component is a class of objects being wrapped. It defines the basic behavior, which can be altered by decorators.
3. **Base Decorator** class has a field for referencing a wrapped object. The field’s type should be declared as the component interface so it can contain both concrete components and decorators. The base decorator delegates all operations to the wrapped object.
4. **Concrete Decorators** define extra behaviors that can be added to components dynamically. Concrete decorators override methods of the base decorator and execute their behavior either before or after calling the parent method.

## Identification

Decorator can be recognized by creation methods or constructor that accept objects of the same class or interface as a current class.

## Examples

The Decorator is pretty standard in Java code, especially in code related to streams. Here are some examples of Decorator in core Java libraries:
* All subclasses of java.io.InputStream, OutputStream, Reader and Writer have constructors that accept objects of their own type.
* java.util.Collections, methods checkedXXX(), synchronizedXXX() and unmodifiableXXX().
* javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper

References
==========
https://refactoring.guru/design-patterns/decorator