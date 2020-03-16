package actorMatrixDemo;

import java.util.Dictionary;
import java.util.Hashtable;

public class Level {
	// obj[] [] to create object array
	protected String [] [] levelMatrix;
	protected Dictionary<Character, Runnable> objDict = new Hashtable<Character, Runnable>();

	public Level(String[] newMatrix) {
		this.objDict.put('#', () -> new Wall(x, y));
		this.objDict.put('.', () -> new Floor(x, y));
		this.objDict.put('+', () -> new Goal(x, y));
		this.objDict.put('C', () -> new Box(x, y));
		this.objDict.put('P', () -> new Player(x, y));


		int yLen = newMatrix.length;
		int xLen = newMatrix[0].toCharArray().length;
		this.levelMatrix = new String[xLen] [yLen];
		
		//Matrix Traversal!
				//Loop through each row in the array
				for (int i = 0; i < newMatrix.length; i++) {
					int j = 0;
				
					//loop through each column in the row, populate with data from row array
					for (char ch: newMatrix[i].toCharArray()) {
						String s = String.valueOf(ch);  
						this.levelMatrix[i][j] = s;
						j++;
					};
				}
	}
}
