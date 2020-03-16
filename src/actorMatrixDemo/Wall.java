package actorMatrixDemo;

public class Wall extends Actor {
	protected int xPos;
	protected int yPos;
	protected Character actSymbol;

	public Wall(Character symbol, int newX, int newY) {
		super(symbol, newX, newY);
		this.xPos = newX;
		this.yPos = newY;
		this.actSymbol = symbol;		
	}
}
