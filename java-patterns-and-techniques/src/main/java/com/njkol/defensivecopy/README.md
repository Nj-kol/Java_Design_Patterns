# Defensive Copy

* If a class has mutable components that it gets from or returns to its clients, the class must defensively copy these components
 
## Scenarios
 
**Case 1: While copying input parameters**
 
 * Defensive copying of parameters is not just for immutable classes. Anytime you write a method or constructor that enters a client-provided object into an internal data structure, think about whether the client-provided object is potentially mutable. 

```java
// Repaired constructor - makes defensive copies of parameters
public Period(Date start, Date end) {
  this.start = new Date(start.getTime());
  this.end = new Date(end.getTime());
  if (this.start.compareTo(this.end) > 0)
  throw new IllegalArgumentException(start +" after "+ end);
}
```

**Case 2: While copying input parameters**
 
* You should think twice before returning a reference to an internal component that is mutable. Chances are, you should return a defensive copy. Remember that nonzero-length arrays are always mutable. Therefore, you should always make a defensive copy of an internal array before returning it to a client

```java
// Repaired accessors - make defensive copies of internal fields
public Date start() {
 return new Date(start.getTime());
}

public Date end() {
 return new Date(end.getTime());
}
```

## Notes

* Defensive copies are made before checking the validity of the parameters , and the validity check is performed on the copies rather than on the originals. While this may seem unnatural, it is necessary. It protects the class against changes to the parameters from another thread during the “window of vulnerability” between the time the parameters are checked and the time they are copied.

* Do not use the clone method to make a defensive copy of a parameter whose type is sub-classable by untrusted parties.

 * Defensive copying can have a performance penalty associated with it and isn’t always justified. If a class trusts its caller not to modify an internal component, perhaps because the class and its client are both part of the same package,
 