package salary.entities;

public class Employee {

    private Integer number;
    private Integer hoursWorked;
    private Double valuePerHour;

    public Employee() {
        
    }

    public Employee(int number, int hoursWorked, double valuePerHour) {
        this.number = number;
        this.hoursWorked = hoursWorked;
        this.valuePerHour = valuePerHour;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double calculateSalary() {
        return hoursWorked * valuePerHour;
    }

    @Override
    public String toString() {
        return "NUMBER = " + number + "\nSALARY = U$ " + String.format("%.2f", calculateSalary());
    }

}
