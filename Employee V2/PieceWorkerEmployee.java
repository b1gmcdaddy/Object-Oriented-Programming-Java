package employee2;

public class PieceWorkerEmployee extends Employee{
	private int pieceFinished;
	private float rate;
	
	public PieceWorkerEmployee() {
		super();
	}
	
	public PieceWorkerEmployee(int empID, String empName, int pieceFinished, float rate) {
		super.setEmpID(2000);
		super.setEmpName("Magnus");
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
		System.out.println(this);
		
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ");
		sb.append(this.getEmpID());
		sb.append("\nNAME: ");
		sb.append(this.getEmpName());
		sb.append("\nPIECES FINISHED: ");
		sb.append(this.getPieceFinished());
		sb.append("\nRATE PER PIECE: ");
		sb.append(this.getRatePerPiece());
		sb.append("\nSALARY: ");
		sb.append(this.computeSalary());
		
		return sb.toString();
	}
}