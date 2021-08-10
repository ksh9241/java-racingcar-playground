package racinggame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayGame {
    public int randomDistinceValue() {
        return (int) Math.ceil(Math.random() * 2 -1);
    }

    public List<Car> addDistince(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).setDistince(cars.get(i).getDistince() + randomDistinceValue());
        }
        return cars;
    }

    public String playGame(List<Car> cars, int count) {
        System.out.println("실행결과");
        for (int i = 0; i < count; i++) {
            cars = addDistince(cars);
            playGameInfo(cars);
            System.out.println();
        }
        String winner = checkWinner(cars);
        System.out.println(winner);
        return "우승했습니다.";
    }

    // 에러 수정해야됨.
    private static String checkWinner (List<Car> cars) {
        List<Car> result = cars.stream().sorted(Comparator.comparing(Car::getDistince).reversed()).collect(Collectors.toList());
        int idx = 0;
        for (int i = 0; i < result.size() -1; i++) {
            if(result.get(i).getDistince() != result.get(i+1).getDistince()) {
                idx = i;
                break;
            }
        }
        String names = "";
        for (int i = 0; i < idx; i++) {
            names += result.get(i).getCarName() + ",";
        }
        System.out.print("names=="+names);
        return names.substring(0, names.length()-1);
    }

    private static void playGameInfo (List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car.getCarName()+" : "+ car.imageDistince(car.getDistince()));
        }
    }
}
