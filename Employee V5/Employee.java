package employeeV5;

public abstract class Employee {
	private int empID;
	private String empName;
	
	public Employee() {
		super();
	}

	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
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
	
	public void displayInfo() {
		System.out.println(this);
	}
	
	public abstract float computeSalary();

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ");
		sb.append(this.getEmpID());
		sb.append("\nNAME: ");
		sb.append(this.getEmpName());
	
		return sb.toString();
	}
}