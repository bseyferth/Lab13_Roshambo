package rockPaperScissors;

public class Mike extends Player{
	
	public Mike(String name) {
		super(name);
		
	}

	@Override
	public Roshambo generateRoshambo() {
		
		return Roshambo.ROCK;
		

	}
	
	

}
