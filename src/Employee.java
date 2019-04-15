public class Employee {
    private String employee_ID, employee_name, employee_Designation;

    public Employee(String employee_ID, String employee_name, String employee_Designation) {
        this.employee_ID = employee_ID;
        this.employee_name = employee_name;
        this.employee_Designation = employee_Designation;
    }

    public String getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(String employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_Designation() {
        return employee_Designation;
    }

    public void setEmployee_Designation(String employee_Designation) {
        this.employee_Designation = employee_Designation;
    }
}
