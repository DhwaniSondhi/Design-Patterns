# 04 Strategy Pattern
Sometimes we may want to change the behavior of an object depending on some conditions that are only to be determined at runtime, or to easily add new definitions of a certain behavior without altering the class that is using it.
**Elements of the strategy pattern:**
- **Context Class:** class that uses a certain behavior that is to be changed during execution. It contains a Strategy object and provides a setStrategy() method to change its own strategy. The strategy is to be called through a compute() method that will delegate to a concrete strategy method.  
- **Strategy Abstract Class:** Superclass of all strategies containing the abstract compute() method to be implemented by all its subclasses. 
- **Concrete Strategies:** Subclasses of Strategy that provide a different implementation for the compute() method.  

The problems/solutions are:
<br />
1. [Practice Problem 1](https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm)
2. [Practice Problem 2](https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial)
3. [Practice Problem 3](https://dzone.com/articles/design-patterns-strategy)
4. [Practice Problem 4](https://sourcemaking.com/design_patterns/strategy)
5. [Practice Problem 5](https://www.oodesign.com/strategy-pattern.html)
