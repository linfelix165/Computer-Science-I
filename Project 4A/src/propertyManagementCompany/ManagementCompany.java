package propertyManagementCompany;

public class ManagementCompany {
	
	//Max number of company
	private final int MAX_PROPERTY = 5;
	//Company's name
	private String name;
	//ID of tax number 
	private String taxId;
	//Management fee
	private double mgnFee;
	//Create an Property array
	private Property[] list;
	//Count number of company
	private int numOfProperty = 0;
	
	/**
	 * Constructor Creates a ManagementCompany object using the passed informations. 
	 * Property array is initialized here as well.
	 * @param name
	 * @param taxId
	 * @param mgnFee
	 */
	public ManagementCompany(String name, String taxId, double mgnFee){
		
		this.name = name;
		this.taxId = taxId;
		this.mgnFee = mgnFee;
		list = new Property[MAX_PROPERTY];
	}
	
	/**
	 * Adds the property object to the Property array. 
	 * It returns either -1 if the array is full or the index in the array where the property was added successfully.
	 * @param p
	 * @return
	 */
	public int addProperty(Property p){
		if(numOfProperty < MAX_PROPERTY){
			list[numOfProperty] = p;
			numOfProperty++;
			return numOfProperty;
		}else{
			return -1;
		}
		
	}
	
	/**
	 * Displays the information of the property at index i
	 * @param i, index of property within the array "list"
	 * @return information of the property at index i
	 */
	public String displayPropertyAtIndex(int i){
		return list[i].toString();
	}

	/**
	 * Return the MAX_PROPERTY constant that represent the size of the "list" array.
	 * @return MAX_PROPERTY
	 */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	/**
	 * Displays the information of all the properties in the "list" array.
	 * @Override
	 */
	public String toStrin(){
		String str = "";
		for(int i = 0; i < numOfProperty;i++){
			str += list[i].toString()+"\n";
		}
		return str;
	}
	
	/**
	 * This method accesses each "Property" object within the array "list" 
	 * and sums up the property rent and returns the total amount.
	 * @return total rent
	 */
	public double totalRent(){
		double total = 0.0;
		for(int i = 0; i< numOfProperty;i++){
			total += list[i].getRent();
		}
		return total;
	}
	
	/**
	 * This method is returning the index of the property with the maximum rent amount.
	 * NOTE: For simplicity assume that each "Property" object's rent amount is different.
	 * @return max index
	 */
	public int maxPropertyRentIndex(){
		
		int maxIndex = 0;
		double maxRent = list[0].getRent();
		
		for(int i = 0; i<numOfProperty;i++){
			if(maxRent < list[i].getRent()){
				maxRent = list[i].getRent();
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	/**
	 * This method calculate the management fee
	 * @return management fee
	 */
	public double totalFee(){
		
		double fee = 0.0;
		for(int i=0;i<numOfProperty;i++){
			fee += (mgnFee*list[i].getRent())/100;
		}
		return fee;
	}
	
}
