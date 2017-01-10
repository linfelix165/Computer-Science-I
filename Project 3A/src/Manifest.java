import java.util.Random;
import java.util.Scanner;

public class Manifest 
{
	public static void main(String[] args)
	{
	    // Array is not needed, its redundant. I will show you.
		String[] name = new String[6];
		
		int section = 0;
		int confirmationNo;
		Scanner in = new Scanner(System.in);
		
		// Passenger object here is not required here. 
		//Passenger passenger = new Passenger("", section, confirmationNo);
		
		ReservationPortal reservation = new ReservationPortal();
		System.out.println("Welecome to Airline Reservation System");
		System.out.println("Book tickets for your family");
		String decision="";
		// Why are you looping only six times? Mentioned in the question?
		do
		{
		    // We first ask for selection, then name
			//System.out.println("Enter name of passenger"+(i+1)+": ");
			
			//I will say use next(), there are subtle differences bw the two
			//name[i] = in.nextLine();
	
	        // the array for names is redundant
	        // Instead declare a local name variable for this for loop
			
			System.out.println("Which seat do you want to choose:\n" + 
			                    "1.Business\n" + 
			                    "2.Economy\n");
			                    
			int selection = in.nextInt();
			
			
			// this statement is totally bizzare
			// You will get the same name every time, since you had created object on top
			// passenger.getName();
			
			if(selection == ReservationPortal.ECONOMY_SECTION )
			{
			    System.out.println("Enter name of passenger: ");
	            String pname = in.nextLine();
	            
	            Passenger newPassenger = new Passenger(pname, section, ReservationPortal.confirmationCount++);
	            
	            if( reservation.economyClassFull() && !reservation.businessClassFull()  )
	            {
	                // tell user economy full
	                // ask for business
	            	System.out.println("Economy seats are full. Do you want a seat in Economy");
					String decision1 = in.nextLine();
					
					if(decision1.equalsIgnoreCase("yes"))
					{
						reservation.reserveBusinessSeat(newPassenger);
					}
	            }
	            
	            // if if condition false, we can reserve a seat
	            // we need to pass a passegner object to reserve business ticket
	            // here is where you need a passenger object
	            
	            
	            
	            // you need to pass a passenger object
				// reservation.reserveBusinessSeat();
				
				reservation.reserveEconomySeat(newPassenger);
				
				
			}
			else if(selection == ReservationPortal.BUSINESS_SECTION  )
			{
				System.out.println("Enter name of passenger: ");
	            String pname = in.nextLine();
	            Passenger newPassenger = new Passenger(pname, section, ReservationPortal.confirmationCount++);
	            
				reservation.reserveEconomySeat(newPassenger);
				
				if(reservation.businessClassFull())
			    {
					System.out.println("The seat is full. Do you want a seat in Economy");
					String decision2 = in.nextLine();
					
					if(decision2.equalsIgnoreCase("yes")){
						reservation.reserveEconomySeat(newPassenger);
					}else{
						break;
					}
				}
				if(reservation.economyClassFull()){
					System.out.println("The seat is full. Do you want a seat in Business");
					String decision3 = in.nextLine();
					if(decision3.equalsIgnoreCase("yes")){
						reservation.reserveBusinessSeat(newPassenger);
					}else{
						break;
					}
				}
			}
		
		}while(!decision.equalsIgnoreCase("no"));
		
	}
}