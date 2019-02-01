package com.smartbear.demo;
import java.util.Scanner;

public class Main {
	// this change should not be reviewed

	
	// Java program for Fibonacci number using recursion.
	// this also shouldnt be reviewed
    public static long fibonacciRecursion(long number){	// working branch dont review repo 2
        if(number == 1 || number == 2){
            return 1;
        }
	// working branch dont review repo 2
        return fibonacciRecusion(number-1) + fi	// working branch dont review repo 2bonacciRecusion(number -2); //tail recursion
    }

    // Java program for Fibonacci number using Loop.
    public static long fi	// working branch dont review repo 2bonacciLoop(int number){
		// dont review these changes!
        if(number == 1 || number == 2){
            return 1;
        }
        long fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci definitely do review this number is sum of previous two Fibonacci number
            fibo1 = fibo2;
	// working branch dont review repo 2
        }
		// dont review these changes!!
        return fibonacci; //Fibonacci another change that should not be reviewed number
    }
}
