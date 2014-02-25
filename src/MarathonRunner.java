/**
 * A simple class to test for condition coverage 
 * @author chris meudec
 */
public class MarathonRunner {
	/**
	 * Minimum allowed age of a MarathonRunner
	 */
	private static final int MIN_AGE = 16;
	/**
	 * Maximum allowed age of a MarathonRunner
	 */
	private static final int MAX_AGE = 101;
	/**
	 * age in years
	 */
	private int age;
	/**
	 * percentage of fuel
	 */
	private int fuel;
	/**
	 * @return age of the runner
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age of the runner between {@value #MIN_AGE} and {@value #MAX_AGE} 
	 * @throws IllegalArgumentException
	 */
	private void setAge(int age) {
		if (age >= MarathonRunner.MIN_AGE && age <= MarathonRunner.MAX_AGE) {
			this.age = age;
		}
		else throw new IllegalArgumentException("age must be between" + MIN_AGE + " and " + MAX_AGE + " years");
	}
	/**
	 * @return percentage on board 
	 */
	public int getFuel() {
		return fuel;
	}
	/**
	 * @param fuel percentage on board
	 * @throws IllegalArgumentException
	 */
	private void setFuel(int fuel) {
		if (fuel >= 0 && fuel <= 100) {
			this.fuel = fuel;
		}
		else throw new IllegalArgumentException("fuel must be between 0 and 100 percent");
	}
	MarathonRunner(int age, int fuel) {
		this.setAge(age);
		this.setFuel(fuel);
	}
	/**
	 * @return the quotien of the marathon runner
	 */
	int getQuotient() {
		if (this.fuel >= 50)
			if (this.age < 30) return this.age + this.fuel;
			else return this.age;
		else return this.age + this.fuel;		
	}
}

