package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayGameTest {
    private PlayGame play;
    private List<Car> cars;
    private String input = "pobi,crong,honux,sixlen,1234567";
    private int count = 5;

    @BeforeEach
    void setUp () {
        play = new PlayGame();
        cars = new Car().addCars(this.input);
    }

    @Test
    void _0혹은1값반환하기() {
        int distince = play.randomDistinceValue();
        assertThat(distince).isEqualTo(1);
    }
    
    @Test
    void 랜덤값추가하기() {
        this.cars = play.addDistince(this.cars);
        List<Integer> result = cars.stream().filter(d -> d.getDistince() > 0)
                                    .map(Car::getDistince)
                                    .collect(Collectors.toList());
        assertThat(result).isNotNull();
    }

    @Test
    void 게임실행() {
        String result = play.playGame(cars, count);
        assertThat(result).isEqualTo("우승했습니다.");
    }
}
