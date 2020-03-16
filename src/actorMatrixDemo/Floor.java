package actorMatrixDemo;

public class Floor extends Actor {
	protected int xPos;
	protected int yPos;
	protected Character actSymbol;
	
	public Floor(Character symbol, int newX, int newY) {
		super(symbol, newX, newY);
		this.xPos = newX;
		this.yPos = newY;
		this.actSymbol = symbol;
	}
}
