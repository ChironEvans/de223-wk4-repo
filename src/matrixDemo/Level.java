package matrixDemo;

public class Level {
	// obj[] [] to create object array
	protected String [] [] levelMatrix;

	public Level(String[] newMatrix) {
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
