package youtube;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1Right = false;
		boolean p2Right = false;
		boolean p3Right = false;
		
		int TargetNumber = (int) (Math.random() * 100000);
		System.out.println("I am thinking of number " + TargetNumber);
		int NumberOfRounds = 0;
		while(true) {
			System.out.println("Number to guess is " + TargetNumber);
						
			NumberOfRounds ++;
			
			p1.Guess();
			p2.Guess();
			p3.Guess();
			
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			guessp2 = p2.number;
			System.out.println("Player two guessed "+ guessp2);
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			if (guessp1 == TargetNumber) {
				p1Right = true;
			}
			if (guessp2 == TargetNumber) {
				p2Right = true;
			}
			if (guessp3 == TargetNumber) {
				p3Right = true;
			}
			
			if (p1Right || p2Right || p3Right) {
				System.out.println("We have a winner!");
				System.out.println("Player 1 got it right? " + p1Right);
				System.out.println("Player 2 got it right? " + p2Right);
				System.out.println("Player 3 got it right? " + p3Right);
				System.out.println("Game is over!");
				System.out.println("Number of rounds: " + NumberOfRounds);				
				break;
			}
			else {
				System.out.println("Players will have to try again! ");
			}
		}
	}
	

}




