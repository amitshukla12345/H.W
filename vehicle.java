// Base class
class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

// Movable interface
interface Movable {
    void move();
}

// Flyable interface
interface Flyable {
    void fly();
}

// Aeroplane class that extends Vehicle and implements Movable and Flyable
class Aeroplane extends Vehicle implements Movable, Flyable {
    private int wingspan;

    public Aeroplane(String brand, int year, int wingspan) {
        super(brand, year);
        this.wingspan = wingspan;
    }

    @Override
    public void move() {
        System.out.println("The aeroplane is taxiing on the runway.");
    }

    @Override
    public void fly() {
        System.out.println("The aeroplane is flying in the sky.");
    }

    public int getWingspan() {
        return wingspan;
    }
}

// Main class to run the program
class Main {
    public static void main(String[] args) {
        Aeroplane myAeroplane = new Aeroplane("Boeing", 2022, 60);
        
        System.out.println("Brand: " + myAeroplane.getBrand());
        System.out.println("Year: " + myAeroplane.getYear());
        System.out.println("Wingspan: " + myAeroplane.getWingspan() + " meters");
        
        myAeroplane.move();
        myAeroplane.fly();
    }
}
