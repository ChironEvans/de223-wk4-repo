package reverseArray;

public class ReverseController {
	protected IView myView;
	
	 public ReverseController( IView theView ){
	 this.myView = theView;
	 }
	public void go() {
		Reverser reverser = new Reverser();
		int[] testArray = {1, 2, 3, 4, 5, 6};
		int[] reversedArray = reverser.reverseArray(testArray);
		for (int n : reversedArray) {
			this.myView.add(n + ", ");
		}
		
	}
}
