# Bridge 

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

## Components

* The **Abstraction** provides high-level control logic. It relies on the implementation object to do the actual low-level work.
* The **Implementation** declares the interface that’s common for all concrete implementations. An abstraction can only communicate with an implementation object via methods that are declared here.The abstraction may list the same methods as the implementation, but usually the abstraction declares some complex behaviors that rely on a wide variety of primitive operations declared by the implementation.
* **Concrete Implementations** contain platform-specific code
* **Refined Abstractions** provide variants of control logic. Like their parent, they work with different implementations via the general implementation interface.
* Usually, the **Client** is only interested in working with the abstraction. However, it’s the client’s job to link the abstraction object with one of the implementation objects.

## Identification

* Bridge can be recognized by a clear distinction between some controlling entity and several different platforms that it relies on.
* The controlling entity has a reference to platform ( through composition )

#### Abstraction and Implementation

The GoF book  introduces the terms ***Abstraction*** and ***Implementation*** as part of the Bridge definition.  Abstraction (also called interface) is a ***high-level control layer for some entity***. This layer isn’t supposed to do any real work on its own. It should delegate the work to the ***implementation layer (also called platform)***

As mentioned earlier, there are two separate hierarchies that get formed. More specifically there hierarchies are of :
1. High-level control layer
2. Implementation layer (also called ***platform***)

```java
// Abstraction : The High-level control layer
public abstract class Remote {

  // Composition - implementor (Implementation layer, also called platform )
  protected Device device;

  // Constructor with implementor as input argument
  public Remote(Device d) {
    this.device = d;
  }

  abstract public void power();

  ...
}

// Implementation : Common for all concrete implementations
public interface Device {

	boolean isEnabled();
  ...
}
```

Remotes act as abstractions, and devices are their implementations. Thanks to the common interfaces, the same remotes can work with different devices and vice versa. The Bridge pattern allows changing or even creating new classes without touching the code of the opposite hierarchy.

```java

// Concrete Implementations : Hierarchy of platforms
public class Radio implements Device {
 ...
} 

public class Tv implements Device {
  ...
}

// Hierarchy of Abstractions aka Refined Abstractions (High-level control layer)
public class BasicRemote extends Remote {
    ...
}

public class AdvancedRemote extends BasicRemote {
  ...
}
```


References
==========
https://refactoring.guru/design-patterns/bridge

https://www.journaldev.com/1491/bridge-design-pattern-java
