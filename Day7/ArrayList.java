class ArrayList implements List, Iterator {
    private static final int INITIAL_CAPACITY = 50;
    private int[] array;
    private int size;
    private int index = 0;

    public ArrayList() {
        array = new int[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    @Override
    public int get(int idx) {
        return this.array[idx];
    }

    public void add(int i) {
        array[size++] = i;
    }

    public int size() {
        return this.index;
    }

	@Override
	public Iterator iterator() {
        return new ArrayListIterator(this);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
	}

	@Override
	public int next() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'next'");
	}    

    
}