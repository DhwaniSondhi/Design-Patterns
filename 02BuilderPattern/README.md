# 02 Builder Pattern
The Builder Pattern separates the construction of a complex object from its representation so that the same construction process can
create different representations.
**Elements of builder pattern:**
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
