package org.CalculatorAppln.Calculator;
import java.util.*;
public class Calculator {


	    public int Addition(int num1, int num2){
	        return num1 + num2;
	    }
	    public int Substraction(int num1, int num2){
	        return num1 - num2;
	    }
	    public int Multiplication(int num1,int num2){
	        return num1 * num2;
	    }
	    public int Division(int num1, int num2){
	        if (num2 != 0) return num1 / num2;
	        else return 0;
	    }
	    
}

