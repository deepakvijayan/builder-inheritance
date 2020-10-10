# builder-inheritance
A java builder pattern with inheritance


```java

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
    	    	
    
    	AbstractEmployee salesEmployee = new SalesEmployee.Builder()
    			.id(201L)
    			.salutation("Mr.")
    			.firstName("SalesFirstName")
    			.middleName("SalesMiddleName")
    			.lastName("SalesLastName")
    			.emailId("Salesfirstname.Saleslastname@example.com")
    			.dateOfBirth(LocalDate.of(2000,Month.JANUARY, 1))
    			.salesEmployee(true)
    			.salesRegion("SouthIndia")
    			.build();
          
```
