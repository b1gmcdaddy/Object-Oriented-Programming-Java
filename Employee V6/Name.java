package employeev6;

public class Name {
	private String fName;
	private String mName;
	private String lName;
	
	public Name(String fName, String mName, String lName) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}
	
	public String getFName() {
		return fName;
	}
	
	public String setFName(String fName) {
		return this.fName = fName;
	}
	
	public String getMName() {
		return mName;
	}
	
	public String setMName(String mName) {
		return this.mName = mName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public String setLName(String lName) {
		return this.lName = lName;
	}
	
	@Override
	public String toString() {
		return this.fName + " " + this.mName + " " + this.lName;
	}
	

	public boolean contains(String letters) {
	    String fullName = this.fName + " " + this.mName + " " + this.lName;
	    return fullName.toLowerCase().contains(letters.toLowerCase());
	}
	
	public boolean equals(String letters) {
		return false;
	}
	
	
}