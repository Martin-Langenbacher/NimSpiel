package nimspiel;

public class Haufen {
	
	// attributes
	private int number;
	private int numberOfWoods;
	private boolean active;
	
	
	// constructor
	public Haufen(int number, int numberOfWoods) {
		this.number = number;
		this.numberOfWoods = numberOfWoods;
		this.active = true;
	}

	
	// getter and setter
	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public int getNumber() {
		return number;
	}


	public int getNumberOfWoods() {
		return numberOfWoods;
	}
	
}




