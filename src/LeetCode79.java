public class LeetCode79 {
    static int [] xArrays = {1, -1,0, 0 };
    static int [] yArrays = {0, 0, 1, -1};

    static  boolean exits = false;
    public static void main(String[] args) {
//        char [][] nums = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char [][]nums ={{'a'}};
        System.out.println(exist(nums, "a"));
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                visited[i][j] = true;
                boolean ex = dfs(visited, word, board, String.valueOf(board[i][j]), j, i, 0);
                if(ex) {
                    return true;
                }
                visited[i][j] = false;
            }
        }
        return exits;
    }

    public static boolean dfs(boolean[][] visited, String word, char[][]board, String current, int x, int y, int index) {
        if (current.equals(word)) {
            System.out.println("---");
            exits = true;
            return true;
        }
//        if (index==word.length()) return true;
        if (board[y][x] != word.charAt(index)) {
            return false;
        }
//        if (!word.startsWith(current)) {
//            return false;
//        }
        for (int i = 0; i < 4; i++) {
            int currentX = x + xArrays[i];
            int currentY = y + yArrays[i];

            if(currentX < 0  || currentX >= board[0].length || currentY < 0 || currentY >= board.length || visited[currentY][currentX]) {
                continue;
            }
            visited[currentY][currentX] = true;
            boolean exited = dfs(visited, word, board, current + board[currentY][currentX], currentX, currentY, index + 1);
            if(exited) {
                return true;
            }
            visited[currentY][currentX] = false;
        }

        return false;
    }
}
