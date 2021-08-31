package euler_problem_1;

public class EulerProblem1 {

    public boolean divisibleBy(int num1, int num2){
        return num1 % num2 == 0;
    }
    public int multiplesSolution(int numberToSum){
        int sum = 0;
        for (int i = 0; i < numberToSum; i++) {
            if (divisibleBy(i, 3) ) {
              sum += i;
            } else if (divisibleBy(i, 5)){
               sum += i;
            }
        }
        return sum;
}
    }
