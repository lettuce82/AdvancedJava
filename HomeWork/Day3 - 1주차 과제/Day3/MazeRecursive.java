import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MazeRecursive {
    public static void main(String[] args) {
        int[][] maze = Maze.generateMaze();
        printMaze(maze);
        boolean[][] visited = new boolean[maze.length][maze[0].length]; // 방문 여부를 저장하는 배열
        boolean hasPath = findWay(maze, 0, 0, visited);
        if (hasPath) {
            System.out.println("출구에 도착했습니다.");
        } else {
            System.out.println("출구를 찾을 수 없습니다.");
        }
    }

    static boolean findWay(int[][] maze, int x, int y, boolean[][] visited) {
        int m = maze.length;
        int n = maze[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n || maze[x][y] == 1 || visited[x][y]) {
            return false; // 범위를 벗어나거나 벽이거나 이미 방문한 곳인 경우
        }
        if (x == m - 1 && y == n - 1) {
            return true; // 출구에 도착한 경우
        }
        maze[x][y] = 2;
        visited[x][y] = true; // 방문한 곳을 표시
        // 상하좌우로 이동하면서 경로 탐색
        if (findWay(maze, x + 1, y, visited) || findWay(maze, x - 1, y, visited)
                || findWay(maze, x, y + 1, visited) || findWay(maze, x, y - 1, visited)) {
            return true;
        }
        return false;
    }

    static void printMaze(int[][] maze) {
        for (int[] row : maze) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
