package rockPaperScissors;

public abstract class Player {
	
	private String name;
	
	//generates a Roshambo Response
	abstract public Roshambo generateRoshambo();

	//getter for name
	public String getName() {
		return name;
	}

	//constructor
	public Player(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	
	
	
}
