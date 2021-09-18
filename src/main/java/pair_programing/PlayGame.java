package pair_programing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class PlayGame {

    public static List<Car> settingGame(String input) {
        String[] names = input.split(",");
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            try {
                list.add(new Car(names[i]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    static boolean moveAndStop(int randomNum) {
        return randomNum >= 4;
    }

    public static List<Car> playGame(List<Car> carList, int racingCount) {
        for (int i = 0; i < racingCount; i++) {
            racingInfo(carList);
        }
        return carList;
    }

    public static void racingInfo (List<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            if (moveAndStop((int) Math.ceil(Math.random() * 9))) {
                carList.get(i).Moving();
            }
        }

        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            System.out.println(car.getName() + " : " + changeCharByDistance(car.getDistance()));
        }
        System.out.println();
    }

    static String changeCharByDistance(int distance) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < distance; i++) {
            result.append("-");
        }
        return result.toString();
    }

    // 우승자 구하는 로직 
    public static void victory(List<Car> carList) {
        List<Car> sortList = carList.stream().sorted(Comparator.comparing(Car::getDistance).reversed()).collect(toList());
        String names = "";
        for (int i = 0; i < sortList.size() - 1; i++) {
            names += sortList.get(i).getName()+", ";
            if (sortList.get(i).getDistance() != sortList.get(i + 1).getDistance()) { // 메시지로 보내서 처리하게끔 리팩토링하기
                break;
            }
        }

        System.out.println(names.substring(0, names.length() - 2) + "가 최종 우승했습니다.");
    }
}
