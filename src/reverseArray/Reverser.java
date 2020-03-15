package reverseArray;

public class Reverser {
	protected int[] revArray;
	protected int lower;
	protected int upper;
	protected int reverseI;
	public int[] reverseArray(int[] anArray) {
		revArray = new int[anArray.length];
		revArray = anArray;
		this.reverseI = this.revArray.length - 1;
		//(Math.floorDiv((revArray.length - 1), 2))
		for (int i = 0; i < this.reverseI; i++) {	
			this.lower = this.revArray[i];
			this.upper = this.revArray[reverseI];
			this.revArray[i] = this.upper;
			this.revArray[reverseI] = this.lower;
			// System.out.println(String.format("Swapping $% at %$ with $% at $%", this.lower, i, this.upper, this.reverseI));
			this.reverseI --;
		}
		
		return revArray;
	}
}
