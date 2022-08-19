package e.commerce;

public class Product {

    private String productName;
    private String productColor;
    private String productCategory;
    private long productStockInfo;
    private Double productWeight;
    private String productDescriptionInfo;

    
    
    public Product(String productName, String productColor, String productCategory, long productStockInfo, Double productWeight, String productDescriptionInfo) {

        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockInfo = productStockInfo;
        this.productWeight = productWeight;
        this.productDescriptionInfo = productDescriptionInfo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public long getProductStockInfo() {
        return productStockInfo;
    }

    public void setProductStockInfo(long productStockInfo) {
        this.productStockInfo = productStockInfo;
    }

    public Double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescriptionInfo() {
        return productDescriptionInfo;
    }

    public void setProductDescriptionInfo(String productDescriptionInfo) {
        this.productDescriptionInfo = productDescriptionInfo;
    }

    public void decreasedStockInfo(int number) {
        this.productStockInfo = this.productStockInfo - number;
    }
}
