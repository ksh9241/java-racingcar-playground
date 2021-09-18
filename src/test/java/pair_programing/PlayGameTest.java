package pair_programing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayGameTest {
    static int randomNum;
    PlayGame game;
    Car car;
    String input;
    int racingCount;

    @BeforeEach
    void init () {
        randomNum = 4;
        game = new PlayGame();
        car = new Car();
        input = "pobi,crong,honux,123456,1234";
        racingCount = 5;
    }
    
    @Test
    void 이동() {
        boolean check = game.moveAndStop(randomNum);
        assertThat(check).isTrue();
    }
    
    @Test
    void 스탑() {
        boolean check = game.moveAndStop(randomNum - 1);
        assertThat(check).isFalse();
    }
    
    @Test
    void 게임_세팅() {
        List<Car> list = PlayGame.settingGame(input);
        assertThat(list.size()).isEqualTo(4);
    }

    @Test
    void 거리문자로_변환() {
        String distance = game.changeCharByDistance(5);
        assertThat(distance).isEqualTo("-----");
    }
    
    @Test
    void 게임실행() {
        List<Car> list = game.playGame(game.settingGame(input), racingCount);
    }

    @Test
    void 결과() {
        game.victory(game.playGame(game.settingGame(input), racingCount));
    }
}
