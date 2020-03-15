package reverseArray;

public class ReverserMain {
	public static void main(String[] args) {
		IView view = new ConsoleView();
		ReverseController rc = new ReverseController(view);
		rc.go();
	}
}
