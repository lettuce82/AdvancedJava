public interface Iterator {
    //다음 데이터가 있으면 true, 없으면 false를 반환한다.
    boolean hasNext();
    //현재 데이터를 읽고, 다음 데이터로 이동
    int next();
}
