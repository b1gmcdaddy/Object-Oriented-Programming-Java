package employeev6;

public class Test {

    public static void main(String[] args) {

        EmployeeRoster rtest = new EmployeeRoster(10);
        
		MyDate date1 = new MyDate(12, 26, 1999);
		Name name1 = new Name("Jolo", "Pasar", "Tangpuz");
		
		MyDate date2 = new MyDate(8, 10, 1998);
		Name name2 = new Name("Nouffa", "Si", "Ali");
		
		MyDate date3 = new MyDate(2, 16, 2000);
		Name name3 = new Name("Son", "Idk", "Goku");
		
		MyDate date4 = new MyDate(11, 1, 2005);
		Name name4 = new Name("Naruto", "No", "Uzumaki");
		
		MyDate date5 = new MyDate(6, 28, 1994);
		Name name5 = new Name("Idk", "My", "Nameee");
		

        HourlyEmployee emp1 = new HourlyEmployee(1, 5, 100, date1, name1);
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(2, 310, 1, date2, name2);
        HourlyEmployee emp3 = new HourlyEmployee(3, 10, 105, date3, name3);
        CommissionEmployee emp4 = new CommissionEmployee(4, 11000, date4, name4);
        BasePlusCommissionEmployee emp5 = new BasePlusCommissionEmployee(5, emp4.getTotalSales(), 5000, date5, name5);
       
        
        //add employees
        rtest.addEmployee(emp1);
        rtest.addEmployee(emp2);
        rtest.addEmployee(emp3);
        rtest.addEmployee(emp4);
        rtest.addEmployee(emp5);
        
        System.out.println("OOP EMPLOYEE V6 w/ MyDate and Name");   //abstraction implemented in employee.java
        rtest.displayEmployees();     //display added employees
        System.out.println("\n////////////////////////////////////////////////////////////////////////////");

        System.out.println("\nAFTER DELETING EMPLOYEES 2 & 5.");
        rtest.deleteEmployee(2);
        rtest.deleteEmployee(5);
        rtest.displayEmployees();   //display after deletion
        System.out.println("\n////////////////////////////////////////////////////////////////////////////");


        System.out.println("\nSEARCH FOR AN EMPLOYEE BY NAME OR LETTERS FROM NAME (In this case, names with 'uzu'): ");
        EmployeeRoster result = rtest.searchEmployee("Uzu");
        if (result != null) {
            result.displayEmployees();
        } 
        
        System.out.println("\n////////////////////////////////////////////////////////////////////////////");
        

        System.out.println("\nCOUNT EMPLOYEES: ");    //counting employees of each category
        System.out.println("Hourly employees: " + rtest.countHourlyEmployee());
        System.out.println("Piece worker employees: " + rtest.countPieceWorkerEmployee());
        System.out.println("Commission employees: " + rtest.countCommissionEmployee());
        System.out.println("BasePlusCommission employees: " + rtest.countBasePlusCommissionEmployee());
    }
}