package com.dv.tutorials.builder.model;

public class HREmployee extends AbstractEmployee {

	private static final long serialVersionUID = 1L;
	
	private boolean isHREmployee;
	
	private String operatingCountry;
	
	public boolean isHREmployee() {
		return isHREmployee;
	}
		
	
	public String getOperatingCountry() {
		return operatingCountry;
	}

	@Override
	public StringBuilder getObjectStringBuilder() {
		return super.getObjectStringBuilder()
				.append("isHREmployee="+isHREmployee).append("\n")
				.append("operatingCountry="+operatingCountry).append("\n");
	}
	
	@Override
	public String toString() {
		return getObjectStringBuilder().toString();
	}

	public static class Builder extends AbstractEmployee.AbstractBuilder<HREmployee, Builder> {
		
				
		public Builder hrEmployee(boolean hrEmployee) {
		      objectBeingBuilt.isHREmployee=hrEmployee;
		      return that();
		}
		
		public Builder operatingCountry(String operatingCountry) {
		      objectBeingBuilt.operatingCountry=operatingCountry;
		      return that();
		}
		
	    @Override
	    protected Builder that() {
	      return this;
	    }

	    @Override
	    protected HREmployee createEmptyObject() {
	      return new HREmployee();
	    }
	    	
	    public HREmployee build() {
	        return objectBeingBuilt;
	      }
	}
}
