package com.valuemomentum.training.bank.junitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class employeetest {
	@Test
    public void mySimpleEqualsTest(){
          String expectedName = "Raj";
 assertEquals(expectedName, employee.getEmpNameWithHighestSalary());
    }
     
    @Test
    public void myObjectEqualsTest(){
         
        employee expectedEmpObj = new employee(1, "Ra", 15000);
   assertEquals(expectedEmpObj, employee.getHighestPaidEmployee());
    }
}
