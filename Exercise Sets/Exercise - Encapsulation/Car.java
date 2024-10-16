public class Car {
//PRIVATE PROPERTIES
    private String color;
    private double price;
    private char size;

//CONSTRUCTOR
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

//GETTER METHOD
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    public char getSize() {
        return size;
    }

//SETTER METHOD
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

//toString () METHOD
    public String toString() {
        String sizeDescriptor;
        switch (size) {
            case 'S':
                sizeDescriptor = "small";
                break;
            case 'M':
                sizeDescriptor = "medium";
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
            default:
                sizeDescriptor = "unknown";
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }
//MAIN METHOD (FOR TESTING)
    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'm');
        System.out.println(car1);
        Car car2 = new Car("blue", 50000.00, 'l');
        System.out.println(car2); 
    }
}
