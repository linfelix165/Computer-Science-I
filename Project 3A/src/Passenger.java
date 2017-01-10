public class Passenger {
	private String name;
    private int section;
    private int confirmationNo;
    
    public Passenger(String name, int section, int confirmationNo)
    {
        this.name = name;
        this.section = section;
        this.confirmationNo = confirmationNo;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getConfirmationNo() {
		return confirmationNo;
	}

	public void setConfirmationNo(int confirmationNo) {
		this.confirmationNo = confirmationNo;
	}
	
}
