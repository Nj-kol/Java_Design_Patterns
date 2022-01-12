# Interpreter design pattern

Interpreter design pattern is one of the behavioral design pattern. 

The Interpreter pattern discusses: defining a domain language (i.e. problem characterization) as a simple language grammar, representing domain rules as language sentences, and interpreting these sentences to solve the problem. The pattern uses a class to represent each grammar rule. And since grammars are usually hierarchical in structure, an inheritance hierarchy of rule classes maps nicely.
An abstract base class specifies the method interpret(). Each concrete subclass implements interpret() by accepting (as an argument) the current state of the language stream, and adding its contribution to the problem solving process.

## Components of Interpreter pattern

* Client : Builds (or is provided) the AST assembled from TerminalExpression and NonTerminalExpression. The Client invokes the interpret() operation.
* Context : Has the data which I want to interpret 
* AbstractExpression : Provides an interface for executing an operation 
* TerminalExpression : Create classes for each notations involved in the grammar  
           
       
* Each notation should be capable of interpreting itself ( So, the AbstractExpression must provide the interpret method )

## Examples

* java.util.Pattern and subclasses of java.text.Format are some of the examples of interpreter pattern used in JDK.

References
==========
https://sourcemaking.com/design_patterns/interpreter

https://www.journaldev.com/1635/interpreter-design-pattern-java

