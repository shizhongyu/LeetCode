package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T77 {
    static List<List<Integer>> result = new ArrayList<>();
    static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        dfs(n, k, 1);
        return result;
    }

    public static void dfs(int n, int k, int inddex) {
        if(list.size() == k) {
            result.add(new ArrayList<>(list));
            return ;
        }
        for (int i = inddex; i <= n - (k - list.size()) + 1; i++) {
            list.add(i);
            dfs(n, k, i + 1);
            list.removeLast();
        }
    }

}
