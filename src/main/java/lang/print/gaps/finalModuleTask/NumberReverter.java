package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int revertNumber = 0;
        for(;number!= 0; number = number / 10 ){
            int revers = number % 10;
            revertNumber = revertNumber * 10 + revers;
        }
        System.out.println(revertNumber);
    }
}
