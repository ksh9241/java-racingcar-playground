package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private List<Car> cars = new ArrayList<>();
    private String input;
    private Car car;

    @BeforeEach
    void setUp () {
        this.car = new Car();
        this.input = "pobi,crong,honux,sixlen,1234567";
    }

    @Test
    void 레이싱카_등록하기() {
        this.cars = car.addCars(input);
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    void 입력값조건처리하기() {
        Car result = car.checkCarName("12345");
        assertThat(result).isNotNull();
    }

    @Test
    void 리스트널값제거하기() {
        this.cars.add(null);
        this.cars.add(null);
        this.cars.add(new Car("test"));
        this.cars = car.removeNullFromList(this.cars);
        assertThat(this.cars.size()).isEqualTo(1);
    }
}
