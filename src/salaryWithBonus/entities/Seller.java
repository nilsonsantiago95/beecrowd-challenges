package salaryWithBonus.entities;

public class Seller {

    private String name;
    private Double fixedSalary;
    private Double totalSales;

    public Seller() {
        
    }

    public Seller(String name, double fixedSalary, double totalSales) {
        this.name = name;
        this.fixedSalary = fixedSalary;
        this.totalSales = totalSales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(Double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    public double totalSalary() {
        return fixedSalary += totalSales * 0.15;
    }

}
