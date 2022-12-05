package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int digitsSumCalc = 0;
        int digit = 0;
        while(number > 0){
            digit = number % 10;
            digitsSumCalc= digitsSumCalc + digit;
            number = number/10;
        }
        System.out.println(digitsSumCalc);
    }
}
