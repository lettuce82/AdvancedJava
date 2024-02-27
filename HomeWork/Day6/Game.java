import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private int numPlayers;

    public Game(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void play() {
        // 카드 덱 생성
        List<Card> deck = createDeck();
        Collections.shuffle(deck);

        // 플레이어 생성 및 카드 나눠주기
        List<Player> players = createPlayers(deck);

        // 플레이어들의 카드 출력 및 원페어, 투페어 확인
        for (Player player : players) {
            System.out.println(player.getPlayerId() + ": " + player.getHand());
            checkPairs(player);
        }
    }

    // 카드 덱 생성 메소드
    private List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (int number = 2; number <= 14; number++) {
                deck.add(new Card(number, suit));
            }
        }
        return deck;
    }

    // 플레이어 생성 메소드
    private List<Player> createPlayers(List<Card> deck) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            Player player = new Player("Player " + (i + 1));
            List<Card> hand = new ArrayList<>(deck.subList(i * 5, (i + 1) * 5));
            player.setHand(hand);
            players.add(player);
        }
        return players;
    }

    // 원페어, 투페어 확인 메소드
    private void checkPairs(Player player) {
        List<Card> hand = player.getHand();
        int[] counts = new int[15]; // 숫자 카운트 배열 (인덱스 2부터 사용)

        // 각 숫자별 카드 수 세기
        for (Card card : hand) {
            counts[card.getNumber()]++;
        }

        // 원페어, 투페어 확인
        boolean onePair = false;
        boolean twoPair = false;
        for (int count : counts) {
            if (count == 2) {
                if (!onePair) {
                    onePair = true;
                } else {
                    twoPair = true;
                }
            }
        }

        // 결과 출력
        if (twoPair) {
            System.out.println("투페어!");
        } else if (onePair) {
            System.out.println("원페어!");
        } else {
            System.out.println("(이번 판은 죽자!)");
        }
    }
}