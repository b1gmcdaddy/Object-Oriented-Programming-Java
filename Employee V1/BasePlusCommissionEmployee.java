package employee1;

public class BasePlusCommissionEmployee {
	private int empID;
	private String empName;
	private float totalSales;
	private float baseSalary;
	
	public BasePlusCommissionEmployee() {
		
	}
	
	public BasePlusCommissionEmployee(int empID, String empName, float totalSales, float baseSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.totalSales = totalSales;
		this.baseSalary = baseSalary;
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

	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public float computeSalary() {
		float salary = 0; 
		float total;
		total = this.totalSales;
		
		if(total > 0 && total < 10000) {
			salary = total * 0.05f + this.baseSalary;
		}else if(total > 10000.10 && total < 50000) {
			salary = total * 0.15f + this.baseSalary;
		}else if(total > 50000) {
			salary = total * 0.20f + this.baseSalary;
		}
		return salary;
	
	}
}
