package actorMatrixDemo;


public abstract class Actor {
	protected int xPos;
	protected int yPos;
	
	public Actor(int newX, int newY) {
		this.xPos = newX;
		this.yPos = newY;
	}
}
