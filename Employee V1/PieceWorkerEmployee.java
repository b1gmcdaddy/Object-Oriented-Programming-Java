package employee1;

public class PieceWorkerEmployee {
	private int empID;
	private String empName;
	private int pieceFinished;
	private float ratePerPiece;
	
	public PieceWorkerEmployee() {
		
	}
	
	public PieceWorkerEmployee(int empID, String empName, int pieceFinished, float ratePerPiece) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.pieceFinished = pieceFinished;
		this.ratePerPiece = ratePerPiece;
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

	public int getPieceFinished() {
		return pieceFinished;
	}

	public void setPieceFinished(int pieceFinished) {
		this.pieceFinished = pieceFinished;
	}

	public float getRatePerPiece() {
		return ratePerPiece;
	}

	public void setRatePerPiece(float ratePerPiece) {
		this.ratePerPiece = ratePerPiece;
	}
	
	public float computeSalary() {
		float salary, finished, bonus;
		bonus = 0;
		finished = this.pieceFinished;
		
		salary = finished * this.ratePerPiece;
		
		if(finished>=100) {
		finished = this.pieceFinished / 100; 
		bonus = this.ratePerPiece * 5 * finished;
		salary = salary + bonus;
		}
		return salary;
		
	}
	
	
}
