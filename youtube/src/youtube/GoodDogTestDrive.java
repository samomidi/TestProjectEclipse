package youtube;
import java.util.Scanner;

public class GoodDogTestDrive {

	public static void main(String[] args) {
		
		
	
	
	while (true) {	
		
	
		
		System.out.print("Enter the size of the first dog: ");
		
		Scanner dogOneSize = new Scanner(System.in);
		int myLine1 = dogOneSize.nextInt();
				
		GoodDog one = new GoodDog();
		one.setSize(myLine1);
		
		
		System.out.print("Enter the size of the second dog: ");
		
		Scanner dogTwoSize = new Scanner(System.in);
		int myLine2 = dogTwoSize.nextInt();
		
		GoodDog two = new GoodDog();
		two.setSize(myLine2);
		
		System.out.println("Dog one: " + one.getSize());
		System.out.println("Dog two: " + two.getSize());
		
		one.bark();
		two.bark();
		
		System.out.print("Want to continue?(y/n)");
		Scanner keyboard = new Scanner(System.in);
		String repeat = keyboard.nextLine();
		
		if (repeat.equals("n")) {
			
			System.out.print("Program is exiting...");
			break;
		}
	}
	}
}
