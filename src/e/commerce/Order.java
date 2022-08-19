package e.commerce;

public class Order {

    private int productCount;
    private boolean isPurchased;
    private CreditCard creditCard;
    private User user;
    private Product product;

    public Order(int productCount, User user, CreditCard creditCard, Product product) {

        this.productCount = productCount;
        this.isPurchased = false;
        this.user = user;
        this.creditCard = creditCard;
        this.product = product;
        user.getOrderedProducts().add(product);
    }

    public long getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setPurchased(boolean isPurchased) {
        this.isPurchased = isPurchased;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void purchaseOrder() {
        product.decreasedStockInfo(productCount);
        this.isPurchased = true;
    }
}
