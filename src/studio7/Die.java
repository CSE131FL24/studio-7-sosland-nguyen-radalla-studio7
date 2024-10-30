package studio7;

public class Die {
	
	private int sides;

	public Die (int n) {
		this.sides = n;
			
		}
	public int DieRoll () {
		return (int) (Math.random()* sides) + 1;
		

	}
		public String toString () {
			return  "Sides: " + sides;
			
		}
		
	
		
		
	}

