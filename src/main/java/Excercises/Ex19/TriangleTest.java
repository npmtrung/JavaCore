package Excercises.Ex19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Triangle Unit Test")
class TriangleTest {

    //Tính chu vi tam giác vuông
    @Test
    @DisplayName("Check calculatePerimeter function")
    void checkCalculatePerimeter1() {
        Triangle tg = new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0));
        double actualPerimeter1 = tg.calculatePerimeter();
        double expectedPerimeter1 = 12;
        Assertions.assertEquals(actualPerimeter1, expectedPerimeter1);
    }

    //Tính chu vi tam giác vuông cân
    @Test
    @DisplayName("Check calculatePerimeter function")
    void checkCalculatePerimeter2() {
        Triangle tg = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
        double actualPerimeter2 = tg.calculatePerimeter();
        double expectedPerimeter2 = 3.414213562373095;
        Assertions.assertEquals(actualPerimeter2, expectedPerimeter2);
    }
}

