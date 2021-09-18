package pair_programing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void init () throws Exception {
        car = new Car("test");
    }

    @Test
    void 이동테스트() {
        car.Moving();
        assertThat(car.getDistance()).isEqualTo(1);
    }
}
