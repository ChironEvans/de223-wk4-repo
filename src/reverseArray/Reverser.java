package reverseArray;

public class Reverser {
	protected int[] revArray;
	protected int lower;
	protected int upper;
	
	public int[] reverseArray(int[] anArray) {
		this.revArray = new int[anArray.length];
		this.revArray = anArray;
		int revI = this.revArray.length - 1;
		for (int i = 0; i < revI; revI --, i++) {
			
			// Get the upper and lower values from the current scope
			this.lower = this.revArray[i];
			this.upper = this.revArray[revI];
			
			// swap the values in the array
			this.revArray[i] = this.upper;
			this.revArray[revI] = this.lower;
		}
		
		return revArray;
	}
}
