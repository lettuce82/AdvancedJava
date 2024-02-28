public class ArrayListIterator implements Iterator{
    private ArrayList list;
    private int index;

    ArrayListIterator(ArrayList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return (this.list.size() > this.index) ? true : false;
          
    }

    @Override
    public int next() {
        return this.list.get(this.index++);
    }
    
}
