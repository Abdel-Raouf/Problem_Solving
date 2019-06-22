package com.access.contructorOverloading;

// one of the most common reasons that constructors are overloaded is to allow one object to initialize another
// initialize one object from another.
public class Summation {

    public int sum;

//     Construct from an int
    Summation(int num) {
        sum = 0;
        for (int i = 1; i <= num; i++) {
           sum += i;
        }
    }

//    Construct from another object
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
