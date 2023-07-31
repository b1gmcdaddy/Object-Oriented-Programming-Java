package employeev6;

public abstract class Employee {
	private int empID;
	private String empName;
	private MyDate birthday;
	private Name myName;
	
	public Employee() {
		
	}

	public Employee(int empID, MyDate birthday, Name myName) {
		super();
		this.empID = empID;
		this.birthday = birthday;
		this.myName = myName;
	}
	
	public Name getMyName() {
		return myName;
	}
	
	public Name setMyName(Name myName) {
		return this.myName = myName;
	}
	
	public MyDate getBirthday() {
		return birthday;
	}
	
	public MyDate setBirthday(MyDate birthday) {
		return this.birthday = birthday;
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
	
		return sb.toString();
	}
}