package employee4;

public class PieceWorkerEmployee extends Employee{
	private int pieceFinished;
	private float rate;
	
	public PieceWorkerEmployee() {
		super();
	}
	
	public PieceWorkerEmployee(int empID, String empName, int pieceFinished, float rate) {
		super.setEmpID(empID);
		super.setEmpName(empName);
		this.pieceFinished = pieceFinished;
		this.rate = rate;
	}

	public float getRatePerPiece() {
		return rate;
	}
	
	public void setRatePerPiece(float rate) {
		this.rate = rate;
	}
	
	public int getPieceFinished() {
		return pieceFinished;
	}
	
	public void setPiecefinished(int pieceFinished) {
		this.pieceFinished = pieceFinished;
	}
	
	public float computeSalary() {
		float salary, finished, bonus;
		bonus = 0;
		finished = this.pieceFinished;
		
		salary = finished * this.rate;
		
		if(finished>=100) {
		finished = this.pieceFinished / 100; 
		bonus = this.rate * 5 * finished;
		salary = salary + bonus;
		}
		return salary;
		
	}
	
	public void displayInfo() {
		System.out.print(this);
		
	}
	
	
	@Override
	public String toString() {
	    return String.format("\n| %-8d | %-13s | %-13.2f | %-13s", this.getEmpID(), this.getEmpName(),
	                          this.computeSalary(), "PieceWorkerEmployee");
	}
	
}