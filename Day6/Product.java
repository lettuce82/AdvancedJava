public class Product {
    protected int productNo;
    protected String productName;

    public Product(int productNo, String productName) {
        this.productNo = productNo;
        this.productName = productName;
    }

    public int getProductNo() {
        return this.productNo;
    }

    public String getProductName() {
        return this.productName;
    }
}
