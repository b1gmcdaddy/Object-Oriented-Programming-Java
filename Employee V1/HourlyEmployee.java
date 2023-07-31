package employee1;

public class HourlyEmployee {
	private int empID;
	private String empName;
	private float totalHoursWorked;
	private float ratePerHour;
	
	public HourlyEmployee() {
	}
	
	public HourlyEmployee(int empID, String empName, float totalHoursWorked, float ratePerHour) {
		this.empID = empID;
		this.empName = empName;
		this.totalHoursWorked = totalHoursWorked;
		this.ratePerHour = ratePerHour;
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
		
		if(hours > 40) {
			overtime = hours - 40;
			hours = 40;
		}
		return hours * this.ratePerHour + overtime * this.ratePerHour * 1.5f;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ");
		sb.append(this.empID);
		sb.append("\nNAME: ");
		sb.append(this.empName);
		sb.append("\nRATE: ");
		sb.append(String.format("%,.2f", this.ratePerHour));
		sb.append("\nHOURS: ");
		sb.append(this.totalHoursWorked);
		sb.append("\nSALARY: ");
		sb.append(computeSalary());
		
		return sb.toString();
		}

	@Override
	public boolean equals(Object obj) {
		HourlyEmployee he = (HourlyEmployee) obj;
		
		if(obj instanceof HourlyEmployee) {
			he = (HourlyEmployee) obj;
		}
		
		if(he.empID == this.empID && he.empName == this.empName) {
			return true;
		}
		return false;
		
		//return super.equals(obj);
	}
	
	
	}

