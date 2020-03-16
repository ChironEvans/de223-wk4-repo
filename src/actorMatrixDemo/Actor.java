package actorMatrixDemo;


public abstract class Actor {
	protected int xPos;
	protected int yPos;
	protected Character actSymbol;
	
	public Actor(Character symbol, int newX, int newY) {
		this.xPos = newX;
		this.yPos = newY;
		this.actSymbol = symbol;
	}
}
