# 05 Decorator Pattern
The Decorator pattern can be used to dynamically add some data members or methods to an object at runtime, depending on the situation.
**Elements of the Decorator pattern:**
- **Component:** Abstract class representing the objects to be decorated by the various Decorators. 
- **Concrete Component:** The potentially many sub-classes that can be decorated. 
- **Decorator:** Abstract class that wraps a Component and will have some of its subclasses to decorate it. 
- **Concrete Decorator:** Different decorators that add different members to the Component. 

1. **Practice Problem 1 :** We have a coffee interface and two classes Espresso and SimpleCoffee implementing it. Now client wants to add milk and sprinkles. This is to be implemented using milk and sprinkles as coffee decorators. 
2. [Practice Problem 2](https://www.journaldev.com/1540/decorator-design-pattern-in-java-example)
3. [Practice Problem 3](https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm)
