package euler_problem_2;

public class EulerProblem2 {

    public boolean divisibleBy(int num1, int num2) {
        return num1 % num2 == 0;
    }

    public int fibonacciSeq(double upperLimit) {
        int value1 = 0;
        int value2 = 1;
        int sum = 0;

        while (value1 < upperLimit) {
            int value3 = value1;
            value1 = value2;
            value2 += value3;
            if (divisibleBy(value2, 2)) {
                sum += value2;
            }

        }

        return sum;

    }
}
