import java.util.LinkedList;
import java.util.Queue;

public class Maze {
    public static void main(String[] args) {
        // 5*5 미로
        int[][] maze = {
            {0, 1, 0, 1, 1},
            {0, 1, 1, 0, 1},
            {0, 0, 1, 0, 1},
            {0, 1, 1, 0, 1},
            {0, 1, 0, 0, 0}
        };

        // 출발지 (0, 0)에서 시작하여 도착지 (4, 4)까지의 길이 있는지 확인하는 메서드
        boolean findWay = findWay(maze);
        
        if (findWay) {
            System.out.println("길을 찾았습니다!");
        } else {
            System.out.println("길을 찾지 못 했습니다.");
        }
    }

    static boolean findWay(int[][] maze) {
        int n = maze.length;
        //방문했던 곳인지 확인하기 위한 배열
        boolean[][] visited = new boolean[n][n];
        //다음에 방문할 좌표를 저장하기 위한 큐
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Point currPoint = queue.poll();
            int x = currPoint.x;
            int y = currPoint.y;
            if (x == n - 1 && y == n - 1) {
                return true; // 목적지에 도달한 경우 true 반환
            }
            // 이동 가능한 방향 탐색
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (isValidMove(maze, newX, newY) && !visited[newX][newY]) {
                    queue.offer(new Point(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }
        return false; // 목적지에 도달하지 못한 경우 false 반환
    }

    static boolean isValidMove(int[][] maze, int x, int y) {
        int n = maze.length;
        return x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 0;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 이동 가능한 방향을 상수로 정의
    static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
}
