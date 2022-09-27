import java.util.*;

/**
 * 有时间可以看下这个https://leetcode.com/problems/word-search-ii/submissions/
 */
public class LeetCode212 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};
        findWords(board, words);
    }

    public static List<String> findWords(char[][] board, String[] words) {
        List<String> results = new ArrayList<>();
        if (board == null || words == null || words.length == 0) {
            return results;
        }


        Set<String> wordsSet = new TreeSet<>();
        Set<String> prefixSet = new HashSet<>();
        Set<String> resultSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            wordsSet.add(str);
            for (int j = 1; j <= str.length(); j++) {
                prefixSet.add(str.substring(0, j));
            }
        }

        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                visited[i][j] = true;
                dfs(board, i, j, prefixSet, resultSet, wordsSet, String.valueOf(board[i][j]), visited);
                visited[i][j] = false;
            }
        }
        System.out.println(resultSet);
        results.addAll(resultSet);
        return results;
    }

    private static void dfs(char[][] board, int x, int y, Set<String> prefixSet, Set<String> resultSet, Set<String> wordsSet, String current, boolean[][] visited) {
        if (!prefixSet.contains(current)) {
            return;
        }

        if (wordsSet.contains(current)) {
            resultSet.add(current);
        }

        for (int i = 0; i < 4; i++) {
            int adjustX = x + dx[i];
            int adjustY = y + dy[i];
            if (!valid(board, visited, adjustX, adjustY)) {
                continue;
            }
            visited[adjustX][adjustY] = true;
            dfs(board, adjustX, adjustY, prefixSet, resultSet, wordsSet, current + board[adjustX][adjustY], visited);
            visited[adjustX][adjustY] = false;
        }
    }

    private static boolean valid(char[][] board, boolean[][] visited, int x, int y) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || visited[x][y]) {
            return false;
        }
        return true;
    }
}
