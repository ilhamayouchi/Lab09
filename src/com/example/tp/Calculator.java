package com.example.tp;

public class Calculator {


	    /** Additionne deux nombres. */
	    public double add(double a, double b) {
	     
	        return a + b;
	    }

	    /** Soustrait b de a. */
	    public double sub(double a, double b) {
	        return a - b;
	    }

	    /** Multiplie deux nombres. */
	    public double mul(double a, double b) {
	        return a * b;
	    }

	    public double div(double a, double b) {
	       
	        if (b == 0) {
	           
	            throw new ArithmeticException("Division par zéro impossible");
	        }
	       
	        return a / b;
	    }
}

