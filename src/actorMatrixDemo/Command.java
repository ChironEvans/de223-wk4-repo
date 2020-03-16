package actorMatrixDemo;

public interface Command {
	    Actor invoke(Character symbol, int x, int y);
}
