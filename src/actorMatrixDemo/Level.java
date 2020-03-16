package actorMatrixDemo;

import java.util.Hashtable;
import java.util.Map;

public class Level {
	// obj[] [] to create object array
	// Actor is the superclass in this instance, so it is an Actor array
	protected Actor [] [] levelMatrix;
	protected Map<Character, ActorInvoke> objDict = new Hashtable<Character, ActorInvoke>();

	public Level(String[] newMatrix) {	
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


		int yLen = newMatrix.length;
		int xLen = newMatrix[0].toCharArray().length;
		this.levelMatrix = new Actor[xLen] [yLen];
		
		//Matrix Traversal!
				//Loop through each row in the array
				for (int i = 0; i < newMatrix.length; i++) {
					int j = 0;
				
					//loop through each column in the row, populate with data from row array
					for (char ch: newMatrix[i].toCharArray()) {
						Actor aNewActor = this.objDict.get(ch).invoke(ch, j, i);
						this.levelMatrix[i][j] = aNewActor;
						j++;
					};
				}
	}
}
