import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TriangleTests {
    @Test
    @Disabled("Первая позитивная проверка")
    void positiveSquareCalcTest1() throws Exception {
        double result = Trangle.geroneSquare(9, 8, 7);
        Assertions.assertEquals(26.832815729997478, result);
    }

    @Test
    @DisplayName("Вторая позитивная проверка")
    void positiveSquareCalcTest2() throws Exception {
        double result = Trangle.geroneSquare(3, 4, 5);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Третья позитивная проверка")
    void positiveSquareCalcTest3() throws Exception {
        double result = Trangle.geroneSquare(11, 7, 9);
        Assertions.assertEquals(31.419540098480116, result);
    }





}