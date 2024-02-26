import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class MazeStack {
    public static void main(String[] args) {
        int[][] maze = Maze.generateMaze();
        Maze.printMaze(maze);
        Maze.hasPath(maze);
    }
}

class Maze  {
    static void hasPath(int[][] maze) {
        boolean hasPath = findWay(maze);
        if (hasPath) {
            System.out.println("출구에 도착했습니다.");
        } else {
            System.out.println("출구를 찾을 수 없습니다.");
        }
    }

    static boolean findWay(int[][] maze) {
        int[] dirX = {1, -1, 0, 0};
        int[] dirY = {0, 0, 1, -1};
        int currentX = 0;
        int currentY = 0;
        int endX = maze.length - 1;
        int endY = maze[0].length - 1;

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{currentX, currentY});

        while (!stack.isEmpty()) {
            int[] currentPosition = stack.pop();
            currentX = currentPosition[0];
            currentY = currentPosition[1];
            if (currentX == endX && currentY == endY) {
                return true; // 출구에 도착한 경우
            }
            maze[currentX][currentY] = 2; // 방문한 곳을 표시
            for (int i = 0; i < 4; i++) {
                int nextX = currentX + dirX[i];
                int nextY = currentY + dirY[i];
                if (nextX >= 0 && nextX < maze.length && nextY >= 0 && nextY < maze[0].length && maze[nextX][nextY] == 0) {
                    stack.push(new int[]{nextX, nextY});
                }
            }
            printMaze(maze);
        }
        return false; // 출구를 찾을 수 없는 경우
    }

    static int[][] generateMaze() {
        Scanner sc = new Scanner(System.in);
        System.out.print("미로의 가로 크기를 입력해 주세요.: ");
        int n;
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요.");
            return generateMaze();
        }
        System.out.print("미로의 세로 크기를 입력해 주세요.: ");
        int m;
        try {
            m = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요.");
            return generateMaze();
        }
        sc.close();

        int[][] array = new int[m][n];
        Random random = new Random();

        // 배열 요소를 랜덤하게 0 또는 1로 초기화
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(2); // 0 또는 1 중 랜덤으로 선택
            }
        }

        return array;
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