package pair_programing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarNameTest {
    String name;
    CarName carName;

    @BeforeEach
    void init() {
        name = "pobi";
        carName = new CarName();
    }

    @Test
    void checkCarName_success() throws Exception {
        boolean check = carName.checkCarName(name);
        assertThat(check).isTrue();
    }

    @Test
    @DisplayName("글자 수 초과 시 Exception 반환")
    void checkCarName_fail() {
        assertThatThrownBy(() -> {
            new Car("123456");
        }).isInstanceOf(Exception.class);
    }
}
