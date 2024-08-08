Inheritance : when a child class inherits properties from its parent class.
>  It can be implemented by using : "Extends" keyword.
> Parent class is referred as "Super" class.
> child class is referred as "Sub class".
> Use cases :
    method overriding
    reuse the code and reduce the duplication


terminologies :
 > sub class/child class
 > super class/parent class
 > inherits
 > extends

* Extends keyword :
        eg : class Parent_class{

        }

        class child_class extends Parent_class{
            //child class data members and methods
        }


* IS-A relationoship
                       (Is-a) Relationship
    Child class ---------------^----------------> Parent class

* Has-A Relationship
    eg:                               (Has-A)
            car_class -------------------^----------------> Engine_class



***************************************************  POINTS TO REMEMBER ***********************************************

    > A constructor can't be inherited in java
    > Private members do not get inherited.
    > Cyclic Inheritence is not permitted in java
    > assign parent reference to child objects
    > constructors get executed because of super() present in the constructor.


************************************************************************************************************************

                                TYPES OF INHERITANCE IN JAVA
> Single Inheritence
> Multi level Inheritance
> Hierarchical Inheritance
> Hybrid Inheritence

1. Single Inheritance :
    In single inheritance, a sub-class is derived from only one super class. It inherits the properties and behavior of
    a single-parent class. Sometimes it is also known as simple inheritance.

      Employee -----------------------------> Executive
    (super class)                            (sub class)


2. Multilevel Inheritance:
    In multi-level inheritance, a class is derived from a class which is also derived from another class is called
    multi-level inheritance.
    In simple words, we can say that a class that has more than one parent class is called multi-level inheritance. Note
    that the classes must be at different levels. Hence, there exists a single base class and single derived class but
    multiple intermediate base classes.

      Student ---------------> Marks --------------------> sports
      (super)                  (sub)                      (derived)