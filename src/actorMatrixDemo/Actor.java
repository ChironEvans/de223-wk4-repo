package actorMatrixDemo;


public abstract class Actor {
	// Every Actor will have these attributes
	// Some actors (player, box) will be able to move
	// Some actors (wall, box) will be able to check whether they are being collided with
	// Some actors (player, box) will be able to check whether they are colliding with something
	// An actor (goal) will be able to check whether there is a box resting on it
	// TODO use interfaces to implement these methods into the actors that need them?
	protected int xPos;
	protected int yPos;
	protected Character actSymbol;
	
	public Actor(Character symbol, int newX, int newY) {
		this.xPos = newX;
		this.yPos = newY;
		this.actSymbol = symbol;
	}
}
