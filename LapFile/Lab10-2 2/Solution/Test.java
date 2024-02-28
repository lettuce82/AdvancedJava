public class Test {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        List list2 = new LinkedList();
        
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));

        List list3 = new ArrayList<String>();
        list3.add("ArrayList");
        list3.add("ArrayList");
        list3.add("ArrayList");

        System.out.println(list3.get(0));
        System.out.println(list3.get(1));
        System.out.println(list3.get(2));

        List list4 = new LinkedList<String>();
        list4.add("LinkedList");
        list4.add("LinkedList");
        list4.add("LinkedList");

        System.out.println(list4.get(0));
        System.out.println(list4.get(1));
        System.out.println(list4.get(2));

    }
}
