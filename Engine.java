public class Engine {
  private boolean isOn;

  public void startEngine() {
    if (!isOn) {
      this.isOn = true;
      System.out.println("Starting engine!");
    }
  }

  public void stopEngine() {
    if (isOn) {
      this.isOn = false;
      System.out.println("Stoping engine!");
    }
  }

  public void printEngineStatus() {
    System.out.println("Engine is on: " + isOn);
  }

}