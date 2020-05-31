package com.dv.tutorials.builder.model;

public class SalesEmployee extends AbstractEmployee{
	
	private static final long serialVersionUID = 1L;

	private boolean isSalesEmployee;
	
	private String salesRegion;
	
	
	public boolean isSalesEmployee() {
		return isSalesEmployee;
	}
	
		
	public String getSalesRegion() {
		return salesRegion;
	}

	@Override
	public StringBuilder getObjectStringBuilder() {
		return super.getObjectStringBuilder()
				.append("isSalesEmployee="+isSalesEmployee).append("\n")
				.append("salesRegion="+salesRegion).append("\n");
	}
	
	@Override
	public String toString() {
		return getObjectStringBuilder().toString();
	}

	public static class Builder extends AbstractEmployee.AbstractBuilder<SalesEmployee, Builder> {
		
				
		public Builder salesEmployee(boolean saleEmployee) {
		      objectBeingBuilt.isSalesEmployee=saleEmployee;
		      return that();
		}
		
		public Builder salesRegion(String saleRegion) {
		      objectBeingBuilt.salesRegion=saleRegion;
		      return that();
		}
		
	    @Override
	    protected Builder that() {
	      return this;
	    }

	    @Override
	    protected SalesEmployee createEmptyObject() {
	      return new SalesEmployee();
	    }
	    	
	    public SalesEmployee build() {
	        return objectBeingBuilt;
	      }
	}

}
