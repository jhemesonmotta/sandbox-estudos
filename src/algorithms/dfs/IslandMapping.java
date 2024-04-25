package algorithms.dfs;

public class IslandMapping {
    public static int countIslands(int[][] map) {
        if (map == null || map.length == 0) return 0;

        int count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {
                    dfs(map, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(int[][] map, int i, int j) {
        if (i < 0 || i >= map.length || j < 0 || j >= map[i].length || map[i][j] != 1) {
            return;
        }

        map[i][j] = 0; // alternativamente, eu poderia ter uma outra matriz para marcar oq ja foi visitado

        dfs(map, i + 1, j);
        dfs(map, i - 1, j);
        dfs(map, i, j + 1);
        dfs(map, i, j - 1);
    }

    public static void main(String[] args) {
        int[][] map = {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        System.out.println("Number of islands: " + countIslands(map));
    }
}

