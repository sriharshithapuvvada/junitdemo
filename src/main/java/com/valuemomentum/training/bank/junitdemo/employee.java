package com.valuemomentum.training.bank.junitdemo;

public class employee {
	private int empId;
    private String name;
    private int salary;
	public employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean equals(Object obj){
        employee emp = (employee) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(emp.name)
                && this.empId == emp.empId 
                && this.salary == emp.salary){
            status = true;
        }
        return status;
    }
	
    public static String getEmpNameWithHighestSalary(){
        /**   * logic to get Highest paid employee        */
        return "Raj";
    }
     
    public static employee getHighestPaidEmployee(){
        /**  * hiding logic to get highest paid employee     */
        return new employee(1, "Ra", 15000);
    }
    
    public int hashCode1(){
        return this.empId;
    }
	

}
