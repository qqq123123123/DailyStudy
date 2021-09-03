package kr.or.shi.review;

public class EmployeeTest {
    
    public static void main(String[] args) {
        
    Employee employeeWon = new Employee();
    employeeWon.setEmployeeName("장원규");
    // System.out.println(employeeWon.serialNum);

    Employee employeeSa = new Employee();
    employeeSa.setEmployeeName("사공승조");
    // employeeSa.serialNum++;
    // System.out.println(employeeSa.serialNum);
    // System.out.println(employeeWon.serialNum);
    System.out.println(employeeWon.getEmployeeName() + ", " + employeeWon.getEmployeeId());
    System.out.println(employeeSa.getEmployeeName() + ", " + employeeSa.getEmployeeId());


    }


}
