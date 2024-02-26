import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class BoyFriends implements Iterable<BoyFriend> {
    private List<BoyFriend> List = new ArrayList<>();

    public void add(BoyFriend boy) {
        this.List.add(boy);
    }

    public void remove(int index) {
        this.List.remove(index);
    }

    @Override
    public Iterator<BoyFriend> iterator() {
        return this.List.iterator();
    }
}
