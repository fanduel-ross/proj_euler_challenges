import euler_problem_1.EulerProblem1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerProj1Tests {

    EulerProblem1 euler1 = new EulerProblem1();

    @Test
    public void multipleSumTest() {
        assertEquals(233168, euler1.multiplesSolution(1000));
    }
}
