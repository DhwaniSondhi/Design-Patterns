# Design-Patterns
This gives the descriptions of various patterns. It also provides solutions in the specific design patterns for various hyperlinked problems(Please click on the links to get the problem description).

## 01 Factory Pattern
The Factory Pattern provides a simple decision making class that returns one of several possible subclasses of an abstract base class depending on the data that are provided.

1. [Practice Problem 1](https://www.journaldev.com/1392/factory-design-pattern-in-java)
2. [Practice Problem 2](https://alvinalexander.com/java/java-factory-pattern-example#the-concrete-dog-classes)
3. [Practice Problem 3](https://www.binpress.com/factory-design-pattern/)
4. [Practice Problem 4](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)
5. [Practice Problem 5](https://dzone.com/articles/java-the-factory-pattern)
6. [Practice Problem 6](https://sourcemaking.com/design_patterns/factory_method)
7. [Practice Problem 7](https://www.geeksforgeeks.org/design-patterns-set-2-factory-method)

## 02 Builder Pattern
The Builder Pattern separates the construction of a complex object from its representation so that the same construction process can
create different representations.
**Elements** of builder pattern:
- **Builder:** specifies an abstract interface for creating parts of a Product object. 
- **ConcreteBuilder:** constructs and assembles parts of the product by implementing the Builder interface. Also, it defines and keeps track of the representation it creates and provides an interface for retrieving the product . 
- **Director:** constructs an object using the Builder interface. 
- **Product:** represents the complex object under construction. 

1. Practice Problem 1 : To construct roof, structure and floor of a shelter where shelter is the complex object. Polar shelter and tropical shelter needs to be build using builder classes.
2. [Practice Problem 2](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm)
3. [Practice Problem 3](https://sourcemaking.com/design_patterns/builder/java/2)
4. [Practice Problem 4](https://dzone.com/articles/design-pattern-builder-pattern)
5. [Practice Problem 5](http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/)
6. [Practice Problem 6](https://www.javagists.com/builder-pattern-with-java-examples)

## 03 Adapter Pattern
The Adapter Pattern is used to allow a client class to use another class that may provide a service to it, but whose API is incompatible with what the client is expecting. 
The **classes/objects** participating in adapter pattern:
- **Target** - defines the domain-specific interface that Client uses.
- **Adapter** - adapts the interface Adaptee to the Target interface.
- **Adaptee** - defines an existing interface that needs adapting.
- **Client** - collaborates with objects conforming to the Target interface.


1. Practice Problem 1 : If a client only understands the SquarePeg interface for inserting pegs using the insert() method, but we have RoundPeg class which provides the same service but using differentimplementations. How can it insert round pegs, which are pegs, but that are inserted differently, using the insertIntoHole() method?
2. Practice Problem 2 : For the practice problem 1, if the client wanted to have a two way adapter for both round peg and sqaure peg. We need to build a class adapter to do multiple implementation of both SqaurePegInterface and RoundPegInterface interfaces.
3. [Practice Problem 3](https://www.geeksforgeeks.org/adapter-pattern/)
4. [Practice Problem 4](https://sourcemaking.com/design_patterns/adapter)
5. [Practice Problem 5](https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm)
6. [Practice Problem 6](https://www.journaldev.com/1487/adapter-design-pattern-java)
7. [Practice Problem 7](http://www.vogella.com/tutorials/DesignPatternAdapter/article.html)----->revice
8. [Practice Problem 8](https://medium.com/@ssaurel/implement-the-adapter-design-pattern-in-java-f9adb6a8828f)

## 04 Strategy Pattern
Sometimes we may want to change the behavior of an object depending on some conditions that are only to be determined at runtime, or to easily add new definitions of a certain behavior without altering the class that is using it.
**Elements** of the strategy pattern:
- **Context Class:** class that uses a certain behavior that is to be changed during execution. It contains a Strategy object and provides a setStrategy() method to change its own strategy. The strategy is to be called through a compute() method that will delegate to a concrete strategy method.  
- **Strategy Abstract Class:** Superclass of all strategies containing the abstract compute() method to be implemented by all its subclasses. 
- **Concrete Strategies:** Subclasses of Strategy that provide a different implementation for the compute() method.  

1. [Practice Problem 1](https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm):can also be read from Proff Examples
2. [Practice Problem 2](https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial)
3. [Practice Problem 3](https://dzone.com/articles/design-patterns-strategy)
4. [Practice Problem 4](https://sourcemaking.com/design_patterns/strategy)
5. [Practice Problem 5](https://www.oodesign.com/strategy-pattern.html)


## 05 Decorator Pattern
The Decorator pattern can be used to dynamically add some data members or methods to an object at runtime, depending on the situation.
**Elements** of the Decorator pattern:
- **Component:** Abstract class representing the objects to be decorated by the various Decorators. 
- **Concrete Component:** The potentially many sub-classes that can be decorated. 
- **Decorator:** Abstract class that wraps a Component and will have some of its subclasses to decorate it. 
- **Concrete Decorator:** Different decorators that add different members to the Component. 

1. Practice Problem 1 : We have a coffee interface and two classes Espresso and SimpleCoffee implementing it. Now client wants to add milk and sprinkles. This is to be implemented using milk and sprinkles as coffee decorators. 
2. [Practice Problem 2](https://www.journaldev.com/1540/decorator-design-pattern-in-java-example)
3. [Practice Problem 3](https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm)
