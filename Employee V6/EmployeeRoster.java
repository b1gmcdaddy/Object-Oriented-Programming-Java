package employeev6;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster extends Employee {

    private List<Employee> employeeList;

    public EmployeeRoster() {
        employeeList = new ArrayList<>();
    }

    public EmployeeRoster(int max) {
        employeeList = new ArrayList<>(max);
    }

    public boolean addEmployee(Employee e) {
        return employeeList.add(e);
    }

    public Employee deleteEmployee(int empID) {
        Employee e = null;
        for (Employee emp : employeeList) {
            if (emp.getEmpID() == empID) {
                e = emp;
                employeeList.remove(emp);
                break;
            }
        }
        return e;
    }

    public EmployeeRoster searchEmployee(String letters) {
        EmployeeRoster searchEmp = new EmployeeRoster();
        for (Employee emp : employeeList) {
            if (emp.getMyName().contains(letters)) {
                searchEmp.addEmployee(emp);
            }
        }
        return searchEmp;
    }

    public void displayEmployees() {
        for (Employee emp : employeeList) {
            emp.displayInfo();
        }
    }

    public int countHourlyEmployee() {
        int count = 0;
        for (Employee emp : employeeList) {
            if (emp instanceof HourlyEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countPieceWorkerEmployee() {
        int count = 0;
        for (Employee emp : employeeList) {
            if (emp instanceof PieceWorkerEmployee) {
                count++;
            }
        }
        return count;
    }
    
    public int countCommissionEmployee() {
        int count = 0;
        for (Employee emp : employeeList) {
            if (emp instanceof CommissionEmployee) {
                count++;
            }
        }
        return count;
    }
    
    public int countBasePlusCommissionEmployee() {
        int count = 0;
        for (Employee emp : employeeList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                count++;
            }
        }
        return count;
    }
    
    @Override
	public float computeSalary() {
		return 0;
	}
}
