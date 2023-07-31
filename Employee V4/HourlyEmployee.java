package employee4;

public class HourlyEmployee extends Employee{
	
	private float totalHoursWorked;
	private float ratePerHour;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(int empID, String empName, float totalHoursWorked, float ratePerHour) {
		super.setEmpID(empID);
		super.setEmpName(empName);
		this.totalHoursWorked = totalHoursWorked;
		this.ratePerHour = ratePerHour;
	}

	public float getTotalHoursWorked() {
		return totalHoursWorked;
	}

	public void setTotalHoursWorked(float totalHoursWorked) {
		this.totalHoursWorked = totalHoursWorked;
	}

	public float getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(float ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public float computeSalary() {
		float hours, overtime;

		hours = this.totalHoursWorked;
		overtime = 0;

		if (hours > 40) {
			overtime = hours - 40;
			hours = 40;
		}

		return hours * this.ratePerHour + overtime * this.ratePerHour * 1.5f;
	}

	public void displayInfo() {
		System.out.print(this);
	}
	
	@Override
	public String toString() {
	    return String.format("\n| %-8d | %-13s | %-13.2f | %-13s", this.getEmpID(), this.getEmpName(),
	                          this.computeSalary(), "HourlyEmployee");
	}



	
	@Override
	public boolean equals(Object obj) {
		HourlyEmployee he;

		if (obj instanceof HourlyEmployee) {
			he = (HourlyEmployee) obj;
		} else {
			return false;
		}
		if(he.getEmpID() == this.getEmpID() && he.getEmpName() == this.getEmpName()) {
			return true;
		}
		return false;
	}
}