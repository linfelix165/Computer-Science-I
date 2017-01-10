import java.util.ArrayList;
import java.util.Scanner;

public class Passenger2 {
	private int numPeople;
	private String[] name;
	private final int[] FIRSTSEATS = new int[2];
	private final int[] ECONOMYSEATS = new int[4];
	
	static Scanner in = new Scanner(System.in);
	
	public Passenger2(){
		
	}
	
	public int getNumPeople(int numPeople) {
		System.out.print("How many people want to buy tickets: ");
		numPeople = in.nextInt();
		return numPeople;
	}
	
	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}
	
	public String[] getName(String[] name) {
		for(int i = 0; i<numPeople;i++){
			System.out.print("Enter customer "+(i+1)+" name: ");
			name[i] = in.nextLine();
		}
		return name;
	}
	
	
	
}
