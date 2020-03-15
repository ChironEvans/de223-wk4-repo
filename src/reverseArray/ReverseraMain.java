package reverseArray;

public class ReverseraMain {
	public static void main(String[] args) {
		IView view = new ConsoleView();
		ReverseController rc = new ReverseController(view);
		rc.go();
	}
}
