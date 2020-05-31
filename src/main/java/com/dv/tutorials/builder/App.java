package com.dv.tutorials.builder;

import com.dv.tutorials.builder.model.AbstractEmployee;
import com.dv.tutorials.builder.model.HREmployee;
import com.dv.tutorials.builder.model.SalesEmployee;

import java.time.LocalDate;
import java.time.Month;

public class App 
{
    public static void main( String[] args )
    {
    		
    	AbstractEmployee hrEmployee = new HREmployee.Builder()
    			.id(200L)
    			.salutation("Mr.")
    			.firstName("HRFirstName")
    			.middleName("HRMiddleName")
    			.lastName("HRLastName")
    			.emailId("HRfirstname.HRlastname@example.com")
    			.dateOfBirth(LocalDate.of(2001,Month.JANUARY, 1))
    			.hrEmployee(true)
    			.operatingCountry("USA")
    			.build();
    	
    	System.out.println(hrEmployee);
    	
    
    	AbstractEmployee salesEmployee = new SalesEmployee.Builder()
    			.id(200L)
    			.salutation("Mr.")
    			.firstName("SalesFirstName")
    			.middleName("SalesMiddleName")
    			.lastName("SalesLastName")
    			.emailId("Salesfirstname.Saleslastname@example.com")
    			.dateOfBirth(LocalDate.of(2000,Month.JANUARY, 1))
    			.salesEmployee(true)
    			.salesRegion("SouthIndia")
    			.build();
    	
    	System.out.println(salesEmployee);
    }
}
