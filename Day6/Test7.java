public class Test7 {
    public static void main(String[] args) {
        IDCard card = new IDCard(1, "채상희");
        System.out.println(card.getProductName());

        
        Product p = new Product(1, "채상희");
        Product p2 = new IDCard(1, "채상희");
        //IDCard i = (IDCard)p; -> 불가
        IDCard i2 = (IDCard)p2;
        i2.getInfo();
    }
}
