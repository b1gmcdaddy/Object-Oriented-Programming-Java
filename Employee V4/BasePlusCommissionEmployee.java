package employee4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private float baseSalary;


    public BasePlusCommissionEmployee() {
        super();
    }

    public BasePlusCommissionEmployee(int empID, String empName, float totalSales, float baseSalary) {
        super(empID, empName, totalSales);
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float computeSalary() {
        float salary = super.computeSalary();

        salary += this.baseSalary;

        return salary;
    }

    public void displayInfo() {
    	System.out.print(this);
    }
    
    @Override
	public String toString() {
	    return String.format("\n| %-8d | %-13s | %-13.2f | %-13s", this.getEmpID(), this.getEmpName(),
	                          this.computeSalary(), "BasePlusCommissionEmployee");
	}
}