public class IDCard extends Product {
    public IDCard(int productNo, String productName) {
        super(productNo, productName);
    }

    @Override
    public String getProductName() {
        return "카드 소유자: " + this.productName;
    }

    public String getInfo() {
        return this.productNo + ", " + this.productName;
    }
}
