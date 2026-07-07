class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i = 0; i < 2; i++){
            for(int j=0;j<2;j++){
                int whiteCount = 0;
                whiteCount += grid[i][j] == 'W' ? 1 : 0;
                whiteCount += grid[i][j+1] == 'W' ? 1 : 0;
                whiteCount += grid[i+1][j] == 'W' ? 1 : 0;
                whiteCount += grid[i+1][j+1] == 'W' ? 1 : 0;

                if(whiteCount != 2){
                    return true;
                }
            }
        }

        return false;
    }
}