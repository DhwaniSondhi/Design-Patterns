# 03 Adapter Pattern
The Adapter Pattern is used to allow a client class to use another class that may provide a service to it, but whose API is incompatible with what the client is expecting. 
The **classes/objects** participating in adapter pattern:
- **Target** - defines the domain-specific interface that Client uses.
- **Adapter** - adapts the interface Adaptee to the Target interface.
- **Adaptee** - defines an existing interface that needs adapting.
- **Client** - collaborates with objects conforming to the Target interface.

The problems/solutions are:
1. **Practice Problem 1 :** If a client only understands the SquarePeg interface for inserting pegs using the insert() method, but we have RoundPeg class which provides the same service but using differentimplementations. How can it insert round pegs, which are pegs, but that are inserted differently, using the insertIntoHole() method?
2. **Practice Problem 2 :** For the practice problem 1, if the client wanted to have a two way adapter for both round peg and sqaure peg. We need to build a class adapter to do multiple implementation of both SqaurePegInterface and RoundPegInterface interfaces.
3. [Practice Problem 3](https://www.geeksforgeeks.org/adapter-pattern/)
4. [Practice Problem 4](https://sourcemaking.com/design_patterns/adapter)
5. [Practice Problem 5](https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm)
6. [Practice Problem 6](https://www.journaldev.com/1487/adapter-design-pattern-java)
7. [Practice Problem 7](http://www.vogella.com/tutorials/DesignPatternAdapter/article.html)----->revice
8. [Practice Problem 8](https://medium.com/@ssaurel/implement-the-adapter-design-pattern-in-java-f9adb6a8828f)
