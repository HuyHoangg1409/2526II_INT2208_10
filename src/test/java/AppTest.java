import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void TestInvalidInput() {
        assertEquals("Invalid Input", App.classifyTriangle(0, 50, 50));
        assertEquals("Invalid Input", App.classifyTriangle(101, 50, 50));
        assertEquals("Invalid Input", App.classifyTriangle(50, 0, 50));
        assertEquals("Invalid Input", App.classifyTriangle(50, 101, 50));
        assertEquals("Invalid Input", App.classifyTriangle(50, 50, 0));
        assertEquals("Invalid Input", App.classifyTriangle(50, 50, 101));
    }

    @Test
    public void TestNotATriangle() {
        assertEquals("Not a Triangle", App.classifyTriangle(10, 20, 50));
        assertEquals("Not a Triangle", App.classifyTriangle(1, 2, 3));
    }

    @Test
    public void TestEquiLateral() {
        assertEquals("Equilateral", App.classifyTriangle(50, 50, 50));
        assertEquals("Equilateral", App.classifyTriangle(100, 100, 100));
    }

    @Test
    public void TestIsoSceles() {
        assertEquals("Isosceles", App.classifyTriangle(50, 50, 40));
        assertEquals("Isosceles", App.classifyTriangle(50, 40, 50));
        assertEquals("Isosceles", App.classifyTriangle(40, 50, 50));
    }

    @Test
    public void TestScalene() {
        assertEquals("Scalene", App.classifyTriangle(3, 4, 5));
        assertEquals("Scalene", App.classifyTriangle(98, 99, 100));
    }

}
