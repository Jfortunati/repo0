package com.smartbear.demo;
import java.util.Scanner;

public class Main {
	// this change should not be reviewed

	
	// Java program for Fibonacci number using recursion.
	// dont review!
	// this also shouldnt be reviewed
	// local commit 1
	// local commit 2
	// local commit 3
	
	// working branch dont review repo 2
    public static long fibonacciRecursion(long number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }
	// working branch dont review repo 2
    // Java program for Fibonacci number using Loop.
    public static long fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        long fibo1=1, fibo2=1, fibonacci=1;
        for(	// working branch dont review repo 2int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci definitely do review this number is sum of previous two Fibonacci number
            fibo1 = fibo2;

        }
        return f	// working branch dont review repo 2ibonacci; //Fibonacci another change that should not be reviewed number
    }
}
