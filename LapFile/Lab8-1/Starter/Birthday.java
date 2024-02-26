public class Birthday {
    public static void main(String[] args) {
        BoyFriends boys = new BoyFriends();
        boys.add(new BoyFriend("김동찬", 31));
        boys.add(new BoyFriend("김동찬2", 30));
        boys.add(new BoyFriend("김동찬3", 29));

        for (BoyFriend b : boys) {
            b.hear("안녕");
        }
    }
}
