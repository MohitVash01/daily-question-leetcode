import java.util.HashSet;

class Solution {
    public boolean isMagicalGrid(int grid[][] , int r,int c)
    {
        //check uniqueness it should be 1 to 9 and distinct
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int num=grid[r+i][c+j];
            
                if(num<1 || num>9 || hs.contains(num))
                {
                    return false;
                }
                else 
                {
                    hs.add(num);
                }
            }
        }

        //checking sum for rows and columns 
        int sum= grid[r][c] + grid[r][c+1] + grid[r][c+2];

        for(int i=0;i<3;i++)
        {
            if(grid[r+i][c] + grid[r+i][c+1] + grid[r+i][c+2] != sum)
            {
                return false;
            }
            if(grid[r][c+i] + grid[r+1][c+i] + grid[r+2][c+i] != sum)
            {
                return false;
            }
        }
      //checking sum for diagonal and antidiagonal
            if(grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2] != sum)
            {
                return false;
            }
            else if(grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c] != sum)
            {
                return false;
            }
        return true;

    }

    public int numMagicSquaresInside(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        int count=0;

        for(int i=0;i<=rows-3;i++)
        {
            for(int j=0;j<=cols-3;j++)
            {
                if(isMagicalGrid(grid,i,j))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
