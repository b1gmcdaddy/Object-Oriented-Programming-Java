package employeev6;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private float baseSalary;


    public BasePlusCommissionEmployee() {
        
    }

    public BasePlusCommissionEmployee(int empID, float totalSales, float baseSalary, MyDate birthday, Name myName) {
        super(empID, totalSales, birthday, myName);
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
	    return String.format("\n| %-8d | %-18s | %-13.2f | %-13s | %-13s", this.getEmpID(), this.getMyName(),
	                          this.computeSalary(), this.getBirthday(), "BasePlusCommissionEmployee");
	}
}