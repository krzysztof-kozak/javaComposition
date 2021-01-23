public class Car {

  private String brand;
  private int year;
  private String color;
  private String model;

  private int mileage;

  Engine carEngine = new Engine();


  Car(String brand, int year, String color, String model) {
    this.brand = brand;
    this.year = year;
    this.color = color;
    this.model = model;
  }

  public void drive(int km) {
    mileage += km;
  }

  public int getMileage() {
    return mileage;
  }

  public void startEngine() {
    carEngine.startEngine();
  }

    public void printEngineStatus() {
    carEngine.printEngineStatus();
  }

  public void printDetails() {
    System.out.println("Brand: " + this.brand);
    System.out.println("Model: " + this.model);
    System.out.println("Year: " + this.year);
    System.out.println("Color: " + this.color);
  }
}