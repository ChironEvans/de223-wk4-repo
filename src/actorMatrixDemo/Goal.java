package actorMatrixDemo;

public class Goal extends Actor {
	protected int xPos;
	protected int yPos;
	protected Character actSymbol;
	
	public Goal(Character symbol, int newX, int newY) {		
		super(symbol, newX, newY);
			this.xPos = newX;
			this.yPos = newY;
			this.actSymbol = symbol;	
	}
}
