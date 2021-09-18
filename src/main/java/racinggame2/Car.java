package racinggame2;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String name;
    private Position position;

    public Car() {
        this.position = new Position();
    }

    public Car(String name) {
        this.name = name;
        this.position = new Position();
    }

    public Car (String name, int val) {
        this.name = name;
        this.position = new Position(val);
    }

    public boolean checkNameLength(String carName) {
        if (carName.length() < 6) {
            return true;
        }
        return false;
    }

    public List<Car> addCars(String input) {
        List<Car> cars = new ArrayList<>();
        String [] carNames = input.split(",");

        for (int i = 0; i < carNames.length; i++) {
            if (checkNameLength(carNames[i])) {
                cars.add(new Car(carNames[i]));
            }
        }

        return cars;
    }

    public void changePosition(int val) {
        this.position.move(val);
        System.out.print(this.position);
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }

    public Position getPosition() {
        return this.position;
    }
}
