package e.commerce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private String userName;
    private String name;
    private String surName;
    private LocalDate dateOfBirth;
    private String password;
    private String emailAddress;
    private String homeAddress;
    private String workAddress;
    private Set<Product> favoriteProducts;
    private List<Product> orderedProducts;
    private Set<CreditCard> creditCards;
    private List<Order> orders;

    public User(String userName, String name, String surName, LocalDate dateOfBirth, String password,
            String emailAddress, String homeAddress, String workAddress) {
        this.userName = userName;
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.setFavoriteProducts(new HashSet<>());
        this.setOrderedProducts(new ArrayList<>());
        this.setCreditCards(new HashSet<>());
        this.setOrders(new ArrayList<>());
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public Set<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(Set<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void favoriteProducts(Product product) {
        this.favoriteProducts.add(product);
    }

    public void orderProduct(Product product, CreditCard creditCard, int productCount) {
        if (this.creditCards.contains(creditCard)) {
            Order order = new Order(productCount, this, creditCard, product);
            this.orders.add(order);
            this.orderedProducts.add(product);
        } else {
            throw new IllegalStateException("User doesn't have that creditcard!");
        }
    }
}
