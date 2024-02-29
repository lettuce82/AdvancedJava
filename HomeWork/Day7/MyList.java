import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MyList<E extends Comparable<E>> implements Iterable<E>{
    private List<E> list;

    public MyList(){
        this.list = new ArrayList<>();
    }

    public void sort() {
        Collections.sort(this.list);
    }

    //int가 아닌 다른 걸로 compare 하기 위한 sort 
    public void sort(Comparator<E> comparator) {
        Collections.sort(this.list, comparator);
    }

    public List<E> getList() {
        return this.list;
    }

    public void add(E element) {
        this.list.add(element);
    }

    @Override
    public Iterator<E> iterator() {

        return this.list.iterator();
    }
}
