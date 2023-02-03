package geunhokim.Bus;

public class Bus extends Transit {

    public Bus(int busNumber){
        this.passengerMaximum = 30;
        this.busNumber = busNumber;
        this.state = "운행";
        this.charge = 1000;
        System.out.println(busNumber+ "번 버스객체 만들어짐!");
    }


    @Override
    void run() {
        state = "운행";
    }

    @Override
    void stateChange(int amountOil) {

        if(state.equals("운행")) {
            state = "차고지행";
            System.out.println("상태 : 차고지행");
        } else{
            state = "운행";
            System.out.println("상태 : 운행");
        }
        if(amountOil < 10) {
            System.out.println("주유가 필요하다");
            state = "차고지행";
            System.out.println("상태 : 차고지행");
        }

    }

    @Override
    void passengerRiding(int passengerNumber){
        if( this.passengerNow + passengerNumber <= this.passengerMaximum && state.equals("운행") ) {
            this.passengerNow += passengerNumber;
            System.out.println("탑승 승객 수 = " + passengerNumber);
            System.out.println("잔여 승객 수 = " + ( this.passengerMaximum - this.passengerNow) );
            System.out.println("요금 확인  = " + ( this.charge * this.passengerNow) );
        } else {
            System.out.println("최대 승객수를 초과했습니다.");
        }
    }

    @Override
    void PassengerNow(int passengerNow) {

    }

    @Override
    void busState(String state) {
        if(state.equals("운행")) {
            System.out.println(" 상태 = 운행중");
        } else {
            System.out.println("상태 = 차고지행");
        }
    }

    @Override
    void speedChange(int amountOil, int speed) {

        if(amountOil >= 10) {
            speedNow = speedNow + speed;
        } else {
            System.out.println("주유량을 확인 해주세요");
        }
    }

    @Override
    void oilChange(int amountOil) {
        this.amountOil += amountOil;
        System.out.println("주유량 : " + this.amountOil);
        if(this.amountOil < 10) {
            this.state = "차고지행";
            System.out.println("주유가 필요합니다");
        }
    }

}