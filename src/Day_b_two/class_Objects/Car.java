//Create a class Car with attributes like brand, model, and price. Write
// methods to display details of a car and calculate the discounted price.

package Day_b_two.class_Objects;

public class Car {

    private String brand;
    private String model;
    private double price;

        public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }


    public double calculateDiscountedPrice(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
        }
        return price - (price * discountPercentage / 100);
    }


    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", 20000);
        myCar.displayDetails();
        double discount = 10;
        System.out.println("Discounted Price: $" + myCar.calculateDiscountedPrice(discount));
    }
}
