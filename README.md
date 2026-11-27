# Examination-1-Biljettkassa

### Abstract class – Why can't we create a Biljett object directly?

**What I tested**

I tried to create an object directly from the abstract superclass
`Biljett` inside `Main.java`.

```java
Biljett biljett1 = new Biljett("Vuxen", 100);
```

**Error message**

```text
'Biljett' is abstract; cannot be instantiated
```

**Why did this happen?**

The `Biljett` class is declared as an abstract class.

```java
public abstract class Biljett
```

An abstract class cannot be instantiated directly using `new`.
It provides a common foundation for its subclasses, including
shared fields, constructors, getters, setters and abstract methods.

**How to solve it**

Instead of creating an object directly from `Biljett`, we need
to create an object from a concrete subclass, such as `Vuxen`.

```java
Vuxen vuxen1 = new Vuxen();
```

The subclass uses `super()` to call the superclass constructor
and must implement the abstract method `visaBiljett()`.

**What I learned**

- An abstract class can have a constructor.
- An abstract class cannot be instantiated directly.
- A concrete subclass can inherit fields and methods.
- A concrete subclass must implement inherited abstract methods
  that have not already been implemented.
- An abstract superclass provides a common foundation for
  inheritance and polymorphism.
