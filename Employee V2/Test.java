package employee2;

public class Test {

	public static void main(String[] args) {
		
		Employee e = new Employee();


        HourlyEmployee he = new HourlyEmployee(e.getEmpID(), e.getEmpName(), 5, 100);
        he.displayInfo();

        
        PieceWorkerEmployee pwe = new PieceWorkerEmployee(e.getEmpID(), e.getEmpName(), 310, 1);
        System.out.println();
        pwe.displayInfo();

        
        CommissionEmployee ce = new CommissionEmployee(e.getEmpID(), e.getEmpName(), 11000);
        System.out.println();
        ce.displayInfo();
        
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(4000, "hello", ce.getTotalSales(), 5000);
        System.out.println();
        bpce.displayInfo();
	}

}