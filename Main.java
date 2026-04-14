abstract class Vehicle {
    String color;
    int speed;

    abstract void accelerate();
    abstract void stop();
    abstract void gas();
}

interface Automobile {
    int NUM_WHEELS = 4;
    void openDoors();
    void turnOnWipers();
}

class Motorcycle extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("The motorcycle speeds up.");
    }

    @Override
    void stop() {
        System.out.println("The motorcycle stops.");
    }

    @Override
    void gas() {
        System.out.println("Refuelling the motorcycle.");
    }
}

class Bus extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("The bus speeds up.");
    }

    @Override
    void stop() {
        System.out.println("The bus stops.");
    }

    @Override
    void gas() {
        System.out.println("Refuelling the bus");
    }
}

class Sedan extends Vehicle implements Automobile {
    @Override
    void accelerate() {
        System.out.println("The Sedan speeds up.");
    }

    @Override
    void stop() {
        System.out.println("The Sedan stops.");
    }

    @Override
    void gas() {
        System.out.println("Refuelling the Sedan.");
    }

    @Override
    public void openDoors() {
        System.out.println("Opening 4 doors.");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("Sedan wipers turned on.");
    }

    void accelerate(int speed) {
        System.out.println("The Sedan accelerates to " + speed + " km/h.");
    }
}

class SportsCar extends Vehicle implements Automobile {
    @Override
    void accelerate() {
        System.out.println("The sports car speeds up.");
    }

    @Override
    void stop() {
        System.out.println("The sports car stops.");
    }

    @Override
    void gas() {
        System.out.println("Refuelling the sports car.");
    }

    @Override
    public void openDoors() {
        System.out.println("Opening 2 doors.");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("sports car wipers turned on.");
    }
}

public class Main {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan();
        mySedan.accelerate(); 
        mySedan.accelerate(120); 
    }
}