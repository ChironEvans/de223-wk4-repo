package actorMatrixDemo;

public class Box extends Actor {
	protected int xPos;
	protected int yPos;
	protected Character actSymbol;

	
	public Box(Character symbol, int newX, int newY) {
		super(symbol, newX, newY);
		this.xPos = newX;
		this.yPos = newY;
		this.actSymbol = symbol;	
	}
}
