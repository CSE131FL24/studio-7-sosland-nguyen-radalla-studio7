package studio7;

public class Fraction {
	private int numerator; 
	private int denominator; 

		
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator; 
		this.denominator = denominator; 
		simplify();
	
	}
	public Fraction add(Fraction other) {
		int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
		int newDenominator = this.denominator * other.denominator; 
	return new Fraction(newNumerator, newDenominator);
	}
	public Fraction multiply(Fraction other) {
		int  newNumerator = this.numerator * other.numerator; 
		int newDenominator = this.denominator * other.denominator; 
	return new Fraction(newNumerator, newDenominator);
		
	}
	public Fraction recipricol() {
		return new Fraction(this.denominator, this.numerator);
	}
	
	private void simplify() { 	//gcd == greatest common denominator
		int gcd = gcd(numerator, denominator); 
		numerator /= gcd;
		denominator /= gcd; 
		
		//making sure denominator is always positive
		if (denominator < 0) {
		numerator = -numerator;
		denominator = -denominator; 
		}
	}
	private int gcd(int a, int b) {
		if (b==0) {
			return Math.abs(a);
		}
		return gcd (b, a % b);
	}
}



