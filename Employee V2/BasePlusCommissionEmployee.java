package employee2;

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
    	System.out.println("BASE PLUS COMMISSION EMPLOYEE");
    	System.out.println(this);
    }
    
    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ");
		sb.append(this.getEmpID());
		sb.append("\nNAME: ");
		sb.append(this.getEmpName());
		sb.append("\nBASE SALARY: ");
		sb.append(this.getBaseSalary());
		sb.append("\nTOTAL SALES: ");
		sb.append(String.format("%, .2f", getTotalSales()));
		sb.append("\nSALARY: ");
		sb.append(this.computeSalary());
		
		return sb.toString();
	}
}