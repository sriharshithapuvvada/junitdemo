package com.valuemomentum.training.bank.junitdemo;

public class calculator {
	 public double add(double a,double b)
	    {
	        return a+b;
	    }
	    
	    public double subtract(double a,double b)
	    {
	        return a-b;
	    }
	    public double multiply(double a,double b)
	    {
	        return a*b;
	    }
	    public double div(double a,double b)
	    {
	    if(b==0)
	    {
	    throw new ArithmeticException();
	    }
	    return a/b;
	    }
}
