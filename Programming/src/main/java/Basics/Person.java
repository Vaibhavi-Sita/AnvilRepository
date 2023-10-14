package main.java.Basics;

/*
 OOPs
 to build any object, your JVM needs a structure
 that structure is defined by a class
 A class is a blueprint to build objects


 An object knows something - value
 An object does something - behaviour - function/method

 */


class Employee
{
    int empID;
    String name;

    /*
     Constructor
     lets say we have certain variables in the class
     to create an object of a class

     */

    public Employee(int empID, String name){
        this.empID = empID;
        this.name = name;
    }
    public String getEmpData()
    {
        return Integer.toString(empID) + " : " + name;
    }

}

public class Person {

    /*
     why do we have a psvm?

     to create an object, we need a main method
     the execution of the project/code starts from main
     inorder to call the main method
     initial parameters will be passed into the main method as
     (String args[]) - String: since String accepts all sorts of values
                               such as int/float/boolean/ etc
                     - args[]: we are not sure how many values a user will send
                               1 or 2 or many. So we are taking an array.
      main will return nothing - therefore, void is used
      but there is a chance that this main method can be a static method
      why should it be a static method?? - to call any method in java,
      you need an object. And we can only create an object once your execution starts
      But main is the starting point of execution - to obj can be created yet
      This is a deadlock situation
      To solve the deadlock, we are stating tht the main method if static
      For static methods to be called, an object need not be created

     */
    public static void main(String args[])
    {
        /*
        We use new to create an object/ instance of a class
        Objects are created or stored inside the heap memory
        new keyword occupies the space required inside the heap memory
        when an object of the class is created
         */
        Employee obj1 = new Employee();
        obj1.empID = 91456;
        obj1.name = "Sita";

        // Note: in c programming, if you don't assing any value to a variable,
        // it will print out a garbage value. But in java
        // we get 0 as value by default
        System.out.println(obj1.getEmpData());
    }

}
