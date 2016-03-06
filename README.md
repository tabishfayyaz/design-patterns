Popular Object Oriented Design Patterns demonstrated in **Java**

## Creational

### Factory
You use this pattern if you want to define the class of an object at runtime. It also allows you to encapsulate object creation code in one place.

### Abstract Factory

### Singleton
You use this pattern if you want to restrict instantiating only one object for a class e.g. any shared resource. The code also has a discussion on how to avoid a *check-then-act* race condition.

### Prototype

### Builder

## Structural

### Proxy
You use this pattern when you want to provide a placeholder, extra layer of indirection or a wrapper around the real object e.g. 

- around 'expensive to create' objects
- as local representation of a remote object
- checking permissions before accessing the real object
- counting the number of references to the real object for memory management purposes

### Flyweight

### Composite

### Bridge

### Facade

### Adapter
You use this pattern if you want to allow an existing class to be used from another interface. It is often used to make existing classes work with others without modifying their source code.

### Decorator

## Behavioral

### Strategy
You use this pattern if you need to dynamically change an algorithm used by an object at run time. The pattern also allows you to eliminate code duplication. It abstracts away the behavior from super and subclasses.

###Observer
You use this pattern when you want many other objects (Subscribers/Observers) to be notified of any state change in another object (Publisher/Subject). The publisher object doesn't need to know anything about the subscriber objects hence encouraging loose coupling.

### Command

### Template Method

### Iterator

### State

### Chain of Responsibility
You use this pattern when you have a group of objects that are expected to solve a certain problem in between themselves. If the first object cannot solve it, it passes the data/request to the next object in the chain and so on and so forth. This pattern promotes loose coupling. 

### Interpreter

### Mediator
You use this pattern to handle communication between related objects (*Colleagues*). All communication is handled by a Mediator object that encapsulates how a set of objects (*Colleagues*) interact. The set of objects don't communicate directly which allows loose coupling.

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


