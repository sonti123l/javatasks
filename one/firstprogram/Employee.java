package one.firstprogram;
public class Employee extends Worker{

   
    private long employeeId;
    private String hireDate;
    
    public Employee(String name, String birthDate,long employedId,String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
