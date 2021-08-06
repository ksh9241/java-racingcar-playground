package Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    private Calculator cal;
//    @BeforeEach
//    void setUp () {
//        cal = new Calculator("1:3");
//    }

    @Test
    void 널처리() {
        cal = new Calculator(null);
        int result = this.cal.plus();
        assertThat(result).isEqualTo(0);
    }

    @Test
    void 숫자하나() {
        cal = new Calculator("1");
        int result = this.cal.plus();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void 다중숫자() {
        cal = new Calculator("1,3");
        int result = this.cal.plus();
        assertThat(result).isEqualTo(4);
    }

    @Test
    void 콜론구분자() {
        cal = new Calculator("1:3");
        int result = this.cal.plus();
        assertThat(result).isEqualTo(4);
    }

    @Test
    void 쉼표또는콜론구분자() {
        cal = new Calculator("1:3,1");
        int result = this.cal.plus();
        int check = 5;
        assertThat(result).isEqualTo(check);
    }

    @Test
    void 마이너스값예외처리() {
        cal = new Calculator("-1:3,1");
        assertThatThrownBy(() -> {throw new NullPointerException();}).isExactlyInstanceOf(NullPointerException.class);
    }

    @Test
    void 리스트테스트() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        assertThat(list).hasSize(3);
    }

    @Test
    void 리스트_요소테스트() {
        // 위치에 맞는 객체를 테스트 한다.
        List<Object> list = new ArrayList<>();
        String a = "";
        int b = 1;
        list.add(a);
        list.add(b);

        assertThat(list).containsExactly(a, b);
    }
}
