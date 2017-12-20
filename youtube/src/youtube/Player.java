package youtube;

public class Player {
	int number = 0;
	
	public void Guess() {
		number = (int) (Math.random() * 100000);
		System.out.println("I am guessing " + number);
		
	}
}
