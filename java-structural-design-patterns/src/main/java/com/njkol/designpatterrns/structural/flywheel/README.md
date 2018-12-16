# Flyweight Design Pattern is a Structural Design Pattern.

* Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. 
* This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.
* Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. 

1. java.lang.Integer#valueOf(int) (also on Boolean, Byte, Character, Short, Long and BigDecimal)
2. String pool is an example of Flyweight