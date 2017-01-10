 public class ReservationPortal
{
    public static final int ECONOMY_SECTION = 1;
    public static final int BUSINESS_SECTION = 2;
    private final int MAX_ECONOMY_SEATS = 4;
    private final int MAX_BUSINESS_SEATS = 2;
    
    public static int confirmationCount = 0;
    private Passenger economyPassengers[];
    private Passenger businessPassengers[];
    private int economyPassengersCount;
    private int businessPassengersCount; 
    
    public ReservationPortal()
    {
        economyPassengers = new Passenger[ MAX_ECONOMY_SEATS ];
        businessPassengers = new Passenger[ MAX_BUSINESS_SEATS ];
        economyPassengersCount = 0;
        businessPassengersCount = 0;
    }
    
    public boolean economyClassFull()
    {
        return economyPassengersCount == MAX_ECONOMY_SEATS;
    }
    
    public boolean businessClassFull()
    {
        return businessPassengersCount == MAX_BUSINESS_SEATS;
    }
    
    public boolean reserveEconomySeat( Passenger newPassenger )
    {
        if( economyClassFull() )
            return false;
            
        economyPassengers[ economyPassengersCount++ ] = newPassenger;
        return true;
    }
    
    public boolean reserveBusinessSeat(  Passenger newPassenger )
    {
        if( businessClassFull() )
            return false;
            
        businessPassengers[ businessPassengersCount++ ] = newPassenger;
        return true;
    }
}
