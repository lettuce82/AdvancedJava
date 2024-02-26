import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    static final int SIZE = 3; // 오목판의 크기
    static final char USER_MARK = 'O'; // 사용자의 표식
    static final char COMPUTER_MARK = 'X'; // 컴퓨터의 표식
    static final char EMPTY_MARK = ' '; // 빈 공간을 나타내는 표식

    public static void main(String[] args) {
        gameStart();
    }

    static void gameStart() {
        char[][] board = new char[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean userTurn = true; // 사용자의 차례인지를 나타내는 변수

        initializeBoard(board); // 오목판 초기화

        // 게임 루프
        while (true) {
            printBoard(board); // 오목판 출력
            // 사용자의 차례
            if (userTurn) {
                userMove(board, scanner);
                if (checkWin(board, USER_MARK)) {
                    System.out.println("사용자 승");
                    break;
                }
            } else {
                computerMove(board, random);
                if (checkWin(board, COMPUTER_MARK)) {
                    System.out.println("컴퓨터 승");
                    break;
                }
            }

            // 오목판이 가득 찼는지 확인
            if (isBoardFull(board)) {
                System.out.println("무승부");
                break;
            }

            userTurn = !userTurn; // 차례 변경
        }

        scanner.close();
    }

    // 오목판 초기화 메서드
    static void initializeBoard(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY_MARK;
            }
        }
    }

    // 오목판 출력 메서드
    static void printBoard(char[][] board) {
        System.out.println("-----");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    // 사용자의 표식을 놓는 메서드
    static void userMove(char[][] board, Scanner scanner) {
        int x, y;
        do {
            System.out.print("사용자 턴(x y): ");
            try {
                x = scanner.nextInt();
                y = scanner.nextInt();
                // 이미 놓인 위치인지 확인
                if (!isValidMove(board, x, y)) {
                    System.out.println("이미 놓인 위치입니다. 다시 입력하세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요."); // 숫자가 아닌 값을 입력했을 때 메시지 출력
                scanner.nextLine(); // 입력 버퍼 비우기
                x = -1; // 잘못된 입력을 나타내는 값으로 설정
                y = -1;
            }
        } while (!isValidMove(board, x, y));
        board[y][x] = USER_MARK;
    }

    // 컴퓨터의 표식을 놓는 메서드
    static void computerMove(char[][] board, Random random) {
        int x, y;
        do {
            System.out.println("컴퓨터 턴");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isValidMove(board, x, y));
        board[y][x] = COMPUTER_MARK;
    }

    // 유효한 위치인지 확인하는 메서드
    static boolean isValidMove(char[][] board, int x, int y) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && board[y][x] == EMPTY_MARK;
    }

    // 승리 조건을 확인하는 메서드
    static boolean checkWin(char[][] board, char mark) {
        // 가로, 세로 체크
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) return true;
            if (board[0][i] == mark && board[1][i] == mark && board[2][i] == mark) return true;
        }

        // 대각선 체크
        if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) return true;
        if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) return true;

        return false;
    }

    // 오목판이 가득 찼는지 확인하는 메서드
    static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY_MARK) {
                    return false;
                }
            }
        }
        return true;
    }
}
