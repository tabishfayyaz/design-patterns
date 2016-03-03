Popular Object Oriented Design Patterns demonstrated in **Java**

### Strategy
You use this pattern if you need to dynamically change an algorithm used by an object at run time. The pattern also allows you to eliminate code duplication. It abstracts away the behavior from super and subclasses.

###Observer

### Factory
You use this pattern if you want to define the class of an object at runtime. It also allows you to encapsulate object creation code in one place.

### Abstract Factory

### Singleton
You use this pattern if you want to restrict instantiating only one object for a class e.g. any shared resource. The code also has a discussion on how to avoid a *check-then-act* race condition.

### Builder

### Prototype

### Decorator

### Command

### Adapter
You use this pattern if you want to allow an existing class to be used from another interface. It is often used to make existing classes work with others without modifying their source code.

### Facade

### Bridge

### Template Method

### Iterator

### Composite

### Flyweight

### State

### Proxy

### Chain of Responsibility

### Interpreter

### Mediator

### Memento
You use this pattern if you want to provide the ability to restore an object to different states quickly e.g. undo/redo

### Visitor
You use this pattern if you want to perform the same action on many objects of different types. The main goal of the visitor pattern is to solve the Double Dispatch Problem. 

*Double Dispatch Problem:* In polymorphism when the invocation of a virtual function is based *only* on the type of object being messaged and *not* also considering the type of object being passed in parameter. See *DemoDoubleDispatch.java*

### Credits
* Derek Banas [tutorials](https://www.youtube.com/playlist?list=PLF206E906175C7E07) 
* [Wikipedia](https://en.wikipedia.org/wiki/Design_Patterns)

### License
Available under the MIT license. See the LICENSE file for more info.


