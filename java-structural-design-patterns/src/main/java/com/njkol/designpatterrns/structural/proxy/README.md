# Proxy Design Pattern

Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

The Proxy pattern suggests that you create a new proxy class with the same interface as an original service object. Then you update your app so that it passes the proxy object to all of the original object’s clients. Upon receiving a request from a client, the proxy creates a real service object and delegates all the work to it.

## Components

* The **Service Interface** declares the interface of the Service. The proxy must follow this interface to be able to disguise itself as a service object
* The **Service** is a class that provides some useful business logic
* The **Proxy** class has a reference field that points to a service object. After the proxy finishes its processing (e.g., lazy initialization, logging, access control, caching, etc.), it passes the request to the service object. Usually, proxies manage the full lifecycle of their service objects
* The **Client** should work with both services and proxies via the same interface. This way you can pass a proxy into any code that expects a service object

## Common Scenarios

* Virtual proxy - Instead of creating the object when the app launches, you can delay the object’s initialization to a time when it’s really needed
* Protection proxy - The proxy can pass the request to the service object only if the client’s credentials match some criteria.
remote proxy - proxy passes the client request over the network, handling all of the nasty details of working with the network.
* Logging proxy - proxy can log each request before passing it to the service.
* Caching proxy -  The proxy can implement caching for recurring requests that always yield the same results.

## Examples

Some examples of proxies in standard Java libraries:

* java.lang.reflect.Proxy
* java.rmi.*
* javax.ejb.EJB (see comments)
* javax.inject.Inject (see comments)
* javax.persistence.PersistenceContext

References
==========
https://refactoring.guru/design-patterns/proxy

https://www.java2novice.com/java-design-patterns/proxy-design-pattern/
