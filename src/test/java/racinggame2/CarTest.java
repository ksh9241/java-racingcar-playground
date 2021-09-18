package racinggame2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private static Car car;
    private final String INPUT =  "pobi,crong,honux,123456";

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void _레이싱카생성이름길이체크_실패() {
        boolean check = car.checkNameLength("123456");
        assertThat(check).isTrue();
    }

    @Test
    void _레이싱카생성이름길이체크_성공() {
        boolean check = car.checkNameLength("12345");
        assertThat(check).isTrue();
    }
    
    @Test
    void _레이싱카생성() {
        List<Car> cars = car.addCars(INPUT);

        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    void _포지션값변경() {
        car.changePosition(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
