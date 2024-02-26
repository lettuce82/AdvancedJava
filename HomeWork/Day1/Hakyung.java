public class Hakyung {
    public static void main(String[] args) {
        

    //static final 
    int[][] maze = {
        {0, 1, 0, 1, 0},
        {0, 1, 1, 1, 0},
        {0, 0, 0, 1, 0},
        {0, 1, 0, 1, 0},
        {0, 1, 0, 0, 0},
    };

    int startX = 0;
    int startY = 0;


    if (findPath(maze, startX, startY)) {
        System.out.println("Escape!");
    } else {
        System.out.println("No Escape!");
    }
}

    public static boolean findPath(int[][] maze, int X, int Y) {
        if (X == maze.length -1 && Y == maze[0].length -1) {
            System.out.println("Success!");
            return true;
        } 
            
        if (X < 0 || X >= maze.length || Y < 0 || Y >= maze[0].length || maze[X][Y] == 1) {
            return false;
            

        }

        maze[X][Y] = 1;

        if (findPath(maze, X + 1, Y) || findPath(maze, X - 1, Y) || findPath(maze, X, Y + 1) || findPath(maze, X, Y - 1)) {
            return true;
        }
        return false;
}
}