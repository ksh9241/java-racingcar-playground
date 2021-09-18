package pair_programing;

public class CarName {
    private String carName;
    static int MAX = 5;

    public CarName () {}

    public CarName (String name) throws Exception{
        if (checkCarName(name)) {
            this.carName = name;
        }
    }

    public static boolean checkCarName(String name) throws Exception {
        if (name.length() > 5) {
            throw new Exception("자동차 이름은 5글자를 초과할 수 없습니다.");
        }
        return true;
    }

    @Override
    public String toString() {
        return carName;
    }
}
