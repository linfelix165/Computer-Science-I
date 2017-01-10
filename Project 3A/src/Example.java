import java.util.Random;
import java.util.Scanner;

public class Example {
	public static boolean[] seats;
    public static int totalAssignedFirstClass;
    public static int totalAssignedSecondClass;
    
    public static void main(String[] args){
    	seats = new boolean[11];
    	Scanner in = new Scanner(System.in);
        int selectedClass = 0;

        for (int i = 0; i <= 10; i++)
            seats[i] = false;

        for (int i = 1; i <=10; i++ )
        {
            System.out.println("Please type 1 for First Class or 2 for Economy Class");
            selectedClass = in.nextInt();

            while (selectedClass < 1 || selectedClass > 2)
            {
                System.out.println("Please only enter 1 or 2 for First or Economy Class");
                selectedClass = in.nextInt();
            }

            if (selectedClass == 1)
            {
                if (totalAssignedFirstClass == 5 && totalAssignedSecondClass < 5)
                {
                    System.out.println("Sorry, first class is full. Do you want to get a ticket for economy class? Y-N");
                    String decision = in.nextLine();
                    if (decision.equalsIgnoreCase("no"))
                    {
                        System.out.println("Next plane leaves in 3 hours");
                        i--;
                    }
                    else
                    {
                        assignSecondClass();
                    }
                }
                else if (totalAssignedFirstClass < 5)
                {
                    assignFirstClass();
                }
            }
            else
            {
                if (totalAssignedSecondClass == 5 && totalAssignedFirstClass < 5)
                {
                    System.out.println("Sorry, economy class is full. Do you want to get a ticket for first class? Y-N");
                    String decision = in.nextLine();
                    if (decision.equalsIgnoreCase("no"))
                    {
                        System.out.println("Next plane leaves in 3 hours");
                        i--;
                    }
                    else
                    {
                        assignFirstClass();
                    }
                }                        
                else
                {
                    assignSecondClass();
                }
            }
        }

        System.out.println();
        System.out.println("Sorry, The plane is full. Next one leaves in 3 hours.");
        System.out.println();
    }
    
    public static void assignFirstClass()
    {
        boolean noDuplicate = false;
        Random rand = new Random();
        int index = 0;

        //keep generating the seat number until a FREE seat is assigned
        while (!noDuplicate)
        {
            noDuplicate = true;
            index = 1+rand.nextInt(6);
            if (seats[index] == true)
                noDuplicate = false;
        }
        seats[index] = true;
        totalAssignedFirstClass++;
        System.out.println("Assigned seat "+index);
    }
    
    public static void assignSecondClass()
    {
        boolean noDuplicate = false;
        Random rand = new Random();
        int index = 0;

        //keep generating the seat number until a FREE seat is assigned
        while (!noDuplicate)
        {
            noDuplicate = true;
            index = 1+rand.nextInt(6);
            if (seats[index] == true)
                noDuplicate = false;
        }
        seats[index] = true;
        totalAssignedSecondClass++;
        System.out.println("Assigned seat "+index);
    }
}
