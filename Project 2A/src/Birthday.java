import java.util.Random;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Birthday {
	public static void main(String[] args){
		String name = null, card, balloon;
		String anotherToy="yes"; // If user want another toy
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		/** cost for the plushie */
		 final double PLUSHIE = 25.0; 
		 	/** cost for the book */
		 final double BOOK = 15.0;	 
		 	/** cost for blocks */
		 final double BLOCKS = 20.0;	 
		 	/** cost for a card */
		 final double CARD = 2.95;	 
		 	/** cost for a balloon */
		 final double BALLOON = 6.0;
		 
		String toy = "";		// the toy to purchase
		double totalCost = 0;	// the cost of the entire toy purchase
		int age = 0;		// the age of the child
		
		JOptionPane.showMessageDialog(null,"Welcome to Toy Company\nChoose a toy for your children");
		System.out.println("\tBirthday Gift\n");
		
		Toy obj = new Toy(); //Using multiple class
		
		while(anotherToy.equalsIgnoreCase("yes")){
		int g = -1;
		while(g < 0){
			name = JOptionPane.showInputDialog("Enter the name of the child");
			if(name.length()>0){
				g++;	
			}else{
				JOptionPane.showMessageDialog(null,"Enter name of your child!");
			}
		}
		
		String str = JOptionPane.showInputDialog("How old is the child?(Age 0-7)");
		age = Integer.parseInt(str);
		while(age < 0 || age > 7){
			str = JOptionPane.showInputDialog(null,"Input age is outside the range!\nPlease enter again!(Age 0-7)");
			age = Integer.parseInt(str);
		}
		obj.setAge(age);
		
		toy = JOptionPane.showInputDialog("Choose a toy: a plushie(age 0-2), blocks(age 3-5), or a book(age 4-7)");
		while(ageOK(toy, age) == false){
			toy = JOptionPane.showInputDialog(null,"Age is not ok!\nChoose a toy again: a plushie(age 0-2), blocks(age 3-5), or a book(age 4-7)");
		}
		obj.setToy(toy);
		obj.setCost(toy);
		
		obj.getAge();
		obj.getToy();
		
		card = JOptionPane.showInputDialog("Do you want a card with gift?(yes/no)");
		obj.addCard(card);
		balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift?(yes/no)");
		obj.addBalloon(balloon);
		
		System.out.println("The gift for " + name+" is" +obj.toString());
		
		anotherToy = JOptionPane.showInputDialog("Do you want another toy?(yes/no)");
		totalCost +=obj.getCost();
		}
		
		System.out.println("\nThe total cost of your order is $"+dollar.format(totalCost));
	
		System.out.println("\nOrder number is "+random());
		System.out.println("\nCreated by Ho Chien, Lin");
		System.exit(0);
	}
	//Random 5-digit number method
	public static int random() {
	    Random r = new Random();
	    return 10000 + r.nextInt(90000);
	}
	
	public static boolean ageOK(String toy, int age)
	    {
	    	if (toy.equalsIgnoreCase("plushie") && (age >= 0 && age <= 2))
	    		return true;
	    	else if(toy.equalsIgnoreCase("blocks") && (age >= 3 && age <= 5))
	    		return true;
	    	else if(toy.equalsIgnoreCase("book") && (age >= 4 && age <= 7))
	    		return true;
	    	else
	    		return false;
	    }
	 
}