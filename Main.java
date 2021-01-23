class Main {

  public static void main(String[] args) {
    Car myCar = new Car("Mercedes", 2010, "Black", "SL 5050 Roadster");

    System.out.println();

    myCar.printDetails();
    System.out.println();

    myCar.drive(50);
    myCar.drive(10);
    myCar.drive(90);

    int mileage = myCar.getMileage();
    System.out.println(mileage + " km");

    System.out.println();

    myCar.printEngineStatus();
    myCar.startEngine();
    myCar.printEngineStatus();

  }

}