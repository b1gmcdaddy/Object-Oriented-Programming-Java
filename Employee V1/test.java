package employee1;

public class test {
	public static void main(String args[]) {
		HourlyEmployee he1 = new HourlyEmployee();
		he1.setEmpID(1000);
		he1.setEmpName("Joeval");
		he1.setTotalHoursWorked(45.0f);
		he1.setRatePerHour(100.0f);
		
		System.out.println("HOURLY EMPLOYEE \nID: " + he1.getEmpID());
		System.out.println("NAME: " + he1.getEmpName());
		System.out.println("SALARY: " + he1.computeSalary());
		System.out.println("");
		
		
		System.out.println(he1.toString());
		System.out.println();
	
		//System.out.println(he1 == he2);
		//System.out.println(he1.equals(he2));
		
		PieceWorkerEmployee pe1 = new PieceWorkerEmployee(2000, "Nikko", 310, 1.0f);
		System.out.println("PIECE WORKER EMPLOYEE \nID: " + pe1.getEmpID());
		System.out.println("NAME: " + pe1.getEmpName());
		System.out.println("SALARY: " + pe1.computeSalary());
		System.out.println("");
		
		CommissionEmployee ce1 = new CommissionEmployee(3000, "Tidehunter", 11000);
		System.out.println("COMMISSION EMPLOYEE \nID: " + ce1.getEmpID());
		System.out.println("NAME: " + ce1.getEmpName());
		System.out.println("SALARY: " + ce1.computeSalary());
		System.out.println("");
		
		
		BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(4000, "Gaben", 5000, 5000.0f);
		System.out.println("BASE PLUS COMMISSION EMPLOYEE \nID: " + bpce1.getEmpID());
		System.out.println("NAME: " + bpce1.getEmpName());
		System.out.println("SALARY: " + bpce1.computeSalary());
		System.out.println("");
	}
}
