package geunhokim.Bus;

public abstract class Transit {

    // properties
    int passengerMaximum;
    int passengerNow;
    int charge;
    int busNumber;
    int amountOil = 100;
    int speedNow = 0;
    String state = "차고지행";

    // 기능 methods
    abstract void run();
    abstract void stateChange(int amountOil);

    abstract void passengerRiding(int passengerNumber);
    abstract void PassengerNow(int passengerNow);
    abstract void busState(String state);

    abstract void speedChange(int amountOil, int speed);
    abstract void oilChange(int amountOil);

}

