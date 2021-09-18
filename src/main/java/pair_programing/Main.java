package pair_programing;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 이름을 입력하세요");
        String input = sc.nextLine();

        System.out.println("경기 횟수를 입력하세요");
        int count = sc.nextInt();

        List<Car> carList = PlayGame.settingGame(input);

        carList = PlayGame.playGame(carList, count);
        PlayGame.victory(carList);

    }
}
