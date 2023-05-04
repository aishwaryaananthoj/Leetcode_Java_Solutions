class Solution {
    public int closedIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int closedIsland =0;
        if(grid==null || grid.length==0)
            return 0;
        for (int i = 1; i < row-1; i++) {
            for (int j = 1; j < col-1; j++) {
                if(grid[i][j]==0){
                    if(isClosedIsland(grid, i, j, row, col))
                        closedIsland++;
                }
            }
        }
        return closedIsland;
    }
    public boolean isClosedIsland(int[][] grid, int i,int j,int row, int col)
    {
        //1 is water, 0 is land , -1 is visited node
        if(grid[i][j]==-1 || grid[i][j]==1)
            return true;
        if(isOnBorder(row,col, i,j))
            return false;
        grid[i][j]=-1;
        boolean left=isClosedIsland(grid, i, j-1, row, col);
        boolean right=isClosedIsland(grid, i, j+1, row, col);
        boolean top=isClosedIsland(grid, i-1, j, row, col);
        boolean bottom=isClosedIsland(grid, i+1, j, row, col);
        return left && right && top && bottom;

    }
    public boolean isOnBorder(int row,int col,int i,int j){
        return i==0 || j==0 || i==row-1 || j==col-1;
    }
}