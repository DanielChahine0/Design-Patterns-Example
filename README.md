# Design-Patterns-Example
Open Source examples for the different design patterns. The examples provided are all java based on patterns and they're inspired by the book Head First Design Pattern

# OO Basics
- Abstraction
- Encapsulation
- Polymorphism
- Inheritance

# OO Principles
- Encapsulates what varies
- Favor composition over inheritance
- Program to interfaces, not implementations
- Strive for loosely coupled designs between objects that interact


# OO Patterns
## Strategy Pattern
Defines a family of algorithms, encapsulates each one and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

## Observer Pattern
defines a one-to-many dependency between objects so that all its dependents are notified and updated automatically when one object changes state.

- The observer Pattern defines a one-to-many relationship between objects
- Subjects, or as we know them, Observables, update Observers using a common interface.
- Observers are loosely coupled in that the Observable knows nothing about them, other than that they implement the Observer Interface.
- Push or pull data from the Observable can be done when using the pattern (pull is considered more “correct”).
- Don’t depend on a specific order of notification for the Observers.
- Java has several implementations of the Observer Pattern, including the general purpose java.util.Observable.
- Watch out for issues with the java.util.Observable implementation.
- Don’t be afraid to create an Observable implementation if needed.
- Swing makes heavy use of the Observer Pattern, as do many GUI frameworks. It can also be found in many other places, including JavaBeans and RMI.
