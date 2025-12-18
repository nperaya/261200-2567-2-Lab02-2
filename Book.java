public class Book {
    String title;
    String author;
    double price;

    public Book(){
        this("Unknown","Unknown",10);
//        this.title = "Unknown";
//        this.author = "Unknown";
//        this.price = 10;
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void applyDiscount(double discountPercentage) {

        // ตรวจสอบความถูกต้องของเปอร์เซ็นต์ส่วนลด
        if (discountPercentage <= 0.00 || discountPercentage >= 100.00) {
            System.out.println("Invalid discount percentage: " + discountPercentage);
            return;
        }

        // คำนวณราคาหลังหักส่วนลด
        double discountAmount = price * (discountPercentage / 100);
        price = price - discountAmount;

        // แสดงส่วนลดและราคาใหม่
        System.out.println("Discount " + discountPercentage + "% applied.");
        System.out.println("New price: " + price);
    }
}
