import java.util.Scanner;

public class AirLineReservationSystem  
{

    public static void main(String[] args) 
    {
       
      Scanner input = new Scanner(System.in);
      
       boolean reservationFull = false;
       //classchoice represents either Business Class or Economy class seating
       int classChoice;
       int numberOfReservations = 0;
       //One dimensional boolean array to representing the seating chart of the plane
       boolean seatingChart[] = new boolean[49];
       for (int i = 0; i < 49; ++i) 
       {
           //All elements in of the array is initialized to false indicating empty seats
              seatingChart[i] = false;
       }
       while(!reservationFull) 
       {
            System.out.println("Welcome to Airline Passenger Seat Reservation");
            System.out.println("**********************************************");
            System.out.println("Seats are available in Business and Economic class");
        
            System.out.println("1.Business Class");
            System.out.println("2.Economy Class");
            
             
        
            System.out.print("Enter Fare class :");
              classChoice = input.nextInt();
              System.out.println("\n");
              int classChoiceIsFull = -1;
              
              //Where customer chooses Business Class
              if(classChoice == 1) 
              {
                     for(int counter = 0; counter < 8; ++counter) 
                     {
                           if(!seatingChart[counter]) 
                           {
                                  seatingChart[counter] = true;
                                  classChoiceIsFull = counter + 1;
                                  numberOfReservations++;
                                  counter = 8;
                           }
                     }
                     //Where Business class is full
                     if(classChoiceIsFull < 0) {
                           System.out.print("Unfortunately, there are no more seats available on Business Class.");
                           System.out.println("Would you like a seat in Economy class(Y/N)? ");
                           String changeClassChoice;
                           changeClassChoice = input.next();
                           Object counter;
						if(changeClassChoice == "Yes"|| changeClassChoice=="yes"|| changeClassChoice=="y"|| changeClassChoice=="Y")
                           {
                                  for(int counter1 = 0;counter1 < 9; counter1++) 
                                  {
                                         if(!seatingChart[(int) counter1]) 
                                         {
                                                seatingChart[counter1] = true;
                                                classChoiceIsFull = counter1 + 1;
                                                numberOfReservations++;
                                                counter1 = 49;
                                         }
                                  }
                           }
                           else 
                           {
                                  System.out.println("Reservation for next flight starts in an hour.");
                           }
                     }
              }
              //Where customer chooses Economy Class
              if(classChoice == 2) {
                     for(int counter = 8; counter < 49; ++counter) {
                           if(!seatingChart[counter]) {
                                  seatingChart[counter] = true;
                                  classChoiceIsFull = counter + 1;
                                  numberOfReservations++;
                                  counter = 49;
                           }
                     }
                     
                     //Where Economy class is full
                     if(classChoiceIsFull < 0) {
                           System.out.print("Unfortunately, there are no more seats available on Economy Class.");
                           System.out.println("Would you like a seat in the first-class section(Y/N)? ");
                           String changeClassChoice;
                           changeClassChoice = input.next();
                           if(changeClassChoice == "Y") {
                                  for(int counter = 0; counter < 8; ++counter) {
                                         if(!seatingChart[counter]) {
                                                seatingChart[counter] = true;
                                                classChoiceIsFull = counter + 1;
                                                numberOfReservations++;
                                                counter = 8;
                                         }
                                  }
                           }
                           else {
                                  System.out.println("Next flight leaves in 3 hours.");
                           }
                     }
              }
              
              if (classChoiceIsFull > 0) 
              {
                     System.out.println("UNITED FLIGHT D3048" +"\tBoarding Pass" +"\tUNITED FLIGHT D3048");
                     System.out.println("***    ***     ***     ***     ***     ***     ***     ***     ");
                     System.out.print("BOARDS AT: ");
                     System.out.print("3: 15PM "+ "\tMAY 01 2015");
                     System.out.println("\tBOARDING ZONE: 2");
                     System.out.print("Seat Number: " + classChoiceIsFull + "  ");
                     if(classChoiceIsFull < 8) {
                           System.out.println("Fare Class: First Class.\n");
                     }
                     else 
                     {
                          System.out.println("Fare Class: Economy Class.\n");
                     }
              }
              if(numberOfReservations >= 49) 
              {
                     reservationFull = true;
              }
       }
       System.out.println("\n\nThe flight is now full");
       }
}
