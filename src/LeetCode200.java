public class LeetCode200 {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '0', '0', '0'},{'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'} };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int lands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    lands++;
                    dfs(grid, i, j);
                }
            }
        }
        return lands;
    }

    public static void dfs(char[][]grid, int x, int y) {
        if(!isLands(grid, x, y)) {
           return;
        }
        grid[x][y] = '0';
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x , y + 1);
        dfs(grid, x, y - 1);

    }

    public static boolean isLands(char[][] grid, int x , int y) {
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == '0') {
            return false;
        }
        return true;
    }
}
