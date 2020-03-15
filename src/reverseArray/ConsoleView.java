package reverseArray;

public class ConsoleView implements IView{
	@Override
	public <T> void say(T message) {
		System.out.println(message);
	}

	@Override
	public <T> void add(T message) {
		System.out.print(message);
	}
	

}
