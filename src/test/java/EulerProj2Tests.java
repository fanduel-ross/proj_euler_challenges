
import euler_problem_2.EulerProblem2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerProj2Tests {
    EulerProblem2 euler2 = new EulerProblem2();

    @Test
    public void fibonacciTest() {
        assertEquals(4613732, euler2.fibonacciSeq(4e6));
    }

}
