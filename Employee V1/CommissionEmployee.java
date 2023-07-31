package employee1;

public class CommissionEmployee {
	private int empID;
	private String empName;
	private float totalSales;
	
	public CommissionEmployee() {
		
	}
	
	public CommissionEmployee(int empID, String empName, float totalSales) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.totalSales = totalSales;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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
}
