package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carName;
    private int distince;

    public Car () {}

    public Car (String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getDistince() {
        return distince;
    }

    public void setDistince(int distince) {
        this.distince = distince;
    }

    @Override
    public String toString() {
        return this.carName + " " + this.distince;
    }

    public List<Car> addCars (String input) {
        String [] carNames = input.split(",");
        List<Car> car = new ArrayList<>();

        for (int i = 0; i < carNames.length; i++) {
            car.add(checkCarName(carNames[i]));
        }

        car = removeNullFromList(car);

        return car;
    }

    public Car checkCarName (String carName) {
        if (carName.length() > 5) {
            return null;
        }
        return new Car(carName);
    }

    public List<Car> removeNullFromList (List<Car> car) {
        while(car.remove(null)){
        }
        return car;
    }
    
    public String imageDistince (int distince) {
        String result = "";
        for (int i = 0; i < distince; i++) {
            result +="-";
        }
        return result;
    }
}
