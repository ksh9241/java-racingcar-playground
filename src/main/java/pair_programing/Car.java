package pair_programing;

public class Car {
    private CarName name;
    private int distance;

    public Car() { }

    public Car(String name) throws Exception{
        this.name = new CarName(name);
        this.distance = 0;
    }

    public CarName getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void Moving () {
        this.distance += 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", distance=" + distance +
                '}';
    }
}
