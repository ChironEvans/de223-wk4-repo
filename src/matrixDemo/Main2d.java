package matrixDemo;

public class Main2d {

	public static void main(String[] args) {
		// Initialize a matrix of strings (depricated)
		// String[] [] level = new String[5] [5];
		
		// Initialize an array of strings to fill part of the matrix
		String[] row = new String[5];
		row[0] = "#####";
		row[1] = "#.+.#";
		row[2] = "#.C.#";
		row[3] = "#P..#";
		row[4] = "#####";
		
		
		Level newLevel = new Level(row);
		print2D(newLevel.levelMatrix);
	}
	public static void print2D(String mat[][]) 
    { 
        // Loop through all rows 
        for (int i = 0; i < mat.length; i++) {
  
            // Loop through all elements of current row 
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            } 
            System.out.print("\n");
        }
    } 

}
