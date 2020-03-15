package reverseArray;

public class Reverser {
	protected int[] revArray;
	protected int lower;
	protected int upper;
	protected int revI;
	
	public int[] reverseArray(int[] anArray) {
		revArray = new int[anArray.length];
		revArray = anArray;
		this.revI = this.revArray.length - 1;
		for (int i = 0; i < this.revI; i++) {
			
			// Get the upper and lower values from the current scope
			this.lower = this.revArray[i];
			this.upper = this.revArray[revI];
			
			// swap the values in the array
			this.revArray[i] = this.upper;
			this.revArray[revI] = this.lower;
			
			// increment the upper limit down
			this.revI --;
		}
		
		return revArray;
	}
}
