package employee2;

public class HourlyEmployee extends Employee{
	
	private float totalHoursWorked;
	private float ratePerHour;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(int empID, String empName, float totalHoursWorked, float ratePerHour) {
		super.setEmpID(1000);
		super.setEmpName("Antimage");
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
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ");
		sb.append(this.getEmpID());
		sb.append("\nNAME: ");
		sb.append(this.getEmpName());
		sb.append("\nTOTAL HOURS WORKED: ");
		sb.append(this.getTotalHoursWorked());
		sb.append("\nRATE PER HOUR: ");
		sb.append(this.getRatePerHour());
		sb.append("\nSALARY: ");
		sb.append(this.computeSalary());
	
		return sb.toString();
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