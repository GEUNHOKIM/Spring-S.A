package geunhokim.Bus;

class TransitMain {

    public static void main(String[] args) {

        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);

        bus1.passengerRiding(2);

        bus1.oilChange(-50);

        bus1.stateChange(bus1.amountOil);

        bus1.oilChange(10);

        bus1.stateChange(bus1.amountOil);

        bus1.passengerRiding(45);

        bus1.passengerRiding(5);

        bus1.oilChange(-55);

        bus1.busState(bus1.state);


    }

}
