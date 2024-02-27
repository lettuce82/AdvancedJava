import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PokerGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 플레이어 수 입력 받기
        System.out.print("플레이어 수를 입력하세요: ");
        int numPlayers = scanner.nextInt();

        // 게임 실행
        Game game = new Game(numPlayers);
        game.play();
    }
}