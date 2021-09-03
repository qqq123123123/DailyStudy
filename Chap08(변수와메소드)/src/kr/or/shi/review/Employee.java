package kr.or.shi.review;

public class Employee {
    public int serialNum = 1000;
    
    public Employee()
    {
        serialNum++;
        
    }
    private int employeeId;
    private String employeeName;
    private String department;
    
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
    
}
