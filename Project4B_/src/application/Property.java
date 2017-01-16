package application;

public class Property {
	
	//Company's name
	private String name;
	//Name of city
	private String city;
	//Rent amount
	private double rent;
	//Owner's name
	private String owner;
	
	/**
	 * Copy Constructor
	 * creates a new object using the information of the object passed to it.
	 * @param p
	 */
	public Property(Property p){
		this.name = p.name;
		this.city = p.city;
		this.owner = p.owner;
		this.rent = p.rent;
	}
	
	/**
	 * Constructor, Parametarized constructor
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 */
	public Property(String name, String city, double rent, String owner){
		this.name = name;
		this.city = city;
		this.owner = owner;
		this.rent = rent;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * the company's name to set
	 * @param name
	 * @return 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 		
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * the city to set
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return rent
	 */
	public double getRent() {
		return rent;
	}

	/**
	 * the rent to set
	 * @param rent
	 */
	public void setRent(double rent) {
		this.rent = rent;
	}

	/**
	 * @return owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * the owner to set
	 * @param owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * toString in class java.lang.Object
	 * @Override
	 */
	public String toString(){
		String str = "\nProperty name: "+name+"\n\tLocated in "+city
				+ "\n\tBelonging to: "+owner
				+ "\n\tRent Amount: $"+rent;
		return str;
	}
}

