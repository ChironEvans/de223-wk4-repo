package actorMatrixDemo;

import java.util.Hashtable;
import java.util.Map;

public class Level {
	// obj[] [] to create object array
	// Actor is the superclass in this instance, so it is an Actor array
	protected Actor [] [] levelMatrix;
	protected Map<Character, ActorInvoke> objDict = new Hashtable<Character, ActorInvoke>();

	public Level(String[] newMatrix) {
		// Fill the dictionary with keys to create actors based on characters in the level text
		// ActorInvoke is a custom interface which allows parameters to be passed to the stored functions in the map
		this.objDict.put('#', new ActorInvoke() { 
			@Override
			public Actor invoke(Character s, int x, int y) {
				Actor aNewActor = new Wall(s, x, y);
				return aNewActor;
			};
			});
		this.objDict.put('.', new ActorInvoke() { 
			@Override
			public Actor invoke(Character s, int x, int y) {
				Actor aNewActor = new Floor(s, x, y);
				return aNewActor;
			};
			});
		this.objDict.put('+', new ActorInvoke() { 
			@Override
			public Actor invoke(Character s, int x, int y) {
				Actor aNewActor = new Goal(s, x, y);
				return aNewActor;
			};
			});
		this.objDict.put('C', new ActorInvoke() { 
			@Override
			public Actor invoke(Character s, int x, int y) {
				Actor aNewActor = new Box(s, x, y);
				return aNewActor;
			};
			});
		this.objDict.put('P', new ActorInvoke() { 
			@Override
			public Actor invoke(Character s, int x, int y) {
				Actor aNewActor = new Player(s, x, y);
				return aNewActor;
			};
			});

		// Calculating the dimensions of the level matrix
		// length of i or y(ROWS)
		int yLen = newMatrix.length;
		// length of j or x (COLUMNS)
		int xLen = newMatrix[0].toCharArray().length;
		// Create a matrix to be populated by Actors or appropriate length
		this.levelMatrix = new Actor[xLen] [yLen];
		
		//Matrix Traversal!
		//Loop through each row in the matrix
		for (int i = 0; i < newMatrix.length; i++) {
			int j = 0;
		
			//loop through each column in the row, create object based on char and add to the row
			for (char ch: newMatrix[i].toCharArray()) {
				// Fetch the command in the map at position ch, invoke the command stored there
				// Pass the Actor type (ch), x pos (j) and y pos (y)
				Actor aNewActor = this.objDict.get(ch).invoke(ch, j, i);
				// Add the new Actor object to the matrix
				this.levelMatrix[i][j] = aNewActor;
				// Increment J to keep track of the x position in the row
				j++;
			};
		};
	}
}
