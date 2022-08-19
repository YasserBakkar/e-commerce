package e.commerce;

import java.time.LocalDate;
import java.time.Month;

public class Test {

    public static void main(String[] args) {

        //adding users
        User yaser = new User("yaser", "Yaser", "Beker", LocalDate.of(1998, Month.OCTOBER, 28),
                "12345", "yaserbeker@gmail.com", "Manisa", "Manisa");
        User mehmet = new User("mehmet", "Mehmet", "Oral", LocalDate.of(1999, Month.MARCH, 6),
                "45678", "mehmetoral@gmail.com", "Manisa", "Izmir");
        User yusuf = new User("yusuf", "Yusuf", "Yunus", LocalDate.of(2001, Month.APRIL, 18),
                "35874", "yusufyunus@gmail.com", "Manisa", "Istanbul");

        //adding products
        Product laptop = new Product("Asus", "Black", "Computer", 15, 240.0, "Laptop gaming");
        Product car = new Product("BMW", "White", "Car", 8, 1400.0, "Germany car");
        Product phone = new Product("iphone", "Blue", "phone", 5, 180.0, "Apple Inc");

        //adding credit cards
        CreditCard yaserCard = new CreditCard(yaser, "2376552481", "987", LocalDate.of(2021, Month.DECEMBER, 6));
        CreditCard mehmetCard = new CreditCard(mehmet, "2345486534", "458", LocalDate.of(2022, Month.FEBRUARY, 21));
        CreditCard yusufCard = new CreditCard(yusuf, "2345424834", "368", LocalDate.of(2022, Month.FEBRUARY, 1));

        //ordering products 
        yaser.orderProduct(laptop, yaserCard, 10);
        yaser.orderProduct(car, yaserCard, 3);
        mehmet.orderProduct(laptop, mehmetCard, 3);
        yusuf.orderProduct(phone, yusufCard, 3);

        //adding favoriteProducts
        yaser.favoriteProducts(car);
        mehmet.favoriteProducts(laptop);
        yusuf.favoriteProducts(phone);

        //purchasing products
        yaser.getOrders().get(0).purchaseOrder();
        yaser.getOrders().get(1).purchaseOrder();

        //******   Output     **********
        
        //number and types of pieces that Yaser is ordered
        for (Order o : yaser.getOrders()) {

            System.out.println("Yaser ordered " + o.getProductCount() + " pieces of " + o.getProduct().getProductName());
        }

        System.out.println("\n***********************\n");

        //Yaser's favorite product
        for (Product p : yaser.getFavoriteProducts()) {
            System.out.println("Yaser's favorite product is: " + p.getProductName());
        }

        System.out.println("\n***********************\n");
        
        //Yusuf's favorite product
        for (Product p : yusuf.getFavoriteProducts()) {
            System.out.println("Yusuf's favorite product is: " + p.getProductName());
        }

        System.out.println("\n***********************\n");
        
        //ProductCount and ProductName is purchased or not purchased for Yaser
        for (Order o : yaser.getOrders()) {
            if (o.isPurchased()) {
                System.out.println(o.getProductCount() + " Piece of " + o.getProduct().getProductName() + " is purchased for Yaser.");
            } else {
                System.out.println(o.getProductCount() + " Piece of " + o.getProduct().getProductName() + " not purchased for Yaser.");
            }
        }
        System.out.println("\n***********************\n");

        //ProductCount and ProductName is purchased or not purchased for Mehmet
        for (Order o : mehmet.getOrders()) {
            if (o.isPurchased()) {
                System.out.println(o.getProductCount() + " Piece of " + o.getProduct().getProductName() + " " + "is purchased for Mehmet.");
            } else {
                System.out.println(o.getProductCount() + " Piece of " + o.getProduct().getProductName() + " not purchased for Mehmet.");
            }
        }

    }

}
