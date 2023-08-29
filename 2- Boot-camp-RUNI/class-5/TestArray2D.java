public class TestArray2D {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        
        int[][] grid = new int[n][m];
        
        for (int i= 0; i < grid.length; i++) {    
			for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]=i);
			}
            System.out.println();
		}
    }
}
