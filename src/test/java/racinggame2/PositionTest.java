package racinggame2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    private static Position position;
    private static int value = 5;

    @BeforeEach
    void setUp () {
       position = new Position();
    }

    @Test
    void move_fail() {
      this.position.move(value);
      assertThat(this.position.getPosition()).isEqualTo(0);
    }
    
    @Test
    void move_success() {
        this.position.move(value);
        assertThat(this.position.getPosition()).isEqualTo(1);
    }
}
