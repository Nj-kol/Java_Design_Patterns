
# Serialization Proxy

## Case :  Make a child class serializable, regardless of missing parameterless constructor of non-serializable parent clas

* A class designed for inheritance, which is not
   Serializable itself, and has no parameterless 
   constructor
   
   and try to serialize and then deserialize any of  ConvenientPoint instances, we'll quickly encounter beautiful InvalidClassException, complaining that there is no valid constructor


* When the  ConvenientPoint instance will be serialized, it will 
  nominate its replacement, thanks to  writeReplacemethod -  
  SerializationProxy instance will be serialized instead
  of  ConvenientPoint. 

From the other side, when  SerializationProxy will be deserialized, 
 readResolve method usage will nominate its replacement, 
 being  ConvenientPoint instance. 

As you see, we've made  ConvenientPoint serializable, regardless of missing parameterless constructor of non-serializable parent class.

Reference
=========
https://dzone.com/articles/serialization-proxy-pattern
