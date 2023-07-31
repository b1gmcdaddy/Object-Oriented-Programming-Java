package employee3;

public class CommissionEmployee extends Employee{
	private float totalSales;
	
	public CommissionEmployee() {
		super();
	}
	public CommissionEmployee(int empID, String empName, float totalSales) {
		super(empID, empName);
		this.totalSales = totalSales;
	}
	
	public float getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(float totalSales) {
		this.totalSales = totalSales;
	}
	
	public float computeSalary() {
		float salary = 0; 
		float total;
		total = this.totalSales;
		
		if(total > 0 && total < 10000) {
			salary = total * 0.05f;
		}else if(total > 10000.10 && total < 50000) {
			salary = total * 0.15f;
		}else if(total > 50000) {
			salary = total * 0.20f;
		}
		return salary;
	}
	
	public void displayInfo() {
		System.out.print(this);
	}
	
	@Override
	public String toString() {
	    return String.format("\n| %-8d | %-13s | %-13.2f | %-13s", this.getEmpID(), this.getEmpName(),
	                          this.computeSalary(), "CommissionEmployee");
	}
}