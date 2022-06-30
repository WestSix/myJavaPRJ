class Car2{
    String color;
    int speed;
    void upSpeed(int value){
        speed = speed + value;
    }
    void downSpeed(int value){
        speed = speed - value;
    }
}

class Sedan2 extends Car2{
    int seatNum;
    int getSeatNum() {
        return seatNum;
    }
}

class Truck2 extends Car2{
    int capacity;
    int getCapacity() {
        return capacity;
    }
}

public class Final2 {
    public static void main(String[] args) {

        Sedan2 sedan2 = new Sedan2();
        Truck2 truck2 = new Truck2();

        sedan2.upSpeed(300);
        truck2.upSpeed(100);

        sedan2.seatNum = 5;
        truck2.capacity = 50;

        System.out.println("자동차의 속도는 " + sedan2.speed + "km 이고, 좌석수는 " + sedan2.getSeatNum() + "개 이다.");
        System.out.println("트럭의 속도는 " + truck2.speed + "km 이고, 적재량은 " + truck2.getCapacity() + "개 이다.");

    }
}
