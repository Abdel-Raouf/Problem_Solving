package com.access.com.access.recursion;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

//read again this section of the book, and understand it well as it's a core topic.

// a simple example of recursion
public class Factorial {

//    this is a recursive function
    int factR(int n) {
     int result = 0;

     if (n == 1) {
         return 1;
     }
     log.println(result);
     result = factR(n-1) * n;
     log.println(result);
     return result;
    }

//    this is an iterative equivalent
    int factI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n ; t++) {
            result *= t;
        }
        return result;
    }
}
