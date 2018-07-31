package rockPaperScissors;

public class Lebron extends Player{

	public Lebron(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Roshambo generateRoshambo() {
		
		int random = (int) (Math.random()*3)+1;
		
		if(random == 1) {
			return Roshambo.ROCK;
		} else if (random == 2) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
		

	}
}
